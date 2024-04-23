package Listados.Listado2;

class Persona{
    private boolean estado;
    private String nombre;
    public Persona(String sellama, boolean siono){
        estado = siono;
        nombre = sellama;
    }
    public boolean esCasado(){
        return estado;
    }
    public String elNombre(){
        return nombre;
    }

}
public class Ej12 {
    public static void main(String[] args) {
        Persona p = new Persona("papito", false);
        boolean e = p.esCasado();
        String n = p.elNombre();
        System.out.println(e);
        System.out.println(n);
      }
}
