package regla;

/**
 *
 * @author DANIEL
 */
public class mainRegla 
{
    public static void main(String[] args) 
    {
        System.out.println("-------------------------");
        Regla regla01 = new Regla();
        regla01.motrarTextura();
        System.out.println("Tamanio: "+regla01.mostrarTamanio()+" cm");
        System.out.println("-------------------------");
        
        Regla regla02 = new Regla();
        regla02.motrarTextura2();
        System.out.println("Tamanio: "+regla02.mostrarTamanio2()+" cm");
        System.out.println("-------------------------");
    }
}
