package examen2p2_joselagos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminEnsamblados {
    private ArrayList<Ensamblados> LEnsamblados = new ArrayList();
    private File archivo = null;

    public AdminEnsamblados(String path) {
        archivo = new File(path);
    }

    public ArrayList<Ensamblados> getLEnsamblados() {
        return LEnsamblados;
    }

    public void setLEnsamblados(ArrayList<Ensamblados> LEnsamblados) {
        this.LEnsamblados = LEnsamblados;
    }

    
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setEnsamblado(Ensamblados e){
        LEnsamblados.add(e);
    }
    
    ///////////////////Escribir Archivo///////////////////////////////////////////
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Ensamblados v : LEnsamblados) {
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
            LEnsamblados = new ArrayList();
            Ensamblados aux;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((aux = (Ensamblados) objeto.readObject()) != null) {
                        LEnsamblados.add(aux);
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
