/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaces;

/**
 *
 * @author Andres
 */
public class Bicicleta implements Rueda, Silla {

    public Bicicleta() {
    }

    public void sentarse() {
        System.out.println("La bicicleta Tiene Silla para sentarse");
    }

    public void avanzar() {
        System.out.println("La Bicicleta Avanza");
    }

    public void detenerse() {
        System.out.println("La Bicicleta se Detiene");
    }

}
