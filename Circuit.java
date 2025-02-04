import java.util.ArrayList;

public class Circuit {
    private static Circuit instance = null;
    private ArrayList<Resistor> resistors;

    private Circuit() {
        resistors = new ArrayList<>();
    }

    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }

    public void add(Resistor r) {
        resistors.add(r);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Resistor r : resistors) {
            result.append(r).append("\n");
        }
        return result.toString();
    }
}
