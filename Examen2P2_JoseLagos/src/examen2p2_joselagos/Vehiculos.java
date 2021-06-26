package examen2p2_joselagos;

import java.io.Serializable;

public class Vehiculos implements Serializable{
    private String marca;
    private String modelo;
    private int VIN;
    private String carroceria;

    private static final long SerialVersionUID=777L;
    
    public Vehiculos() {
    }

    public Vehiculos(String marca, String modelo, int VIN, String carroceria) {
        this.marca = marca;
        this.modelo = modelo;
        this.VIN = VIN;
        this.carroceria = carroceria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public String toString() {
        return marca +"; Modelo "+modelo;
    }
    
    
}
