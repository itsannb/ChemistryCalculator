import java.util.*;

public class Main {
    public static void main (String args[]) {
        Scanner console = new Scanner(System.in);
        String response = intro(console);
        if (response.equals("1")) {
            optionOne(console);
        } else if (response.equals("2")) {
            optionTwo(console);
        }
    }

    public static String intro(Scanner s) {
        System.out.println("Welcome to the chemistry calculator");
        System.out.println("The chemistry calculator so far only calculates the molar mass and moles");
        System.out.println("#1 Calculate molar mass");
        System.out.println("#2 Calculate amount of moles");
        System.out.println("Which one would you like to calculate? Respond either 1/2: ");
        String val = "" + s.next();
        if (!(val.equals("1")) && !(val.equals("2"))) {
            throw new IllegalArgumentException("Cannot read this input");
        }
        return val;
    }

    public static void optionOne(Scanner s) {    // Calculating molar mass
        System.out.println("What is the element/compound that you want us to calculate?");
        System.out.println("Example: H O H");
        String element = s.next();
        MolarMassCalculator mm = new MolarMassCalculator(element);
        System.out.println("The molar mass of " + element + " is " + mm.calculateMM());
        

    }

    public static void optionTwo(Scanner s) {   // Calculating mole
        System.out.println("What is the element/compound that you want us to calculate?");
        System.out.println("Example: H O H");
        String element = s.next();
        System.out.println("What is the mass given (g)?: ");
        double val = s.nextDouble();
        MolarMassCalculator mm = new MolarMassCalculator(element);
        MoleCalculator mole = new MoleCalculator(element, val);
        double calculatedMM = mm.calculateMM();
        System.out.println("The mole of " + element + " is " + mole.moleCalculate(calculatedMM) ); 
    }
}
