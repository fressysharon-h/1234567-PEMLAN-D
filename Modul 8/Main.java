public class Main {
    public static void main(String[] args) {

        Invoice[] invoices = {
            new Invoice("Beras", 2, 50000),
            new Invoice("Minyak", 1, 20000),
            new Invoice("Gula", 3, 15000)
        };

        Employee emp = new Employee(101, "Budi", 3000000, invoices);

        System.out.println("=== DATA KARYAWAN ===");
        System.out.println("No Registrasi : " + emp.getRegistrationNumber());
        System.out.println("Nama          : " + emp.getName());
        System.out.println("Gaji Awal     : " + emp.getSalaryPerMonth());

        System.out.println("\n=== DETAIL BELANJA ===");

        Payable[] payableList = emp.getInvoices();

        double totalBelanja = 0;
        for (Payable p : payableList) {
            Invoice inv = (Invoice) p;
            double total = p.getPayableAmount();

            System.out.println("Produk : " + inv.getProductName());
            System.out.println("Jumlah : " + inv.getQuantity());
            System.out.println("Harga  : " + inv.getPricePerItem());
            System.out.println("Total  : " + total);
            System.out.println("-------------------------");

            totalBelanja += total;
        }

        System.out.println("Total Belanja : " + totalBelanja);
        System.out.println("Gaji Setelah Potongan : " + emp.getPayableAmount());
    }
}
