import java.util.*;

public class MolarMassCalculator {

    private List<String> elements;
    private Scanner scanner;

    private MolarMassCalculator(List<String> e) {
        elements = new ArrayList<String>();
        for (int i = 0; i < e.size(); i++) {
            elements.add(e.get(i));
        }
        scanner = new Scanner("periodicTable.txt");
    }

    private double calculateMM(List<String> l) {
        double value = 0.0;
        while(scanner.hasNextLine()) {
            String elementName = scanner.next();
            double elementNum = scanner.nextDouble();
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i).equals(elementName.trim())) {
                    value += elementNum;
                }
            }
        }
        return value;
    }
}