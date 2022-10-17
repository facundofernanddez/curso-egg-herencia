package servicio;

import entidad.Televisor;

public class TelevisorServicio extends ElectrodomesticoServicio{
    
    public Televisor crearTelevisor(){
        super.crearElectrodomesticos();
        System.out.println("Escriba la resolucion del televisor");
        int res = leer.nextInt();
        
        System.out.println("Escriba si es que tiene sintonizador TDT S/N");
        String tdt = leer.next();
        boolean booltdt = false;
        if (tdt.equalsIgnoreCase("s")) booltdt = true;
        else if (tdt.equalsIgnoreCase("n")) booltdt = false;
        else System.out.println("Ha escrito una respuesta invalida");
        
        return new Televisor(res, booltdt, precio, color, consumo, peso);
    }

    public void precioFinalTele(Televisor tele) {
        super.precioFinal(tele);
        if (tele.isSintonizadorTdt() == true) tele.setPrecio(tele.getPrecio() + 500);
        if (tele.getResolucion() > 40) tele.setPrecio(tele.getPrecio() + (tele.getPrecio() * 0.30));
        
        System.out.println("");
        System.out.println("EL PRECIO FINAL DE ESTE TELEVISOR ES DE: " + tele.getPrecio());      
    }

    
}
