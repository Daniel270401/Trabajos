package mesa;

public class Mesa 
{
    String color;
    float tamanio,tamanio1;
    
    public Mesa(String color,float tamanio,float tamanio1)
    {
        this.color = color;
        this.tamanio = tamanio;
        this.tamanio1 = tamanio1;
    }
    
    public void mostrarDatos()
    {
        System.out.println("Su color es: "+color);
        System.out.println("El tamanio es "+tamanio+" X "+tamanio1);
    }
}
