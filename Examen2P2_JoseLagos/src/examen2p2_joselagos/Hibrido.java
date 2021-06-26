package examen2p2_joselagos;

public class Hibrido extends Vehiculos{
    private int autonomia;
    private int pasajeros;
    private String precio;

    private Baterias battery;
    
    public Hibrido() {
        super();
    }

    public Hibrido(int autonomia, int pasajeros, String precio, String marca, String modelo, int VIN, String carroceria) {
        super(marca, modelo, VIN, carroceria);
        this.autonomia = autonomia;
        this.pasajeros = pasajeros;
        this.precio = precio;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Baterias getBattery() {
        return battery;
    }

    public void setBattery(Baterias battery) {
        this.battery = battery;
    }

    
    
    @Override
    public String toString() {
        return super.toString()+"Autonomia: " + autonomia + "km, Cantidad de pasajeros: " + pasajeros + ", Precio de entrada: " + precio;
    }
    
    
}
