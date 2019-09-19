package tenedor;

/**
 *
 * @author DANIEL
 */
public class mainTenedor 
{
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
