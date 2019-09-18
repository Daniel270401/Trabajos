package cartera;

public class Cartera 
{
    String tipo;
    String color;
    float tamanio;
    
    public Cartera(String tipo,String color,float tamanio)
    {
        this.tipo = tipo;
        this.color = color;
        this.tamanio = tamanio;
    }
    
    public void mostrarDatos()
    {
        System.out.println("El tipo de cartera es: "+tipo);
        System.out.println("El color es: "+color);
        System.out.println("El tamanio es: "+tamanio+"x"+tamanio);
    }
    
}
