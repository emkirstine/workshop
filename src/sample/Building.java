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
    public Sensor getSensor(int id) {
        for (Sensor sensor : sensors) {
            if (sensor.getId() == id) {
                return sensor;
            }
        }
        return null;
    }


    public Actuator getAct(int id){
        for (Actuator actuator:actuators) {
            return (actuator.getId() == id) ? actuator: null;
        }
        return null; 
    }


    public void addCo2Sens(String name, double value){
        sensors.add(new Co2Sens(name, sensors.size()+1, value));
    }

<<<<<<< HEAD
=======
    }
>>>>>>> main

    public void tempSens(String name, double value){
        sensors.add(new TempSens(name, sensors.size()+1, value));
    }

    public void addAct(String name, int id){

    }


    public void removeSens(int id){

    }

    public void removeAct(int id){

    }




}
