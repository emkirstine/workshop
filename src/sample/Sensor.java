package sample;

public class Sensor {
        private String name;
        private int id;


    // Constructor
    public Sensor(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
