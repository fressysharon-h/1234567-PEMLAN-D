public class MainKue {

    static void garis(char c, int n) {
        System.out.println(String.valueOf(c).repeat(n));
    }
    static void judul(String teks) {
        garis('=', 90);
        System.out.printf("  %s%n", teks);
        garis('=', 90);
    }
    static void subjudul(String teks) {
        garis('-', 90);
        System.out.printf("  * %s%n", teks);
        garis('-', 90);
    }

    public static void main(String[] args) {

        Kue[] daftarKue = new Kue[20];

        // --- KuePesanan (12 item) ---
        daftarKue[0]  = new KuePesanan("Lapis Legit",      85_000, 1.5);
        daftarKue[1]  = new KuePesanan("Bolu Pandan",      45_000, 2.0);
        daftarKue[2]  = new KuePesanan("Kue Pelangi",      60_000, 1.2);
        daftarKue[3]  = new KuePesanan("Bika Ambon",       55_000, 0.8);
        daftarKue[4]  = new KuePesanan("Lapis Surabaya",   90_000, 1.0);
        daftarKue[5]  = new KuePesanan("Kue Lumpur",       40_000, 0.5);
        daftarKue[6]  = new KuePesanan("Putri Salju",      50_000, 0.7);
        daftarKue[7]  = new KuePesanan("Nastar Keju",      75_000, 1.3);
        daftarKue[8]  = new KuePesanan("Brownies Kukus",   65_000, 1.1);
        daftarKue[9]  = new KuePesanan("Kue Sus Vla",      55_000, 0.9);
        daftarKue[10] = new KuePesanan("Tart Strawberry", 120_000, 1.8);
        daftarKue[11] = new KuePesanan("Chiffon Pandan",   70_000, 1.4);

        // --- KueJadi (8 item) ---
        daftarKue[12] = new KueJadi("Donat Glazed",     12_000, 10);
        daftarKue[13] = new KueJadi("Croissant Butter", 18_000,  8);
        daftarKue[14] = new KueJadi("Onde-Onde",         8_000, 15);
        daftarKue[15] = new KueJadi("Klepon",            5_000, 20);
        daftarKue[16] = new KueJadi("Risoles Mayo",     15_000, 12);
        daftarKue[17] = new KueJadi("Pastel Isi Ayam",  13_000, 10);
        daftarKue[18] = new KueJadi("Kue Cubit",         7_000, 25);
        daftarKue[19] = new KueJadi("Pie Susu Bali",    20_000,  6);

        // a. Tampilkan semua kue
        System.out.println();
        judul("TOKO KUE NUSANTARA - Daftar Seluruh Kue");
        for (int i = 0; i < daftarKue.length; i++) {
            System.out.printf("  %2d. %s%n", i + 1, daftarKue[i]);
        }

        // b. Total harga semua kue
        double totalSemua = 0;
        for (Kue k : daftarKue) totalSemua += k.hitungHarga();
        System.out.println();
        subjudul("b. Total Harga Semua Kue");
        System.out.printf("  Total Harga (20 kue) : Rp%,.0f%n", totalSemua);

        // c. Total harga & berat KuePesanan
        double totalHargaPesanan = 0, totalBerat = 0;
        System.out.println();
        subjudul("c. Total Harga & Berat KuePesanan");
        System.out.printf("  %-4s %-24s %12s %10s %15s%n",
                "No.", "Nama Kue", "Harga/kg", "Berat", "Total Harga");
        garis('.', 70);
        int no = 1;
        for (Kue k : daftarKue) {
            if (k instanceof KuePesanan kp) {
                totalHargaPesanan += kp.hitungHarga();
                totalBerat        += kp.berat;
                System.out.printf("  %-4d %-24s Rp%,8.0f %6.1f kg  Rp%,12.0f%n",
                        no++, kp.nama, kp.harga, kp.berat, kp.hitungHarga());
            }
        }
        garis('.', 70);
        System.out.printf("  %-30s %13.1f kg  Rp%,12.0f%n",
                "TOTAL", totalBerat, totalHargaPesanan);

        // d. Total harga & jumlah KueJadi
        double totalHargaJadi = 0, totalJumlah = 0;
        System.out.println();
        subjudul("d. Total Harga & Jumlah KueJadi");
        System.out.printf("  %-4s %-24s %12s %10s %15s%n",
                "No.", "Nama Kue", "Harga/pcs", "Jumlah", "Total Harga");
        garis('.', 70);
        no = 1;
        for (Kue k : daftarKue) {
            if (k instanceof KueJadi kj) {
                totalHargaJadi += kj.hitungHarga();
                totalJumlah    += kj.jumlah;
                System.out.printf("  %-4d %-24s Rp%,8.0f %6.0f pcs  Rp%,12.0f%n",
                        no++, kj.nama, kj.harga, kj.jumlah, kj.hitungHarga());
            }
        }
        garis('.', 70);
        System.out.printf("  %-30s %12.0f pcs  Rp%,12.0f%n",
                "TOTAL", totalJumlah, totalHargaJadi);

        // e. Kue dengan harga akhir terbesar
        Kue kueMaks = daftarKue[0];
        for (Kue k : daftarKue) {
            if (k.hitungHarga() > kueMaks.hitungHarga()) kueMaks = k;
        }
        System.out.println();
        subjudul("e. Kue dengan Harga Akhir Terbesar");
        String jenis = (kueMaks instanceof KuePesanan) ? "KuePesanan" : "KueJadi";
        System.out.printf("  [JUARA] Nama Kue    : %s%n",   kueMaks.nama);
        System.out.printf("          Jenis       : %s%n",   jenis);
        System.out.printf("          Harga Akhir : Rp%,.0f%n", kueMaks.hitungHarga());
        garis('=', 90);
        System.out.println("  Selesai - Terima kasih telah berbelanja di Toko Kue Nusantara!");
        garis('=', 90);
        System.out.println();
    }
}
