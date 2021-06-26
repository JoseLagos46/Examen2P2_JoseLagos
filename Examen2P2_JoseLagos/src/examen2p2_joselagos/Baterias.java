package examen2p2_joselagos;

import java.io.Serializable;

public class Baterias implements Serializable{
    private String marca;
    private int capacidad;
    private int autonomia;
    private int modulos;
    private int carga;
    private String tipo;
    private int ensamblaje;

    public Baterias() {
    }

    public Baterias(String marca, int capacidad, int autonomia, int modulos, int carga, String tipo, int ensamblaje) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.autonomia = autonomia;
        this.modulos = modulos;
        this.carga = carga;
        this.tipo = tipo;
        this.ensamblaje = ensamblaje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getModulos() {
        return modulos;
    }

    public void setModulos(int modulos) {
        this.modulos = modulos;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEnsamblaje() {
        return ensamblaje;
    }

    public void setEnsamblaje(int ensamblaje) {
        this.ensamblaje = ensamblaje;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Capacidad: " + capacidad ;
    }
    
    
            
}
