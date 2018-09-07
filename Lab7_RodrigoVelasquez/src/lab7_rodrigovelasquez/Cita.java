package lab7_rodrigovelasquez;

import java.util.Date;

public class Cita {
private Date fecha;
private String usuario;
private String lugar;

    public Cita() {
    }

    public Cita(Date fecha, String usuario, String lugar) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Cita{" + "fecha=" + fecha + ", usuario=" + usuario + ", lugar=" + lugar + '}';
    }


}
