public class CreditPaymentService {
    public double calculate(long sum, double percent, int period) {
        double percentPerMonth = percent / 12;
        double a = 1 + percentPerMonth;
        double factor = Math.pow(a, period);

        double k = (percentPerMonth * factor) / (factor -1);

        double payment = k * sum;
        return payment;
    }
}
