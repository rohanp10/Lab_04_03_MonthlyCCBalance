// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double creditCardBalance = 5000.0;
        final double INTEREST_RATE = 0.17;
        double oneMonthInterest = 0.0;
        double twoMonthInterest = 0.0;

        oneMonthInterest = creditCardBalance * INTEREST_RATE;
        twoMonthInterest = (creditCardBalance + oneMonthInterest) * INTEREST_RATE;

        // Rounds answer
        oneMonthInterest = Math.round(oneMonthInterest * 100) / 100.0;
        twoMonthInterest = Math.round(twoMonthInterest * 100) / 100.0;


        System.out.println("The interest due after one month is $" + oneMonthInterest);
        System.out.println("The interest due after two months is $" + twoMonthInterest);


    }
}