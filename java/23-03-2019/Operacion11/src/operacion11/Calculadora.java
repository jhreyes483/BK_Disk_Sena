/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion11;

import java.util.Scanner;

/**
 *
 * @author APRENDIZ
 */
public class Calculadora {
    int a=0,b=0,op=0;
    
    
    Scanner leer = new Scanner (System.in);
    
    
    public void calcula(){
        
        
        
        System.out.println("ingrese el Mumero 1: ");
        
        a=leer.nextInt();
        
        System.out.println("ingrese el numero 2: ");
        
        b=leer.nextInt();
        opera();
    }
     
        public void opera(){
   
        System.out.println("Seleccione la operacion que desea");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Divicion");
     
        
        op =leer.nextInt();
                
   
                switch (op){
                
                    case 1:
                        System.out.println("la suma de "+a+" + "+b+" = "+(a+b));
                break;
                
                
                    case 2:
                        System.out.println("La resta de "+a+" - "+b+" = "+(a-b));           
                break;
                
  
                    case 3:
                        System.out.println("La multiplicacion de "+a+" * "+b+" = "+(a*b));  
                break; 
                
                
                        case 4: 
                            System.out.println("La divicion de "+a+"/"+b+" = "+(a/b));
               break;
                                   
                        case 5:
                            System.out.println("La divicion de "+a+"/"+b+" = "+(a%b));           
                break;
                
                
                default :
                    System.out.println("Respuesta incorrecta");
                            
                            
                opera();
                break ;
                }
                
                System.out.println("Desea continuar");
                System.out.println("1 = Si");
                System.out.println("2 = No");
                op=leer.nextInt();
                if(op==1)
                    calcula(); else{ System.out.println("salio");  }
 
                
    }
}
    

