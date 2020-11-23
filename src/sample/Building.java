package sample;
import java.util.ArrayList;

public class Building {

    public ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    public ArrayList<Actuator> actuators = new ArrayList<Actuator>();

    // Attributes
    private String name;
    private int id;



    // Constructor
    /*  public Building(String name, int id, ArrayList<Actuator> actuators, ArrayList<Sensor> sensors){
        this.name = name;
        int.id = id;

    } */

    // Methods
    public Sensor getSensor(int id){
        for (Sensor sensor:sensors) {
            return (sensor.getId() == id) ? sensor: null;
        }
        return null;
    }

    public Actuator getAct(int id){
        for (Actuator actuator:actuators) {
            return (actuator.getId() == id) ? actuator: null;
        }
        return null; 
    }

    public void addCo2Sens(String name){

    }

    public void addTempSens(String name){

    }

    public void addAct(String name, int id){

    }

    public void removeTempSens(){

    }

    public void removeCo2Sens(){

    }

    public void removeAct(String name, int id){

    }




}
