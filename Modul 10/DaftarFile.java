import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {
        var dir = new File("C:/Users/FRESSY/OneDrive/Documents/LAPRAK PEMLAN/MODUL 10");

        if (dir.exists() && dir.isDirectory()) {
            for (File f : dir.listFiles()) {
                if (f.isFile())
                    System.out.println(f.getName());
            }
        } else {
            System.out.println("Direktori tidak ditemukan");
        }
    }
}