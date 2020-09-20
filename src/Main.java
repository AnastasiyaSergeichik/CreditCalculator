public class Main {
    public static void main(String[] args) {
        int sumCredit = 1_000_000;
        double rate = 9.99;
        int period1 = 12;
        int period2 = 24;
        int period3 = 36;
        System.out.print("Ежемесячный платеж: ");
        CreditPaymentService CreditPaymentService = new CreditPaymentService();
        double credit1 = CreditPaymentService.calculate(sumCredit, rate, period1);
        String result1 = String.format("%.0f", credit1);
        System.out.println(result1);

        System.out.print("Ежемесячный платеж: ");
        double credit2 = CreditPaymentService.calculate(sumCredit, rate, period2);
        String result2 = String.format("%.0f", credit2);
        System.out.println(result2);

        System.out.print("Ежемесячный платеж: ");
        double credit3 = CreditPaymentService.calculate(sumCredit, rate, period3);
        String result3 = String.format("%.0f", credit3);
        System.out.println(result3);
    }
}
