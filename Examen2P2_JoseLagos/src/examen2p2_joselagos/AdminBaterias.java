package examen2p2_joselagos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminBaterias {
    private ArrayList<Baterias> baterias = new ArrayList();
    private File archivo = null;

    public AdminBaterias(String path) {
        archivo = new File(path);
    }

    public ArrayList<Baterias> getBaterias() {
        return baterias;
    }

    public void setBaterias(ArrayList<Baterias> baterias) {
        this.baterias = baterias;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setBateria(Baterias b){
        baterias.add(b);
    }
 
    ///////////////////Escribir Archivo///////////////////////////////////////////
    public void escribirArchivoBateria() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Baterias v : baterias) {
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
    public void cargarArchivoBateria() {
        try {
            baterias = new ArrayList();
            Baterias aux;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((aux = (Baterias) objeto.readObject()) != null) {
                        baterias.add(aux);
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

