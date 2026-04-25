import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Data Manusia ===");

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        Manusia manusia = new Manusia(nama, umur);

        System.out.println("\n=== Output Manusia ===");
        manusia.tampilkanNama();
        manusia.tampilkanUmur();
        manusia.makan();
        manusia.berjalan();
        manusia.bersuara();

        // Objek baru: Hewan
        Hewan hewan = new Hewan();

        System.out.println("\n=== Output Hewan ===");
        hewan.makan();
        hewan.berjalan();
        hewan.bersuara();

        input.close();
    }
}
