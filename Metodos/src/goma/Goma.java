package goma;

/**
 *
 * @author DANIEL
 */
public class Goma 
{
    String tipo;
    float peso;
    
    public String retornarTipo()
    {
        return tipo;
    }
    public void mostrarTipo()
    {
        System.out.println("Tipo: Cola");
    }
    public float mostrarPeso()
    {
        return (float) 2.5;
    }
    

    public static void main(String[] args) 
    {
        Goma goma01 = new Goma();
        goma01.mostrarTipo();
        System.out.println("Peso: "+goma01.mostrarPeso()+" gr");
    }
    
}

