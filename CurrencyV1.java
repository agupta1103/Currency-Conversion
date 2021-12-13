/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @(Anish Gupta)
 * @version 2/6/21
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables - Mexico
        double startingUsDollars = 6500.00;     // starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 20.5658202232;// 1 USD = 20.5658202232 Pesos
        double dollarsSpentInMexico = 0.0;      // USD spent in Mexico
        double dollarsAfterMexico = 0.0;        // USD remaining after Mexico

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
            
        // Conversion
        System.out.println("Starting U.S. Dollars:           6500.0");
        System.out.println();
        System.out.println("Mexico:");
        System.out.println(" Pesos Spent:               m     " + pesosSpent);
        System.out.print(" U.S. Dollars Equivalent:        ");
        System.out.print(dollarsSpentInMexico = pesosSpent /= pesoExchangeRate);
        System.out.println();
        System.out.print(" U.S. Dollars Remaining:         ");
        System.out.print(dollarsAfterMexico = startingUsDollars -= dollarsSpentInMexico);
        System.out.println();
        System.out.println();

        //Declare and initialize local variables - India
        
        double rupeesSpent = 59873.44;            // Indian Rupees spent
        double rupeesExchangeRate = 72.4432524058;// 1 USD = 72.4432524058 INR
        double dollarsSpentInIndia = 0.0;         // USD spent in India
        double dollarsAfterIndia = 0.0;           // USD remaining after India
        
        // Conversion
        System.out.println("India:");
        System.out.println(" Rupees Spent:                   " + rupeesSpent);
        System.out.print(" U.S. Dollars Equivalent:        ");
        System.out.print(dollarsSpentInIndia = rupeesSpent /= rupeesExchangeRate);
        System.out.println();
        System.out.print(" U.S. Dollars Remaining:         ");
        System.out.print(dollarsAfterIndia = dollarsAfterMexico -= dollarsSpentInIndia);
        System.out.println();
        System.out.println();
        
        //Declare and initialize local variables - Germany
        
        double eurosSpent = 3979.53;            // Euros Spent
        double eurosExchangeRate = 0.8253625976;// 1 USD = 0.8253625976 EUR
        double dollarsSpentInGermany = 0.0;     // USD spent in Germany
        double dollarsAfterGermany = 0.0;       // USD remaining after Germany
        
        //Conversion
        System.out.println("Germany:");
        System.out.println(" Euros Spent:                    " + eurosSpent);
        System.out.print(" U.S. Dollars Equivalent         ");
        System.out.print(dollarsSpentInGermany = eurosSpent /= eurosExchangeRate);
        System.out.println();
        System.out.print(" U.S. Dollars Remaining          ");
        System.out.print(dollarsAfterGermany = dollarsAfterIndia -= dollarsSpentInGermany);
        System.out.println();
        System.out.println("===================================================");
        System.out.println("Remaining U.S. Dollars:          " + dollarsAfterGermany);
        System.out.println();
        System.out.println();

        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                         // cost per item of first souvenir
        int budget1 = 100;                          // budget for first item
        int totalItems1 = 0;                        // how many items can be purchased
        int fundsRemaining1 = 0;                    // how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1);
        System.out.println("   Budget: $" + budget1);
        totalItems1 = budget1 / costItem1;
        System.out.println("   Total items purchased: " +  totalItems1);
        fundsRemaining1 = budget1 % costItem1;
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();
        
        //Calculations for Souvenir #2
        double costItem2 = 29.99;                   // cost per item of second souvenir
        int budget2 = 500;                          // budget for second item 
        int totalItems2 = 0;                        // how many items can be purchased
        double fundsRemaining2 = 0.0;               // how much of the budget is left
        
        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $" + budget2);
        totalItems2 = (int) (budget2 / costItem2);
        System.out.println("   Total items purchased: " +  totalItems2);
        fundsRemaining2 = budget2 % costItem2;
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

