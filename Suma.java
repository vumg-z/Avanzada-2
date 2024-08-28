package Suma;

import fraccion.Fraccion;

public class Suma {
    
    Fraccion primerElemento;
    Fraccion segundoElemento;
    
    public Fraccion suma() {
        double numeradorFinal;
        double denominadorFinal;
        double enteroFinal;
        
        if (primerElemento.denominador == segundoElemento.denominador) {
            numeradorFinal = primerElemento.numerador + segundoElemento.numerador;
            denominadorFinal = primerElemento.denominador;
            enteroFinal = primerElemento.entero + segundoElemento.entero;
        } else {
            
            denominadorFinal = primerElemento.denominador * segundoElemento.denominador;
            double numerador1 = primerElemento.numerador * segundoElemento.denominador;
            double numerador2 = segundoElemento.numerador * primerElemento.denominador;
            numeradorFinal = numerador1 + numerador2;
            enteroFinal = primerElemento.entero + segundoElemento.entero;
        }

        if (numeradorFinal >= denominadorFinal) {
            enteroFinal += Math.floor(numeradorFinal / denominadorFinal);
            numeradorFinal = numeradorFinal % denominadorFinal;
        }
        
        return new Fraccion(numeradorFinal, denominadorFinal, enteroFinal);
    }
    
    public Suma(Fraccion primerElemento, Fraccion segundoElemento) {
        this.primerElemento = primerElemento;
        this.segundoElemento = segundoElemento;
    }
}
