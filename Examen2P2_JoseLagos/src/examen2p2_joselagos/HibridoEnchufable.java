package examen2p2_joselagos;

public class HibridoEnchufable extends Vehiculos{
    private int maletero;
    private int galones;
    
    private Baterias battery;

    public HibridoEnchufable() {
        super();
    }

    public HibridoEnchufable(int maletero, int galones, String marca, String modelo, int VIN, String carroceria) {
        super(marca, modelo, VIN, carroceria);
        this.maletero = maletero;
        this.galones = galones;
    }

    public int getMaletero() {
        return maletero;
    }

    public void setMaletero(int maletero) {
        this.maletero = maletero;
    }

    public int getGalones() {
        return galones;
    }

    public void setGalones(int galones) {
        this.galones = galones;
    }

    public Baterias getBattery() {
        return battery;
    }

    public void setBattery(Baterias battery) {
        this.battery = battery;
    }
    
    

    @Override
    public String toString() {
        return super.toString()+"Capacidad del maletero: " + maletero + ", Cantidad de galones de combusible: " + galones;
    }
    
    
}
