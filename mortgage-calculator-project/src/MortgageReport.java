import java.text.NumberFormat;
public class MortgageReport {
    final static byte MONTHS_IN_YEAR = 12;
    private final NumberFormat currency;
    int principal;
    float annualInterest;
    byte years;

    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator){
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage(){
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(double balance: calculator.getRemainingBalances()){
            System.out.println(currency.format(balance));
        }
    }
}



//    public MortgageReport() {
//        this.principal = (int) Input.readNumber("Principal: ", 1000, 1_000_000);;
//        this.annualInterest = (float) Input.readNumber("Annual Interest Rate: ", 1, 30);;
//        this.years = (byte) Input.readNumber("Period (Years): ", 1, 30);
//    }
