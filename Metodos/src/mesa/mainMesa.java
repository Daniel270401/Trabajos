package mesa;

/**
 *
 * @author DANIEL
 */
public class mainMesa 
{
    public static void main(String[] args) 
    {
        Mesa mesa01 = new Mesa();
        
        mesa01.mostrarColor();
        
        System.out.println("Tamanio: "+mesa01.mostrarTamanio()+" x "+mesa01.mostrarTamanio1()+" metros");
    }
}
