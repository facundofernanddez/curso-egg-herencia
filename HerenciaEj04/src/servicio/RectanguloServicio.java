package servicio;

import entidad.Rectangulo;
import interfaz.calculosFormas;
import java.util.ArrayList;
import java.util.Scanner;

public class RectanguloServicio implements calculosFormas{
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Rectangulo> rectanguloLista = new ArrayList();
    
    public Rectangulo crearReactangulo(){
        System.out.println("VAMOS A CREAR UN RECTANGULO");
        System.out.println("INGRESE UN NOMBRE PARA ESTE NUEVO RECTANGULO");
        String nombre = leer.next();
        
        System.out.println("INGRESE EL DIAMETRO DE BASE DEL RECTANGULO");
        double base = leer.nextDouble();
        
        System.out.println("INGRESE LA ALTURA DEL RECTANGULO");
        double altura = leer.nextDouble();
        
        Rectangulo nuevoRectangulo = new Rectangulo(nombre, base, altura);
        rectanguloLista.add(nuevoRectangulo);
        
        return nuevoRectangulo;
    }

    @Override
    public void area() {
        rectanguloLista.forEach((i)->{
            double area = i.getBase() * i.getAltura();
            
            System.out.println("");
            System.out.println("EL AREA DEL RECTANGULO: " + i.getNombre().toUpperCase() + " ES: " + area);
            System.out.println("");
        });
    }

    @Override
    public void perimetro() {
        rectanguloLista.forEach((i) -> {
            double perimetro = (i.getBase() + i.getAltura()) * 2;
            
            System.out.println("");
            System.out.println("EL PERIMETRO DEL RECTANGULO: " + i.getNombre().toUpperCase() + " ES: " + perimetro);
            System.out.println("");
        });
    }
}
