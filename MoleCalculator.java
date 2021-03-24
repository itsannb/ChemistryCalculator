import java.util.*;

public class MoleCalculator {

    private double mass;
    private List<String> elements;

    private MoleCalculator(List<String> element, double mass) {
        this.elements = new ArrayList<String>();
        for (int i = 0; i < element.size(); i++) {
            this.elements.add(element.get(i));
        }
        this.mass = mass;
    }
    private double moleCalculate(double MM) {
        return mass / MM;
    }
}
