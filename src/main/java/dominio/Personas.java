
package dominio;

import javax.swing.JTextField;

public class Personas {
    
    private String nombre;
    private double saldoin;
    private int codigo;

    public Personas(int  codigo, String nombre, double saldoin ) {
        this.nombre = nombre;
        this.saldoin = saldoin;
        this.codigo = codigo;
    }
    public Personas(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldoin() {
        return saldoin;
    }

    public void setSaldoi(double saldoin) {
        this.saldoin = saldoin;
    }

    public int  getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString(){
    return  getNombre();
    }
}
