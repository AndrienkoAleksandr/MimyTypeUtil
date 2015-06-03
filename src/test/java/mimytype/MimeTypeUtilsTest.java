package mimytype;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MimeTypeUtilsTest {

    private MimeTypeUtils mimeTypeUtils;
    private static final int AMOUNT_THREAD = 40;
    private List<String> extensions = Arrays.asList("txt", "java", "doc", "php", "php3", "php4", "pict", "pl", "png", "ppm");
    private List<String> answers = Arrays.asList("text/plain",
            "text/x-java",
            "application/vnd.ms-word",
            "application/x-php",
            "application/x-php",
            "application/x-php",
            "image/x-pict",
            "application/x-perl",
            "image/png",
            "image/x-portable-pixmemoTypeMap");

    @Before
    public void setUp() {
        mimeTypeUtils = new MimeTypeUtils();
    }

    @Test
    public void test() throws ExecutionException, InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        List<CallableTestThread> callableTestThreads = new ArrayList<>();

        for (int i = 0; i < AMOUNT_THREAD; i++) {
            callableTestThreads.add(new CallableTestThread(countDownLatch));
        }

        ExecutorService service = Executors.newFixedThreadPool(AMOUNT_THREAD);
        countDownLatch.countDown();

        for (CallableTestThread thread: callableTestThreads) {
            service.submit(thread).get();
        }
        service.shutdown();
    }

    private class CallableTestThread implements Callable<Void> {

        private final CountDownLatch countDownLatch;

        CallableTestThread(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public Void call() throws Exception {
            countDownLatch.await();
            for (int i = 0; i < 1000000; i++) {
                Iterator<String> iterator = answers.iterator();
                for (String ext: extensions) {
                    String answer = iterator.next();
                    assertThat(mimeTypeUtils.getMemoTypeByExtension(ext), is(answer));
                }
            }
            return null;
        }
    }

}
