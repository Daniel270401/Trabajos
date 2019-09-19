package vaso;

public class Vaso 
{    
    String tipo;
    float tamanio;
    
    public Vaso(String tipo,float tamanio)
    {
        this.tipo = tipo;
        this.tamanio = tamanio;
    }
    
    public void mostrarDatos()
    {
        System.out.println("El tipo es: "+tipo);
        System.out.println("Su altura es: "+tamanio+" m");
    }
    
}
