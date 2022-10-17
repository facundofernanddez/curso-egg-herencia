package entidad;

import java.util.Scanner;

public class Electrodomestico {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
