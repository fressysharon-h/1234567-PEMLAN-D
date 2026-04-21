class Employee implements Payable {
    private Integer  registrationNumber;
    private String   name;
    private Integer  salaryPerMonth;
    private Invoice[] invoices;

    public Employee(Integer registrationNumber, String name,
                    Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name               = name;
        this.salaryPerMonth     = salaryPerMonth;
        this.invoices           = invoices;
    }

    public Integer   getRegistrationNumber() { return registrationNumber; }
    public String    getName()               { return name; }
    public Integer   getSalaryPerMonth()     { return salaryPerMonth; }
    public Invoice[] getInvoices()           { return invoices; }

    public int getTotalInvoiceAmount() {
        int total = 0;
        for (Invoice inv : invoices) {
            total += inv.getPayableAmount();
        }
        return total;
    }

   @Override
    public double getPayableAmount() {
    double totalInvoice = 0;

    for (Invoice inv : invoices) {
        totalInvoice += inv.getPayableAmount();
    }

    return salaryPerMonth - totalInvoice;
}

    @Override
    public String toString() {
        return String.format(
                "No. Registrasi : %d\nNama           : %s\nGaji per Bulan : Rp%,d",
                registrationNumber, name, salaryPerMonth);
    }
}
