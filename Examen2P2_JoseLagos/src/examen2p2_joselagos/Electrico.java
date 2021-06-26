package examen2p2_joselagos;

public class Electrico extends Vehiculos{
    private int coeficiente;
    private int motores;
    private int recarga;

    private Baterias battery;
    
    public Electrico() {
    }

    public Electrico(int coeficiente, int motores, int recarga, String marca, String modelo, int VIN, String carroceria) {
        super(marca, modelo, VIN, carroceria);
        this.coeficiente = coeficiente;
        this.motores = motores;
        this.recarga = recarga;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getRecarga() {
        return recarga;
    }

    public void setRecarga(int recarga) {
        this.recarga = recarga;
    }

    public Baterias getBattery() {
        return battery;
    }

    public void setBattery(Baterias battery) {
        this.battery = battery;
    }
    
    

    @Override
    public String toString() {
        return super.toString()+"; Coeficiente aerodinamico: " + coeficiente + ", Cantidad de motores: " + motores + ", Tiempo de recarga: " + recarga + " horas";
    }
    
    
    
}
