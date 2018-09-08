package lab7_rodrigovelasquez;

public class Mensaje {

private String emisor;
private String receptor;
private String msj;

    public Mensaje() {
    }

    public Mensaje(String emisor, String receptor, String msj) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.msj = msj;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    @Override
    public String toString() {
        return  msj;
    }

    
}
