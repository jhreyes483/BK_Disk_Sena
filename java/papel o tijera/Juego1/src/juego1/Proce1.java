/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego1;

import java.util.Scanner;

/**
 *
 * @author APRENDIZ
 */
public class Proce1 {
    int r=0, r2=0;
    
    Scanner leer = new Scanner (System.in);
    
    
    public void  play(){
        
        
        System.out.println("Seleccione  :");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        r = leer.nextInt();
        
              
        System.out.println("Jugador dos");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        r2 = leer.nextInt();
            
     
    
     
     if (r==r2){System.out.println("Empate");
      }
     
     //jugador 1 = piedra
     else if(r==1 && r2==2){System.out.println("Gana jugador 2");}
     else if(r==1 && r2==3){System.out.println("Gana jugador 1");}
     
     
     else if (r==2 && r2==1){System.out.println("Gana jugador 1");}
     else if (r==2 && r2==3){System.out.println("Gana jugador 1");}
     
     else if (r==3 && r2==1){System.out.println("Gana jugador 1");}
     else if (r==3 && r2==2){System.out.println("Gana jugador 2");}
    }
    
    
     
    }
    
