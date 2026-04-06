public class Main {
    public static void main(String[] args) {

        // 1. Manusia
        System.out.println("=== Manusia ===");
        System.out.println(new Manusia("A", "111", true, true));
        System.out.println();
        System.out.println(new Manusia("B", "222", false, true));
        System.out.println();
        System.out.println(new Manusia("C", "333", true, false));

        // 2. Mahasiswa
        System.out.println("\n=== Mahasiswa ===");
        System.out.println(new MahasiswaFILKOM("165150600111100", 2.5, "D", "111", true, false));
        System.out.println();
        System.out.println(new MahasiswaFILKOM("165150600111100", 3.2, "E", "111", false, false));
        System.out.println();
        System.out.println(new MahasiswaFILKOM("165150600111100", 3.8, "F", "111", true, false));

        // 3. Pekerja
        System.out.println("\n=== Pekerja ===");
        System.out.println(new Pekerja(1000, 2022, 1, 1, 2, "G", "111", true, true));
        System.out.println();
        System.out.println(new Pekerja(1000, 2015, 1, 1, 0, "H", "111", true, true));
        System.out.println();
        System.out.println(new Pekerja(1000, 2000, 1, 1, 10, "I", "111", true, true));

        // 4. Manager
        System.out.println("\n=== Manager ===");
        System.out.println(new Manager("HRD", 7500, 2009, 1, 1, 3, "J", "111", true, true));
    }
}
