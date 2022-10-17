
package herenciaej01;

import AnimalEntidades.Animal;
import AnimalEntidades.Caballo;
import AnimalEntidades.Gato;
import AnimalEntidades.Perro;

/**
 *
 * @author Facundo
 */
public class HerenciaEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        perro1.Alimentarse();
        
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.Alimentarse();
        
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.Alimentarse();
        
        Animal caballo1 = new Caballo("Spark", "Pasto", 5, "Fino");
        caballo1.Alimentarse();
    }
    
}
