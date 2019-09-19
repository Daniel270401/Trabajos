package calzado;

/**
 *
 * @author DANIEL
 */
public class Calzado 
{
    String forma;
    float tamanio;
    
    public String retornarForma()
    {
        return forma;
    }
    
    public void mostrarForma()
    {
        System.out.println("Forma: Deportivo");
    }
    
    public float mostrarTamanio()
    {
        return (float) 38;
    }
    public static void main(String[] args) 
    {
        Calzado calzado01 = new Calzado();
        calzado01.mostrarForma();
        
        System.out.println("Talla Numero "+calzado01.mostrarTamanio());
    }
    
}
