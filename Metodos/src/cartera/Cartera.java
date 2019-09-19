package cartera;

/**
 *
 * @author DANIEL
 */
public class Cartera 
{
    String tipo;
    String color;
    float tamanio;
    
    public String retonarTipo()
    {
        return tipo;
    }
    
    public String retonarColor()
    {
        return color;
    }
    
    public void mostrarTipo()
    {
        System.out.println("Cartera: Cuero");
    }
    
    public void mostrarColor()
    {
        System.out.println("Color: Marron");
    }
    
    public float mostrarTamanio()
    {
        return (float) 14;
    }
    
    public float mostrarTamanio2()
    {
        return (float) 27;
    }
    
    public float mostrarTamanio3()
    {
        return (float) 3;
    }
    public static void main(String[] args) 
    {
        Cartera cartera01 = new Cartera();
        cartera01.mostrarTipo();
        cartera01.mostrarColor();
        
        System.out.println("Tamanio: "+cartera01.mostrarTamanio()+" cm de alto");
        
        System.out.println("         "+cartera01.mostrarTamanio2()+" cm de ancho");
        
        System.out.println("         "+cartera01.mostrarTamanio3()+" cm de profundidad");
        
    }
    
}
