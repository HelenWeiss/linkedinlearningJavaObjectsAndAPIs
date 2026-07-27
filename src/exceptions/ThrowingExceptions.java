package exceptions;

public class ThrowingExceptions {

    public static double calculatePay(double hours, double payRate) throws NegativeInputException {
        if(hours > 40) {
            throw new IllegalArgumentException("Hours must be less that or equal to 40");
        }

        if(hours < 0 || payRate < 0) {
            throw new NegativeInputException();  // error if absent for method "throws NegativeInputException" in row 5
        }

        return hours * payRate;
    }
}
