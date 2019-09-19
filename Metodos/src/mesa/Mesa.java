package mesa;

/**
 *
 * @author DANIEL
 */
public class Mesa 
{
    String color;
    
    float tamanio,tamanio1;
    
    public String retonarColor()
    {
        return color;
    }
    
    public void mostrarColor()
    {
        System.out.println("Mesa: Marron");
    }
    
    public float mostrarTamanio()
    {
        return (float) 1.10;
        
    }
    
    public float mostrarTamanio1()
    {
        return (float) 0.80;
    }

    
    public static void main(String[] args) 
    {
        Mesa mesa01 = new Mesa();
        
        mesa01.mostrarColor();
        
        System.out.println("Tamanio: "+mesa01.mostrarTamanio()+" x "+mesa01.mostrarTamanio1()+" metros");
    }
    
}
