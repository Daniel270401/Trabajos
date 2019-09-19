package calzado;

/**
 *
 * @author DANIEL
 */
public class mainCalzado 
{
    public static void main(String[] args) 
    {
        Calzado calzado01 = new Calzado();
        calzado01.mostrarForma();
        
        System.out.println("Talla: Numero "+calzado01.mostrarTamanio());
    }
}
