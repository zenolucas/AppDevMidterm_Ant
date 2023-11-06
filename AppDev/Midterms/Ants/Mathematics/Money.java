package Mathematics;

/**
 * The Money class provides a method to calculate the number of years it takes for a principal amount to reach a desired amount, given an interest rate and tax rate.
 */
public class Money {
    
    /**
     * Calculates the number of years it takes for a principal amount to reach a desired amount, given an interest rate and tax rate.
     * 
     * @param principal the initial amount of money invested
     * @param interest the annual interest rate as a decimal
     * @param tax the tax rate on the interest earned as a decimal
     * @param desired the desired amount of money to be earned
     * @return the number of years it takes for the principal amount to reach the desired amount
     */
    public static int calculateYears(double principal, double interest, double tax, double desired){
        int years = 0;
        while (principal < desired){
            double interestEarned = principal * interest;
            double taxAmount = interestEarned * tax;
            principal += interestEarned - taxAmount;
            years++;
        }
        return years;
    }
}
