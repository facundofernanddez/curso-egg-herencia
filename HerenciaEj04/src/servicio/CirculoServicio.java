package servicio;

import entidad.Circulo;
import interfaz.calculosFormas;
import java.util.ArrayList;
import java.util.Scanner;

public class CirculoServicio implements calculosFormas{
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Circulo> circuloLista = new ArrayList();
    
    public Circulo crearCirculo(){
        System.out.println("VAMOS A CREAR UN CIRCULO");
        System.out.println("INGRESE UN NOMBRE PARA ESTE NUEVO CIRCULO");
        String nombre = leer.next();
        
        System.out.println("INGRESE EL DIAMETRO DEL CIRCULO");
        double diametro = leer.nextDouble();
        
        Circulo nuevoCirculo = new Circulo(nombre, diametro);
        circuloLista.add(nuevoCirculo);
        
        return nuevoCirculo;
    }

    @Override
    public void area() {
        circuloLista.forEach((i) -> {
            double radio = i.getDiametro() / 2;
            double area = PI * (radio * radio);
            
            System.out.println("");
            System.out.println("EL AREA DEL CIRCULO " + i.getNombre().toUpperCase() + " ES: " + area);
            System.out.println("");
        });
    }

    @Override
    public void perimetro() {
        circuloLista.forEach((i) -> {
            double perimetro = PI * i.getDiametro();
            
            System.out.println("");
            System.out.println("EL PERIMETRO DEL CIRCULO" + i.getNombre().toUpperCase() + " ES: " + perimetro);
            System.out.println("");
        });
    }
}
