package lab7_rodrigovelasquez;

import java.awt.Image;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.Icon;

public class Usuario implements Serializable {

    private String nombre;
    private String user;
    private String pass;
    private int edad;
    private String sexo;
    private String premium;
    private Icon img;
    private String descripcion;
    private ArrayList<Cita> lista_citas = new ArrayList<>();
    private ArrayList<Usuario> lista_block = new ArrayList<>();
    private ArrayList<Usuario> lista_agregas = new ArrayList<>();
    private ArrayList<Usuario> lista_interesados = new ArrayList<>();
    private ArrayList<String> lista_mensajes = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nombre, String user, String pass, int edad, String sexo, String premium, Icon img, String descripcion) {
        this.nombre = nombre;
        this.user = user;
        this.pass = pass;
        this.edad = edad;
        this.sexo = sexo;
        this.premium = premium;
        this.img = img;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Icon getImg() {
        return img;
    }

    public void setImg(Icon img) {
        this.img = img;
    }

    public ArrayList<Cita> getLista_citas() {
        return lista_citas;
    }

    public void setLista_citas(ArrayList<Cita> lista_citas) {
        this.lista_citas = lista_citas;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
