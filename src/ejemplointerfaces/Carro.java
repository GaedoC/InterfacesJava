
package ejemplointerfaces;

    

public class Carro implements Rueda{
    
    Carro(){}
    
     public void avanzar() {
        System.out.println("El Carro Avanza");
    }

    public void detenerse() {
        System.out.println("El Carro se Detiene");
    }
}
