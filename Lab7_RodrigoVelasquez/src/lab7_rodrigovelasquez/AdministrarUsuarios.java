package lab7_rodrigovelasquez;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdministrarUsuarios {

    private ArrayList<Usuario> lista_usuarios = new ArrayList<>();
    private File archivo;

    public AdministrarUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getLista_usuarios() {
        return lista_usuarios;
    }

    public void setLista_usuarios(ArrayList<Usuario> lista_usuarios) {
        this.lista_usuarios = lista_usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setUsuario(Usuario use) {
        lista_usuarios.add(use);
    }

    @Override
    public String toString() {
        return "AdministrarUsuarios{" + "lista_usuarios=" + lista_usuarios + '}';
    }

    public void cargarArchivo() {
        try {
            lista_usuarios = new ArrayList<>();
            Usuario temp = null;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuario) objeto.readObject())!= null) {                        
                        lista_usuarios.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuario us : lista_usuarios) {
                bw.writeObject(us);
            }

        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }

        }

    }
}
