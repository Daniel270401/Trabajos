package cartera;

/**
 *
 * @author DANIEL
 */
public class mainCartera 
{
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
