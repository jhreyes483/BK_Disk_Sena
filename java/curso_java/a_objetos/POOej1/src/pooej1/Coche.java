/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

/**
 *
 * @author Javier Reyes Neira
 */


//Atributos
public class Coche {
    
    String color;
    String marca;
    int km;    
    
//Metodos
    public static void main(String [] args){
        Coche coche1 = new Coche();
        
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;
        
        System.out.println("El color del coche es: "+coche1.color);
        System.out.println("La marca del coche es: "+coche1.marca);
        System.out.println("El kilometraje es: "+coche1.km);
        
        Coche coche2 = new Coche();
        
        coche2.color = "rojo";
        coche2.marca = "mazda";
        coche2.km = 0;
        
        System.out.println("El color del coche es: "+coche2.color);
        System.out.println("La marca del coche es: "+coche2.marca);
        System.out.println("El kilometraje es:"+ coche2.km);
        
        Coche coche3 = new Coche();
        
        coche2.color = "Azul";
        coche2.color = "chevrolet";
        coche2.km = 0;
        
        System.out.println("El color del coche es: "+coche3.color);
        System.out.println("La marca del coche es: "+coche3.marca);
        System.out.println("El kilometraje es: "+coche3.km);
        
        
        
        
  
        
        
        
        
    }
    
    
    
}
