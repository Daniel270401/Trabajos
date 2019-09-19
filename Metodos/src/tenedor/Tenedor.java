package tenedor;

/**
 *
 * @author DANIEL
 */
public class Tenedor 
{
    float peso,peso1;

    String cualidad,cualidad1;

    public String retonarCualidad()
    {
        return cualidad;
    }
 
    public void mostrarCualidad()
    {
        System.out.println("Tenedor: Metalico");
    }
     
    public float mostrarPeso()
    {
        return (float) 0.8;
    }
    
     public void mostrarCualidad1()
    {
        System.out.println("Tenedor: Plastico");
    }
    
    public float mostrarPeso1()
    {
        return (float) 0.3;
    }

    
    public static void main(String[] args) 
    {
        Tenedor tenedor01 = new Tenedor ();

        tenedor01.mostrarCualidad();

        System.out.println("Peso: "+tenedor01.mostrarPeso()+"g");

        System.out.println("-------------------------");

        Tenedor tenedor02 = new Tenedor();

        tenedor02.mostrarCualidad1();

        System.out.println("Peso: "+tenedor02.mostrarPeso1()+"g");
    } 
}
