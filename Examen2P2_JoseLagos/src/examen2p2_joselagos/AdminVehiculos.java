package examen2p2_joselagos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminVehiculos {

    private ArrayList<Vehiculos> LVehiculos = new ArrayList();
    private File archivo = null;

    
    public AdminVehiculos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Vehiculos> getLVehiculos() {
        return LVehiculos;
    }

    public void setLVehiculos(ArrayList<Vehiculos> LVehiculos) {
        this.LVehiculos = LVehiculos;
    }

    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setVehiculoCombustion(Combustion c) {
        LVehiculos.add(c);
    }
    
    public void setVehiculoHibrido(Hibrido h){
        LVehiculos.add(h);
    }
    
    public void setVehiculoEnchufable(HibridoEnchufable he){
        LVehiculos.add(he);
    }
    
    public void setVehiculoElectrico(Electrico e){
        LVehiculos.add(e);
    }

///////////////////Escribir Archivo///////////////////////////////////////////
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Vehiculos v : LVehiculos) {
                bw.writeObject(v);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    
////////////////Cargar Archivo/////////////////////////////////////////////////
    public void cargarArchivo() {
        try {
            LVehiculos = new ArrayList();
            Vehiculos aux;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((aux = (Vehiculos) objeto.readObject()) != null) {
                        LVehiculos.add(aux);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
