package calzado;

public class Calzado 
{
    String tipo;
    float tamanio;
    
    public Calzado(String tipo,float tamanio)
    {
        this.tipo = tipo;
        this.tamanio = tamanio;
    }
    
    public void mostrarDatos()
    {
        System.out.println("El tipo es: "+tipo);
        System.out.println("El tamanio es: "+tamanio);
    }
    
}
