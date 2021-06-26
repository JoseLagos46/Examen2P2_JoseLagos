package examen2p2_joselagos;

import java.io.Serializable;

public class Ensamblados implements Serializable{
    private Vehiculos vehiculo;
    private Baterias battery;

    public Ensamblados() {
    }

    public Ensamblados(Vehiculos vehiculo, Baterias battery) {
        this.vehiculo = vehiculo;
        this.battery = battery;
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Baterias getBattery() {
        return battery;
    }

    public void setBattery(Baterias battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Ensamblados{" + "vehiculo=" + vehiculo + ", battery=" + battery + '}';
    }
    
    
}
