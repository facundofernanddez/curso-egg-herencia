package servicio;

import entidad.Lavadora;

public class LavadoraServicio extends ElectrodomesticoServicio {
    
    public Lavadora crearLavadora(){
        super.crearElectrodomesticos();
        System.out.println("Escriba la carga de la lavadora");
        Integer cargga = leer.nextInt();
        
        return new Lavadora(precio, color, consumo, peso, cargga);
    }

    public void precioFinal(Lavadora lav) {
        super.precioFinal(lav);
        if (lav.getCarga() > 30) lav.setPrecio(lav.getPrecio() + 500);
        
        System.out.println("");
        System.out.println("EL PRECIO FINAL DE ESTA LAVADORA ES DE: " + lav.getPrecio());
    }
}
