package sample;

public abstract class Actuator {
    private String name;
    private int id;
    private double value;

    public Actuator(String name, int id){
        this.name = name;
        this.id = id;
    }

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
