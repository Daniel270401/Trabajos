package regla;

public class Regla 
{
    String textura;
    float tamanio,tamanio2;
   
    public Regla(String textura,float tamanio,float tamanio2)
    {
        this.textura = textura;
        this.tamanio = tamanio;
        this.tamanio2 = tamanio2;
    }
    
    public void mostrarDatos()
    {
        System.out.println("Su textura es "+textura);
        System.out.println("El tamanio es: "+tamanio+" X "+tamanio2+" cm");
    }
    
}
