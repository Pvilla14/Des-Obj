package Listados.Listado2;

class PrimeraClase{
    private String nombre;
    public PrimeraClase(String x){
        this.nombre = x;
    }
    public String getString(){
        return nombre;
    }
}
public class Ej9 {
    public static void main(String[] args){
        PrimeraClase p = new PrimeraClase("hola");
        String s = p.getString();
        System.out.println(s);
    }
    
}
