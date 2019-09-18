package goma;

public class Goma 
{    
    String tipo;
    float peso;
    
    public Goma(String tipo,float peso)
    {
        this.tipo = tipo;
        this.peso = peso;
    }
    
    public void mostrarDatos()
    {
        System.out.println("El tipo es: "+tipo);
        System.out.println("Su peso es de "+peso+" ml");
    }
    
}
