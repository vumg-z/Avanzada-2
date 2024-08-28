/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suma;

import fraccion.Fraccion;

/**
 *
 * @author Usuario
 */
public class Suma {
    
    Fraccion primerElemento;
    Fraccion segundoElemento;
    
    Fraccion suma(){
         double enteroFinal;
         double denomidorFinal;
         
        if(primerElemento.denominador == segundoElemento.denominador){
            enteroFinal =  this.primerElemento.entero + this.segundoElemento.entero;
            segundoElemento.entero = enteroFinal;
   
        }else{
            
            // d1 * d2 = d3
            // n1 * d2 = n3
            // n2 * d1 = n4
            
            // n3 + n4 = n5
            
            // n5/d3
            
            this..primerElemento.entero + this.segundoElemento.entero;
            segundoElemento.entero = enteroFinal;
            return segundoElemento; 
        }
        
        
        return null;
    }
    
    Suma(Fraccion primerElemento, Fraccion segundoElemento){
        this.primerElemento = primerElemento;
        this.segundoElemento = segundoElemento;
    }
    
    
    
}
