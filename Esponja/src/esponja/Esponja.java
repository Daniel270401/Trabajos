package esponja;

public class Esponja 
{    
    String textura;
    float tamanio,tamanio2;
    
    public Esponja(String textura,float tamanio,float tamanio2)
    {
        this.textura = textura;
        this.tamanio = tamanio;
        this.tamanio2 = tamanio2;
    }
    
    public void mostrarDatos()
    {
        System.out.println("Su textura es "+textura);
        System.out.println("El tamanio es: "+tamanio+" X "+tamanio2+ " cm");
    }
    
}
