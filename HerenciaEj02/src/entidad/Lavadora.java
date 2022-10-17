
package entidad;

public class Lavadora extends Electrodomestico {
    
    protected Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(double precio, String color, char consumo, double peso, Integer carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
