/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fraccion;

/**
 *
 * @author Usuario
 */
public class Fraccion {
    public double numerador;
    public double denominador;
    public double entero;
    
    // Constructor de la clase Fraccion
    public Fraccion(double numerador, double denominador, double entero) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }

        this.numerador = numerador;
        this.denominador = denominador;
        this.entero = entero;
    }
    
}
