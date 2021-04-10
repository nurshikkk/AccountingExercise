import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        IncomeTaxType incomeTaxType = new IncomeTaxType();
        VATaxType vaTaxType = new VATaxType();
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();
        Bill[] payments = new Bill[] {
                new Bill(new BigDecimal("15000"), incomeTaxType, taxService),
                new Bill(new BigDecimal("10000011"), progressiveTaxType, taxService),
                new Bill(new BigDecimal("20000"), vaTaxType, taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}