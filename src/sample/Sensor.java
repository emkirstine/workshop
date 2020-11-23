package sample;

public abstract class Sensor {
        private String name;
        private int id;
        private double value;


    // Constructor
    public Sensor(String name, int id, double value){
        this.name = name;
        this.id = id;
        this.value = value;
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
}
