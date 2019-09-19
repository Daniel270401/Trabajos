package gato;

public class Gato
{
    String color;
    float peso;
    float tamanio;
    
    public Gato(String color,float peso,float tamanio)
    {
        this.color = color;
        this.peso = peso;
        this.tamanio = tamanio;
    }
  
    public void mostrarDatos()
    {
        System.out.println("Su color es "+color);
        System.out.println("Su peso es "+peso+" kg");
        System.out.println("Su tamanio es "+tamanio+" m");
    }
    
}
