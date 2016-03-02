//exercise for Day 2 Question 1

public class Exercise21 {
    public static void main(String[] arguments) {
        float initInvestment, totalValue;
        float yearOnePerc = 0.40F;
        float yearTwoLoss = 1500;
        float thirdYearPerc = 0.12F;
        
        //Initial investment
        initInvestment = 14000;
        System.out.println("Initial investment is " + initInvestment);
        
        // Increase 40% year one
        totalValue = initInvestment + (initInvestment*yearOnePerc);
        System.out.println("Value after one year is " + totalValue);
        
        // Lost 1500 in second year
        totalValue -= yearTwoLoss;
        System.out.println("Value after two years is " + totalValue);
        
        // Increase 12% in year three
        totalValue += totalValue*thirdYearPerc;
        System.out.println("Value after three years is " + totalValue);
        
    }
}