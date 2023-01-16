public class Main {
    public static void main(String[] args) {

        SomutCompressFactory compFactory = new SomutCompressFactory();

        Compressing c1 = new TAR();
        c1.thisCompress();

        Compressing c2 = new RAR();
        c2.thisCompress();

        Compressing c3 = new ZIP();
        c3.thisCompress();

    }
}