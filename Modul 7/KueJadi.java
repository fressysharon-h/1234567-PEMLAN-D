public class KueJadi extends Kue {
    public double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return harga * jumlah * 2;
    }

    @Override
    public String toString() {
        return String.format(
            "[KueJadi    ] %-22s | Harga/pcs: Rp%,7.0f | Jumlah: %4.0f pcs | Total: Rp%,12.0f",
            nama, harga, jumlah, hitungHarga());
    }
}
