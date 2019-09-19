package esponja;

/**
 *
 * @author DANIEL
 */
public class mainEsponja 
{
     public static void main(String[] args) 
    {
        Esponja esponja01 = new Esponja();
        esponja01.mostrarTextura();
        
        System.out.println("Textura: "+esponja01.mostrarTamanio()+" x "+esponja01.mostrarTamanio2()+" cm");
    }
}
