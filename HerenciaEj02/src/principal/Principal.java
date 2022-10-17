package principal;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;
import servicio.LavadoraServicio;
import servicio.TelevisorServicio;

public class Principal extends Electrodomestico {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticoLista = new ArrayList();

        LavadoraServicio serviceLav = new LavadoraServicio();
        TelevisorServicio serviceTele = new TelevisorServicio();

        Lavadora lavadora1 = serviceLav.crearLavadora();
        serviceLav.precioFinal(lavadora1);
        Televisor televisor1 = serviceTele.crearTelevisor();
        serviceTele.precioFinalTele(televisor1);

        electrodomesticoLista.add(lavadora1);
        electrodomesticoLista.add(televisor1);

        double sumaLav = 0;
        double sumaTele = 0;
        double sumaTodo = 0;
        int contador = 1;

        //esto está mal
        electrodomesticoLista.forEach((i) -> {
            if (i.getClass() == Lavadora.class) {
                serviceLav.precioFinal(i);
                //sumaLav += i.getPrecio();
                //sumaTodo += i.getPrecio();
            }
            if (i.getClass() == Televisor.class) {
                serviceTele.precioFinal(i);
               // sumaTele += i.getPrecio();
                //sumaTodo += i.getPrecio();
            }

            //contador++;

            //if (contador > electrodomesticoLista.size()) {
                //System.out.println("LA SUMA DEL PRECIO DE TODOS LOS ELECTRODOMESTICOS ES: $" + sumaTodo + ". LA SUMA DE LA/S LAVADORA/S CORRESPONDE A: $" + sumaLav + ". LA SUMA DE LOS TELEVISORES CORRESPONDE A: $" + sumaTele);
            });

    }

}
