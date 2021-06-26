package examen2p2_joselagos;

import java.io.Serializable;

public class Combustion extends Vehiculos {
    private int cilindrada;
    private int cilindros;
    private int consumo;

    public Combustion() {
        super();
    }

    public Combustion(int cilindrada, int cilindros, int consumo, String marca, String modelo, int VIN, String carroceria) {
        super(marca, modelo, VIN, carroceria);
        this.cilindrada = cilindrada;
        this.cilindros = cilindros;
        this.consumo = consumo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return super.toString()+", Consumo de combustible: " + consumo + "litros/km";
    }
    
    
    
    
}
