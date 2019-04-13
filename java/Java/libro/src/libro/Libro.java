
package libro;


//Constructor
public class Libro {

    
    // ENCABSULAMINETO DE DATOS
    
    //Atributos
    private String Nombre;
    private String Editorial;
    private int anho;
    private byte pag;
    
    
    public Libro (String Nombre,String Editorial, int anho, byte pag){   
    //Parametros
    this.Nombre = Nombre;
    this.Editorial = Editorial;
    this.anho = anho;
    this.pag = pag;
        }
    
    
    //Atributos y parametros tienen el mismo nombre y tipo
    public String getNombre(){
     return this.Nombre;}
    
    public String getEditorial(){
         return this.Editorial;}
         
     public int getanho(){
         return this.anho;}
     
    public byte getpag(){
         return this.pag;}     
    }