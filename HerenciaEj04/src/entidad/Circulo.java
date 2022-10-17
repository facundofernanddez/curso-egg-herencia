package entidad;

public class Circulo {
    
    private String nombre;
    private double diametro;

    public Circulo() {
    }

    public Circulo(String nombre, double diametro) {
        this.nombre = nombre;
        this.diametro = diametro;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}
