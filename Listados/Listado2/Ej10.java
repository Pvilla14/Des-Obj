package Listados.Listado2;
class Bebida{
    public Bebida(){
    }
    public String beber(){
        String s = new String("gluglu");
        return s;
    }
}
public class Ej10 {
    public static void main(String[] args){
        Bebida b = new Bebida();
        String x = b.beber();
        System.out.println(x);
    }
}
