package gato;

public class Gato 
{
    String color;
    float peso;
    float tamanio;
    
    public String retornarColor()
    {
        return color;
    }
    
    public void mostrarColor()
    {
        System.out.println("Color: Blanco");
    }
    
    public float mostrarPeso()
    {
        return (float) 7.5;
    }
    
    public void mostrarTamanio()
    {
        System.out.println("Tamanio: 1.25 m");
    }
    
    public static void main(String[] args) 
    {
        Gato gato01 = new Gato();
        gato01.mostrarColor();
        gato01.mostrarTamanio();
        System.out.println("Peso: "+gato01.mostrarPeso()+" kg");
    }
}
