public class CreditPaymentService {
    public double calculate(int sumCredit, double rate, int period) {

        double rateMonth = rate / (12 * 100);
        double payment = sumCredit * (rateMonth * Math.pow(1 + rateMonth, period) / (Math.pow(1 + rateMonth, period) - 1));
        return payment;

    }
}
