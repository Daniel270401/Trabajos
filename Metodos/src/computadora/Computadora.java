package computadora;

public class Computadora 
{
    int resolucion,resolucion1;
    int capacidad;
    String marca;
    
    public String retornarMarca()
    {
        return marca;
    }
    
    public void mostrarCapacidad()
    {
        System.out.println("Capacidad de 1 terabyte");
    }
    
    public int mostrarResolucion()
    {
        return 144;
    }
    
    public int mostrarResolucion1()
    {
        return 144;
    }
    
    
    public static void main(String[] args) 
    {
        Computadora compu01 = new Computadora();
        compu01.mostrarCapacidad();
        System.out.println("La resolucion es de "+compu01.mostrarResolucion()+" X "+compu01.mostrarResolucion1()+" pixeles");
    }
    
}
