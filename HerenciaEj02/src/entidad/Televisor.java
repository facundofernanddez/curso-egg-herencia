
package entidad;

public class Televisor extends Electrodomestico {
    
    private int resolucion;
    private boolean sintonizadorTdt;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTdt, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }        
}
