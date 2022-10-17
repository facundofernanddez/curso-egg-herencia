package servicio;

import entidad.Electrodomestico;

public class ElectrodomesticoServicio extends Electrodomestico {
    
    public void comprobarConsumoEnergetico(char conssumo) {
        switch (conssumo) {
            case 'A':
                consumo = 'A';
                break;
            case 'B':
                consumo = 'B';
                break;
            case 'C':
                consumo = 'C';
                break;
            case 'D':
                consumo = 'D';
                break;
            case 'E':
                consumo = 'E';
                break;
            case 'F':
                consumo = 'F';
                break;
            default:
                consumo = 'F';
                break;
        }
    }

    public void comprobarColor(String colorr) {
        switch (colorr.toUpperCase()) {
            case ("BLANCO"):
                color = "BLANCO";
                break;
            case ("NEGRO"):
                color = "NEGRO";
                break;
            case ("ROJO"):
                color = "ROJO";
                break;
            case ("AZUL"):
                color = "AZUL";
                break;
            case ("GRIS"):
                color = "GRIS";
                break;
            default:
                color = "BLANCO";
                break;
        }
    }

    public void crearElectrodomesticos() {
        precio = 1000;

        System.out.println("Escriba el color");
        String col = leer.next();
        comprobarColor(col);

        System.out.println("Escriba la letra de consumo electrico");
        String letra = leer.next();
        char letraChar = letra.charAt(0);
        comprobarConsumoEnergetico(letraChar);

        System.out.println("Escriba el peso del electrodomestico");
        peso = leer.nextDouble();
    }

    public boolean entre(double x, double piso, double techo) {
        return piso <= x && x <= techo;
    }

    public void precioFinal(Electrodomestico e) {
        double pre1 = 0;
        double pre2 = 0;

        switch (e.getConsumo()) {
            case 'A':
                pre1 = 1000;
                break;
            case 'B':
                pre1 = 800;
                break;
            case 'C':
                pre1 = 600;
                break;
            case 'D':
                pre1 = 500;
                break;
            case 'E':
                pre1 = 300;
                break;
            case 'F':
                pre1 = 100;
                break;
        }

        if (entre(e.getPeso(), 1, 19)) {
            pre2 = 100;
        } else if (entre(e.getPeso(), 20, 49)) {
            pre2 = 500;
        } else if (entre(e.getPeso(), 50, 79)) {
            pre2 = 500;
        } else if (e.getPeso() > 80) {
            pre2 = 1000;
        }

        e.setPrecio(e.getPrecio() + pre1 + pre2);
    }
}
