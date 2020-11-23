package sample;

public class ActVentil extends Actuator{
    private double ventValue;

    public ActVentil(String name, int id) {
        super(name, id);
    }


    public void setVentValue(double ventValue) {
        this.ventValue = ventValue;
    }
}
