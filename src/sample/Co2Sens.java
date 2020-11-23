package sample;

public class Co2Sens extends Sensor {
    private double value;

    public Co2Sens(String name, int id, double value) {
        super(name, id, value);
    }

    public double getValue() {
        return value;
    }
}
