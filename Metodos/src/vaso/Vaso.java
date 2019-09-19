package vaso;

public class Vaso 
{
    String tipo;
    float tamanio;
    
    public String retornarTipo()
    {
        return tipo;
    }
    
    public void mostrarTipo()
    {
        System.out.println("Tipo: Cristal");
    }
    
    public float mostrarTamanio()
    {
        return (float) 0.30;
    }
    
    public static void main(String[] args) 
    {
        Vaso vaso01 = new Vaso();
        vaso01.mostrarTipo();
        System.out.println("La altura es: "+vaso01.mostrarTamanio()+" m");
    }
    
}
