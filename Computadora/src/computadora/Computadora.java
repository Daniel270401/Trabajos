package computadora;

public class Computadora 
{
    String marca;
    int resolucion,resolucion1;
    int capacidad;
    
    public Computadora(String marca,int resolucion,int resolucion1,int capacidad)
    {
        this.marca = marca;
        this.resolucion = resolucion;
        this.resolucion1 = resolucion1;
        this.capacidad = capacidad;
    }
    
    public void mostrarDatos()
    {
        System.out.println("La marca es: "+marca);
        System.out.println("La resolucion es de "+resolucion+" X "+resolucion1+" pixeles");
        System.out.println("Su capacidad es de "+capacidad+" terabyte");
    }
}
