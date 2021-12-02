public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double paymentPerMonth = service.calculate(1_000_000, 0.0999, 36);

        System.out.println(Math.floor(paymentPerMonth));
    }
}
