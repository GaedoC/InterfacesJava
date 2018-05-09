
package ejemplointerfaces;
import ejemplointerfaces.Carro;

public class EjemploInterfaces {

   
    public static void main(String[] args) {
        
        Carro c = new Carro();
        Bicicleta b = new Bicicleta();
        
        c.avanzar();
        c.detenerse();
        b.avanzar();
        b.detenerse();
        b.sentarse();
        
        
    }
    
}
