package tenedor;

public class Tenedor 
{   
    String cualidad;
    float peso;
    
    public Tenedor(String cualidad,float peso)
    {
        this.cualidad = cualidad;
        this.peso = peso;
    }
    
    public void mostrarDatos()
    {
        System.out.println("Su cualidad es: "+cualidad);
        System.out.println("Su peso es de: "+peso+" g");
    }
    
}
