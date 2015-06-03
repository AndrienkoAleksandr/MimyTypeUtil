package mimytype;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Alexander Andrienko
 */
public class MimeTypeUtils {

    public MimeTypeUtils() {
    }

    public String getMemoTypeByExtension(String extension) {
        return memoTypeMap.get(extension);
    }



    private static Map<String, String> memoTypeMap;

    static {
        memoTypeMap = new ConcurrentHashMap<>();
        memoTypeMap.put("123", "application/vnd.lotus-1-2-3");
        memoTypeMap.put("3ds", "image/x-3ds");
        memoTypeMap.put("669", "audio/x-mod");
        memoTypeMap.put("a", "application/x-archive");
        memoTypeMap.put("abw", "application/x-abiword");
        memoTypeMap.put("ac3", "audio/ac3");
        memoTypeMap.put("adb", "text/x-adasrc");
        memoTypeMap.put("ads", "text/x-adasrc");
        memoTypeMap.put("afm", "application/x-font-afm");
        memoTypeMap.put("ag", "image/x-applix-graphics");
        memoTypeMap.put("ai", "application/illustrator");
        memoTypeMap.put("aif", "audio/x-aiff");
        memoTypeMap.put("aifc", "audio/x-aiff");
        memoTypeMap.put("aiff", "audio/x-aiff");
        memoTypeMap.put("al", "application/x-perl");
        memoTypeMap.put("arj", "application/x-arj");
        memoTypeMap.put("as", "application/x-applix-spreadsheet");
        memoTypeMap.put("asc", "text/plain");
        memoTypeMap.put("asf", "video/x-ms-asf");
        memoTypeMap.put("asp", "application/x-asp");
        memoTypeMap.put("asx", "video/x-ms-asf");
        memoTypeMap.put("au", "audio/basic");
        memoTypeMap.put("avi", "video/x-msvideo");
        memoTypeMap.put("aw", "application/x-applix-word");
        memoTypeMap.put("bak", "application/x-trash");
        memoTypeMap.put("bcpio", "application/x-bcpio");
        memoTypeMap.put("bdf", "application/x-font-bdf");
        memoTypeMap.put("bib", "text/x-bibtex");
        memoTypeMap.put("bin", "application/octet-stream");
        memoTypeMap.put("blend", "application/x-blender");
        memoTypeMap.put("blender", "application/x-blender");
        memoTypeMap.put("bmp", "image/bmp");
        memoTypeMap.put("bz", "application/x-bzip");
        memoTypeMap.put("bz2", "application/x-bzip");
        memoTypeMap.put("c", "text/x-csrc");
        memoTypeMap.put("c++", "text/x-c++src");
        memoTypeMap.put("cc", "text/x-c++src");
        memoTypeMap.put("cdf", "application/x-netcdf");
        memoTypeMap.put("cdr", "application/vnd.corel-draw");
        memoTypeMap.put("cer", "application/x-x509-ca-cert");
        memoTypeMap.put("cert", "application/x-x509-ca-cert");
        memoTypeMap.put("cgi", "application/x-cgi");
        memoTypeMap.put("cgm", "image/cgm");
        memoTypeMap.put("chrt", "application/x-kchart");
        memoTypeMap.put("class", "application/x-java");
        memoTypeMap.put("cls", "text/x-tex");
        memoTypeMap.put("cpio", "application/x-cpio");
        memoTypeMap.put("cpp", "text/x-c++src");
        memoTypeMap.put("crt", "application/x-x509-ca-cert");
        memoTypeMap.put("cs", "text/x-csharp");
        memoTypeMap.put("csh", "application/x-shellscript");
        memoTypeMap.put("css", "text/css");
        memoTypeMap.put("cssl", "text/css");
        memoTypeMap.put("csv", "text/x-comma-separated-values");
        memoTypeMap.put("cur", "image/x-win-bitmemoTypeMap");
        memoTypeMap.put("cxx", "text/x-c++src");
        memoTypeMap.put("dat", "video/mpeg");
        memoTypeMap.put("dbf", "application/x-dbase");
        memoTypeMap.put("dc", "application/x-dc-rom");
        memoTypeMap.put("dcl", "text/x-dcl");
        memoTypeMap.put("dcm", "image/x-dcm");
        memoTypeMap.put("deb", "application/x-deb");
        memoTypeMap.put("der", "application/x-x509-ca-cert");
        memoTypeMap.put("desktop", "application/x-desktop");
        memoTypeMap.put("dia", "application/x-dia-diagram");
        memoTypeMap.put("diff", "text/x-patch");
        memoTypeMap.put("djv", "image/vnd.djvu");
        memoTypeMap.put("djvu", "image/vnd.djvu");
        memoTypeMap.put("doc", "application/vnd.ms-word");
        memoTypeMap.put("dsl", "text/x-dsl");
        memoTypeMap.put("dtd", "text/x-dtd");
        memoTypeMap.put("dvi", "application/x-dvi");
        memoTypeMap.put("dwg", "image/vnd.dwg");
        memoTypeMap.put("dxf", "image/vnd.dxf");
        memoTypeMap.put("egon", "application/x-egon");
        memoTypeMap.put("el", "text/x-emacs-lisp");
        memoTypeMap.put("eps", "image/x-eps");
        memoTypeMap.put("epsf", "image/x-eps");
        memoTypeMap.put("epsi", "image/x-eps");
        memoTypeMap.put("etheme", "application/x-e-theme");
        memoTypeMap.put("etx", "text/x-setext");
        memoTypeMap.put("exe", "application/x-ms-dos-executable");
        memoTypeMap.put("ez", "application/andrew-inset");
        memoTypeMap.put("f", "text/x-fortran");
        memoTypeMap.put("fig", "image/x-xfig");
        memoTypeMap.put("fits", "image/x-fits");
        memoTypeMap.put("flac", "audio/x-flac");
        memoTypeMap.put("flc", "video/x-flic");
        memoTypeMap.put("fli", "video/x-flic");
        memoTypeMap.put("flw", "application/x-kivio");
        memoTypeMap.put("fo", "text/x-xslfo");
        memoTypeMap.put("g3", "image/fax-g3");
        memoTypeMap.put("gb", "application/x-gameboy-rom");
        memoTypeMap.put("gcrd", "text/x-vcard");
        memoTypeMap.put("gen", "application/x-genesis-rom");
        memoTypeMap.put("gg", "application/x-sms-rom");
        memoTypeMap.put("gif", "image/gif");
        memoTypeMap.put("glade", "application/x-glade");
        memoTypeMap.put("gmo", "application/x-gettext-translation");
        memoTypeMap.put("gnc", "application/x-gnucash");
        memoTypeMap.put("gnucash", "application/x-gnucash");
        memoTypeMap.put("gnumeric", "application/x-gnumeric");
        memoTypeMap.put("gra", "application/x-graphite");
        memoTypeMap.put("gsf", "application/x-font-type1");
        memoTypeMap.put("gtar", "application/x-gtar");
        memoTypeMap.put("gz", "application/x-gzip");
        memoTypeMap.put("h", "text/x-chdr");
        memoTypeMap.put("h++", "text/x-chdr");
        memoTypeMap.put("hdf", "application/x-hdf");
        memoTypeMap.put("hh", "text/x-c++hdr");
        memoTypeMap.put("hp", "text/x-chdr");
        memoTypeMap.put("hpgl", "application/vnd.hp-hpgl");
        memoTypeMap.put("hs", "text/x-haskell");
        memoTypeMap.put("htm", "text/html");
        memoTypeMap.put("html", "text/html");
        memoTypeMap.put("icb", "image/x-icb");
        memoTypeMap.put("ico", "image/x-ico");
        memoTypeMap.put("ics", "text/calendar");
        memoTypeMap.put("idl", "text/x-idl");
        memoTypeMap.put("ief", "image/ief");
        memoTypeMap.put("iff", "image/x-iff");
        memoTypeMap.put("ilbm", "image/x-ilbm");
        memoTypeMap.put("iso", "application/x-cd-image");
        memoTypeMap.put("it", "audio/x-it");
        memoTypeMap.put("jar", "application/x-jar");
        memoTypeMap.put("java", "text/x-java");
        memoTypeMap.put("jng", "image/x-jng");
        memoTypeMap.put("jp2", "image/jpeg2000");
        memoTypeMap.put("jpe", "image/jpeg");
        memoTypeMap.put("jpeg", "image/jpeg");
        memoTypeMap.put("jpg", "image/jpeg");
        memoTypeMap.put("jpr", "application/x-jbuilder-project");
        memoTypeMap.put("jpx", "application/x-jbuilder-project");
        memoTypeMap.put("js", "application/x-javascript");
        memoTypeMap.put("karbon", "application/x-karbon");
        memoTypeMap.put("kdelnk", "application/x-desktop");
        memoTypeMap.put("kfo", "application/x-kformula");
        memoTypeMap.put("kil", "application/x-killustrator");
        memoTypeMap.put("kon", "application/x-kontour");
        memoTypeMap.put("kpm", "application/x-kpovmodeler");
        memoTypeMap.put("kpr", "application/x-kpresenter");
        memoTypeMap.put("kpt", "application/x-kpresenter");
        memoTypeMap.put("kra", "application/x-krita");
        memoTypeMap.put("ksp", "application/x-kspread");
        memoTypeMap.put("kud", "application/x-kugar");
        memoTypeMap.put("kwd", "application/x-kword");
        memoTypeMap.put("kwt", "application/x-kword");
        memoTypeMap.put("la", "application/x-shared-library-la");
        memoTypeMap.put("lha", "application/x-lha");
        memoTypeMap.put("lhs", "text/x-literate-haskell");
        memoTypeMap.put("lhz", "application/x-lhz");
        memoTypeMap.put("log", "text/x-log");
        memoTypeMap.put("ltx", "text/x-tex");
        memoTypeMap.put("lwo", "image/x-lwo");
        memoTypeMap.put("lwob", "image/x-lwo");
        memoTypeMap.put("lws", "image/x-lws");
        memoTypeMap.put("lyx", "application/x-lyx");
        memoTypeMap.put("lzh", "application/x-lha");
        memoTypeMap.put("lzo", "application/x-lzop");
        memoTypeMap.put("m", "text/x-objcsrc");
        memoTypeMap.put("m15", "audio/x-mod");
        memoTypeMap.put("m3u", "audio/x-mpegurl");
        memoTypeMap.put("man", "application/x-troff-man");
        memoTypeMap.put("md", "application/x-genesis-rom");
        memoTypeMap.put("me", "text/x-troff-me");
        memoTypeMap.put("mgp", "application/x-magicpoint");
        memoTypeMap.put("mid", "audio/midi");
        memoTypeMap.put("midi", "audio/midi");
        memoTypeMap.put("mif", "application/x-mif");
        memoTypeMap.put("mkv", "application/x-matroska");
        memoTypeMap.put("mm", "text/x-troff-mm");
        memoTypeMap.put("mml", "text/mathml");
        memoTypeMap.put("mng", "video/x-mng");
        memoTypeMap.put("moc", "text/x-moc");
        memoTypeMap.put("mod", "audio/x-mod");
        memoTypeMap.put("moov", "video/quicktime");
        memoTypeMap.put("mov", "video/quicktime");
        memoTypeMap.put("movie", "video/x-sgi-movie");
        memoTypeMap.put("mp2", "video/mpeg");
        memoTypeMap.put("mp3", "audio/x-mp3");
        memoTypeMap.put("mpe", "video/mpeg");
        memoTypeMap.put("mpeg", "video/mpeg");
        memoTypeMap.put("mpg", "video/mpeg");
        memoTypeMap.put("ms", "text/x-troff-ms");
        memoTypeMap.put("msod", "image/x-msod");
        memoTypeMap.put("msx", "application/x-msx-rom");
        memoTypeMap.put("mtm", "audio/x-mod");
        memoTypeMap.put("n64", "application/x-n64-rom");
        memoTypeMap.put("nc", "application/x-netcdf");
        memoTypeMap.put("nes", "application/x-nes-rom");
        memoTypeMap.put("nsv", "video/x-nsv");
        memoTypeMap.put("o", "application/x-object");
        memoTypeMap.put("obj", "application/x-tgif");
        memoTypeMap.put("oda", "application/oda");
        memoTypeMap.put("ogg", "application/ogg");
        memoTypeMap.put("old", "application/x-trash");
        memoTypeMap.put("oleo", "application/x-oleo");
        memoTypeMap.put("p", "text/x-pascal");
        memoTypeMap.put("p12", "application/x-pkcs12");
        memoTypeMap.put("p7s", "application/pkcs7-signature");
        memoTypeMap.put("pas", "text/x-pascal");
        memoTypeMap.put("patch", "text/x-patch");
        memoTypeMap.put("pbm", "image/x-portable-bitmemoTypeMap");
        memoTypeMap.put("pcd", "image/x-photo-cd");
        memoTypeMap.put("pcf", "application/x-font-pcf");
        memoTypeMap.put("pcl", "application/vnd.hp-pcl");
        memoTypeMap.put("pdb", "application/vnd.palm");
        memoTypeMap.put("pdf", "application/pdf");
        memoTypeMap.put("pem", "application/x-x509-ca-cert");
        memoTypeMap.put("perl", "application/x-perl");
        memoTypeMap.put("pfa", "application/x-font-type1");
        memoTypeMap.put("pfb", "application/x-font-type1");
        memoTypeMap.put("pfx", "application/x-pkcs12");
        memoTypeMap.put("pgm", "image/x-portable-graymemoTypeMap");
        memoTypeMap.put("pgn", "application/x-chess-pgn");
        memoTypeMap.put("pgp", "application/pgp");
        memoTypeMap.put("php", "application/x-php");
        memoTypeMap.put("php3", "application/x-php");
        memoTypeMap.put("php4", "application/x-php");
        memoTypeMap.put("pict", "image/x-pict");
        memoTypeMap.put("pict1", "image/x-pict");
        memoTypeMap.put("pict2", "image/x-pict");
        memoTypeMap.put("pl", "application/x-perl");
        memoTypeMap.put("pls", "audio/x-scpls");
        memoTypeMap.put("pm", "application/x-perl");
        memoTypeMap.put("png", "image/png");
        memoTypeMap.put("pnm", "image/x-portable-anymemoTypeMap");
        memoTypeMap.put("po", "text/x-gettext-translation");
        memoTypeMap.put("pot", "text/x-gettext-translation-template");
        memoTypeMap.put("ppm", "image/x-portable-pixmemoTypeMap");
        memoTypeMap.put("pps", "application/vnd.ms-powerpoint");
        memoTypeMap.put("ppt", "application/vnd.ms-powerpoint");
        memoTypeMap.put("ppz", "application/vnd.ms-powerpoint");
        memoTypeMap.put("ps", "application/postscript");
        memoTypeMap.put("psd", "image/x-psd");
        memoTypeMap.put("psf", "application/x-font-linux-psf");
        memoTypeMap.put("psid", "audio/prs.sid");
        memoTypeMap.put("pw", "application/x-pw");
        memoTypeMap.put("py", "application/x-python");
        memoTypeMap.put("pyc", "application/x-python-bytecode");
        memoTypeMap.put("pyo", "application/x-python-bytecode");
        memoTypeMap.put("qif", "application/x-qw");
        memoTypeMap.put("qt", "video/quicktime");
        memoTypeMap.put("qtvr", "video/quicktime");
        memoTypeMap.put("ra", "audio/x-pn-realaudio");
        memoTypeMap.put("ram", "audio/x-pn-realaudio");
        memoTypeMap.put("rar", "application/x-rar");
        memoTypeMap.put("ras", "image/x-cmu-raster");
        memoTypeMap.put("rdf", "text/rdf");
        memoTypeMap.put("rej", "application/x-reject");
        memoTypeMap.put("rgb", "image/x-rgb");
        memoTypeMap.put("rle", "image/rle");
        memoTypeMap.put("rm", "audio/x-pn-realaudio");
        memoTypeMap.put("roff", "application/x-troff");
        memoTypeMap.put("rpm", "application/x-rpm");
        memoTypeMap.put("rss", "text/rss");
        memoTypeMap.put("rtf", "application/rtf");
        memoTypeMap.put("rtx", "text/richtext");
        memoTypeMap.put("s3m", "audio/x-s3m");
        memoTypeMap.put("sam", "application/x-amipro");
        memoTypeMap.put("scm", "text/x-scheme");
        memoTypeMap.put("sda", "application/vnd.stardivision.draw");
        memoTypeMap.put("sdc", "application/vnd.stardivision.calc");
        memoTypeMap.put("sdd", "application/vnd.stardivision.impress");
        memoTypeMap.put("sdp", "application/vnd.stardivision.impress");
        memoTypeMap.put("sds", "application/vnd.stardivision.chart");
        memoTypeMap.put("sdw", "application/vnd.stardivision.writer");
        memoTypeMap.put("sgi", "image/x-sgi");
        memoTypeMap.put("sgl", "application/vnd.stardivision.writer");
        memoTypeMap.put("sgm", "text/sgml");
        memoTypeMap.put("sgml", "text/sgml");
        memoTypeMap.put("sh", "application/x-shellscript");
        memoTypeMap.put("shar", "application/x-shar");
        memoTypeMap.put("siag", "application/x-siag");
        memoTypeMap.put("sid", "audio/prs.sid");
        memoTypeMap.put("sik", "application/x-trash");
        memoTypeMap.put("slk", "text/spreadsheet");
        memoTypeMap.put("smd", "application/vnd.stardivision.mail");
        memoTypeMap.put("smf", "application/vnd.stardivision.math");
        memoTypeMap.put("smi", "application/smil");
        memoTypeMap.put("smil", "application/smil");
        memoTypeMap.put("sml", "application/smil");
        memoTypeMap.put("sms", "application/x-sms-rom");
        memoTypeMap.put("snd", "audio/basic");
        memoTypeMap.put("so", "application/x-sharedlib");
        memoTypeMap.put("spd", "application/x-font-speedo");
        memoTypeMap.put("sql", "text/x-sql");
        memoTypeMap.put("src", "application/x-wais-source");
        memoTypeMap.put("stc", "application/vnd.sun.xml.calc.template");
        memoTypeMap.put("std", "application/vnd.sun.xml.draw.template");
        memoTypeMap.put("sti", "application/vnd.sun.xml.impress.template");
        memoTypeMap.put("stm", "audio/x-stm");
        memoTypeMap.put("stw", "application/vnd.sun.xml.writer.template");
        memoTypeMap.put("sty", "text/x-tex");
        memoTypeMap.put("sun", "image/x-sun-raster");
        memoTypeMap.put("sv4cpio", "application/x-sv4cpio");
        memoTypeMap.put("sv4crc", "application/x-sv4crc");
        memoTypeMap.put("svg", "image/svg+xml");
        memoTypeMap.put("swf", "application/x-shockwave-flash");
        memoTypeMap.put("sxc", "application/vnd.sun.xml.calc");
        memoTypeMap.put("sxd", "application/vnd.sun.xml.draw");
        memoTypeMap.put("sxg", "application/vnd.sun.xml.writer.global");
        memoTypeMap.put("sxi", "application/vnd.sun.xml.impress");
        memoTypeMap.put("sxm", "application/vnd.sun.xml.math");
        memoTypeMap.put("sxw", "application/vnd.sun.xml.writer");
        memoTypeMap.put("sylk", "text/spreadsheet");
        memoTypeMap.put("t", "application/x-troff");
        memoTypeMap.put("tar", "application/x-tar");
        memoTypeMap.put("tcl", "text/x-tcl");
        memoTypeMap.put("tcpalette", "application/x-terminal-color-palette");
        memoTypeMap.put("tex", "text/x-tex");
        memoTypeMap.put("texi", "text/x-texinfo");
        memoTypeMap.put("texinfo", "text/x-texinfo");
        memoTypeMap.put("tga", "image/x-tga");
        memoTypeMap.put("tgz", "application/x-compressed-tar");
        memoTypeMap.put("theme", "application/x-theme");
        memoTypeMap.put("tif", "image/tiff");
        memoTypeMap.put("tiff", "image/tiff");
        memoTypeMap.put("tk", "text/x-tcl");
        memoTypeMap.put("torrent", "application/x-bittorrent");
        memoTypeMap.put("tr", "application/x-troff");
        memoTypeMap.put("ts", "application/x-linguist");
        memoTypeMap.put("tsv", "text/tab-separated-values");
        memoTypeMap.put("ttf", "application/x-font-ttf");
        memoTypeMap.put("txt", "text/plain");
        memoTypeMap.put("tzo", "application/x-tzo");
        memoTypeMap.put("ui", "application/x-designer");
        memoTypeMap.put("uil", "text/x-uil");
        memoTypeMap.put("ult", "audio/x-mod");
        memoTypeMap.put("uni", "audio/x-mod");
        memoTypeMap.put("uri", "text/x-uri");
        memoTypeMap.put("url", "text/x-uri");
        memoTypeMap.put("ustar", "application/x-ustar");
        memoTypeMap.put("vcf", "text/x-vcalendar");
        memoTypeMap.put("vcs", "text/x-vcalendar");
        memoTypeMap.put("vct", "text/x-vcard");
        memoTypeMap.put("vob", "video/mpeg");
        memoTypeMap.put("voc", "audio/x-voc");
        memoTypeMap.put("vor", "application/vnd.stardivision.writer");
        memoTypeMap.put("vpp", "application/x-extension-vpp");
        memoTypeMap.put("wav", "audio/x-wav");
        memoTypeMap.put("wb1", "application/x-quattropro");
        memoTypeMap.put("wb2", "application/x-quattropro");
        memoTypeMap.put("wb3", "application/x-quattropro");
        memoTypeMap.put("wk1", "application/vnd.lotus-1-2-3");
        memoTypeMap.put("wk3", "application/vnd.lotus-1-2-3");
        memoTypeMap.put("wk4", "application/vnd.lotus-1-2-3");
        memoTypeMap.put("wks", "application/vnd.lotus-1-2-3");
        memoTypeMap.put("wmf", "image/x-wmf");
        memoTypeMap.put("wml", "text/vnd.wap.wml");
        memoTypeMap.put("wmv", "video/x-ms-wmv");
        memoTypeMap.put("wpd", "application/vnd.wordperfect");
        memoTypeMap.put("wpg", "application/x-wpg");
        memoTypeMap.put("wri", "application/x-mswrite");
        memoTypeMap.put("wrl", "model/vrml");
        memoTypeMap.put("xac", "application/x-gnucash");
        memoTypeMap.put("xbel", "application/x-xbel");
        memoTypeMap.put("xbm", "image/x-xbitmemoTypeMap");
        memoTypeMap.put("xcf", "image/x-xcf");
        memoTypeMap.put("xhtml", "application/xhtml+xml");
        memoTypeMap.put("xi", "audio/x-xi");
        memoTypeMap.put("xla", "application/vnd.ms-excel");
        memoTypeMap.put("xlc", "application/vnd.ms-excel");
        memoTypeMap.put("xld", "application/vnd.ms-excel");
        memoTypeMap.put("xll", "application/vnd.ms-excel");
        memoTypeMap.put("xlm", "application/vnd.ms-excel");
        memoTypeMap.put("xls", "application/vnd.ms-excel");
        memoTypeMap.put("xlt", "application/vnd.ms-excel");
        memoTypeMap.put("xlw", "application/vnd.ms-excel");
        memoTypeMap.put("xm", "audio/x-xm");
        memoTypeMap.put("xmi", "text/x-xmi");
        memoTypeMap.put("xml", "text/xml");
        memoTypeMap.put("xpm", "image/x-xpixmemoTypeMap");
        memoTypeMap.put("xsl", "text/x-xslt");
        memoTypeMap.put("xslfo", "text/x-xslfo");
        memoTypeMap.put("xslt", "text/x-xslt");
        memoTypeMap.put("xwd", "image/x-xwindowdump");
        memoTypeMap.put("z", "application/x-compress");
        memoTypeMap.put("zabw", "application/x-abiword");
        memoTypeMap.put("zip", "application/zip");
        memoTypeMap.put("zoo", "application/x-zoo");
    }

    public Collection<String> getAllMemoType() {
        return memoTypeMap.keySet();
    }

    public Collection<String> getAllFileExtensions() {
        return memoTypeMap.values();
    }
}
