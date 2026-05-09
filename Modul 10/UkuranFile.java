import java.io.File;


public class UkuranFile {
    public static void main(String[] args) {
        var file = new File("test.txt");


        if (file.exists() && file.canRead()) {
            long bytes = file.length();


            if (bytes < 1_048_576) {
                double kb = bytes / 1024.0;
                System.out.printf("Ukuran: %.2f KB%n", kb);
            } else {
                double mb = bytes / 1_048_576.0;
                System.out.printf("Ukuran: %.2f MB%n", mb);
            }
        } else {
            System.out.println("File tidak ada atau tidak bisa dibaca");
        }
    }
}
