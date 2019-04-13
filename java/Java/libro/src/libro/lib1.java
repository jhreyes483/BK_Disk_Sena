

package libro;

/**
 *
 * @author APRENDIZ
 */
public class lib1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro Libro1;
        Libro1 = new Libro ("El principito ", "Paplona ",1998,(byte)50);
             
        Libro Libro2;
        Libro2 = new Libro ("Programacion","Universal",2002,(byte)115);    
      
        System.out.println("El libro es: "+Libro1.getNombre()+" es de la editorial "+Libro1.getEditorial()+"del año "+Libro1.getanho());
       
        System.out.println("Contengo los libros : "+Libro1.getNombre()+""+Libro2.getNombre());                     
    }
    
}
