/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package teorema.de.pitagoras;


import java.util.Scanner;
public class Triangulo {
    
 double a=0, raiz=0,num1=0, num2=0,solucion=0; 
    Scanner leer = new Scanner (System.in);
    
     //double num1=0, num2=0, Solucion=0;
    public void hipotenusa(){ 
        
        
        
        
        System.out.println("Digite valor del primer Cateto");
        num1=leer.nextDouble();
        System.out.println("Digite valor del segundo Cateto");
        num2=leer.nextDouble();
    //Ecuacion de teorema de pitegoras
solucion=((num1*num1)+(num2*num2));

        System.out.println("el valor de solucion es"+solucion);
    //Raiz cuadrada
        
        
        raiz = Math.sqrt(solucion);
        
        System.out.println("El valor de la hipotenusa es :"+raiz);
         
        
        
        
        
        
        }
}
