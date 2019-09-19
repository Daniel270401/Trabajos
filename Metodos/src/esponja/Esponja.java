package esponja;

/**
 *
 * @author DANIEL
 */
public class Esponja 
{
    String textura;
    float tamanio,tamanio2;
    public String retonarTextura()
    {
        return textura;
    }
    
    public void mostrarTextura()
    {
        System.out.println("Esponja: Aspera");
    }
    
    public float mostrarTamanio()
    {
        return(float) 10;
    }
    
    public float mostrarTamanio2()
    {
        return(float) 5;
    }
    public static void main(String[] args) 
    {
        Esponja esponja01 = new Esponja();
        esponja01.mostrarTextura();
        
        System.out.println("Textura: "+esponja01.mostrarTamanio()+" x "+esponja01.mostrarTamanio2()+" cm");
    }
}