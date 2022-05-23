public class CreditPaymentService {
    public double calculate (double amount, double period, double rate) {
        double rateMonth;
        double periodMonth;
        double payment;
        double preCalc;
        double pow;
        double annCof;

        rateMonth = rate / (100 * 12);
        periodMonth = period * 12 * (-1);
        preCalc = 1 + rateMonth;
        pow = Math.pow(preCalc, periodMonth);
        annCof = rateMonth / (1 - pow);
        payment = amount * annCof;

        return payment;

    }
}
