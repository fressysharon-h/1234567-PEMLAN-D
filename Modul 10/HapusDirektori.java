import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        var dir = new File("C:/Users/FRESSY/OneDrive/Documents/LAPRAK PEMLAN/MODUL 10/folder-test");

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Direktori tidak ditemukan");
            return;
        }

        for (File f : dir.listFiles()) {
            f.delete();
        }

        var result = dir.delete();
        System.out.println(result ? "Berhasil menghapus direktori" : "Gagal menghapus direktori");
    }
}