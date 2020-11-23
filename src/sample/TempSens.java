package sample;

public class TempSens extends Sensor {
    private double value;

    public TempSens(String name, int id, double value) {
        super(name, id, value);
    }

    public double getTemp() {
        return value;
    }
    
    
    
    
}
