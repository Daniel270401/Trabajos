package regla;
/**
 *
 * @author DANIEL
 */
public class Regla 
{
    float tamanio,tamanio2;
    String textura,textura2;
    
    public String retonarTextura()
    {
        return textura;
    }
    public void motrarTextura()
    {
        System.out.println("Regla: Plastico");
    }
    public float mostrarTamanio()
    {
        return (float) 30;
    }
    
    public String retonarTextura2()
    {
        return textura2;
    }
    public void motrarTextura2()
    {
        System.out.println("Regla: Metalico");
    }
    public float mostrarTamanio2()
    {
        return (float) 60;
    }
    
    
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

