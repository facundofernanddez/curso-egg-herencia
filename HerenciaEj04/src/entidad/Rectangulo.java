package entidad;

public class Rectangulo {
    
    private String nombre;
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(String nombre, double base, double altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
