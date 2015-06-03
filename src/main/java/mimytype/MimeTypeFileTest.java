package mimytype;

import javax.activation.FileTypeMap;
import javax.activation.MimetypesFileTypeMap;

/**
 * @author Alexander Andrinko
 */
public class MimeTypeFileTest {

    public static void main(String[] args) {
        FileTypeMap fileTypeMap = MimetypesFileTypeMap.getDefaultFileTypeMap();
        System.out.println(fileTypeMap.getContentType("txt"));
    }

}
