/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenusa;

/**
 *
 * @author APRENDIZ
 */
public class Hipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hipotenusa punto1;
        
        punto1 = new Hipotenusa (5,8);
        Hipotenusa punto2;
        punto2 = new Hipotenusa (6,-4);
        Hipotenusa punto3;
        punto3 = new Hipotenusa (7,8);
      
        
        
        
        
        System.out.println("La hipotenusa de x="+punto1.getX()+"x y "
        +punto1.getY()+" es  "+punto2.gethipotenusa());
        
        
        
        
        // TODO code application logic here
    }
    
}
