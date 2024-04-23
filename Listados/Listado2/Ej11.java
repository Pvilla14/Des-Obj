package Listados.Listado2;

    class OtraClase{
        private int numero;
        public OtraClase(int x){
            numero = x;
        }
        public int sacaDato(){
            return numero;
        }
    }
public class Ej11 {
    public static void main(String[] args) {
        OtraClase o = new OtraClase(25);
        int res = o.sacaDato();
        System.out.println(res);
    }
}
