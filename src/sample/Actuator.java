package sample;

public abstract class Actuator {
    private String name;
    private int id;
    private double value;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
