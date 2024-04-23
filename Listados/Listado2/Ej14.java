package Listados.Listado2;

class Promediador{
    private float s;
    private int n;
    public Promediador(){
        n = 0;
        s = 0;
    }
    public void agregaNumero(int nota){
        s = s + nota;
        n++;
    }
    public float promedio(){
        return (s/n);
    }
    public int numero(){
        return n;
    }

}
public class Ej14 {
    public static void main(String[] args) {
        Promediador p = new Promediador();
        p.agregaNumero(5);
        p.agregaNumero(8);
        p.agregaNumero(2);
        p.agregaNumero(4);
        float promediofinal = p.promedio();
        int cant = p.numero();
        System.out.println(promediofinal);
        System.out.println(cant);
    }
}
