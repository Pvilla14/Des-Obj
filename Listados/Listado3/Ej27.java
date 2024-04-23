package Listados.Listado3;

class Moneda{
    public Moneda(){
        
    }
}

class Bebida{
    public Bebida(){

    }
    public String beber(){
        return "gluglu";
    }
}
class Expendedor{
    public Expendedor(){

    }
    public Bebida comprarBebida(Moneda m){
        Bebida b = new Bebida();
        return b;
    }
}
public class Ej27 {
    public static void main(String[] args) {
        Moneda m = new Moneda();
        Expendedor e = new Expendedor();
        System.out.println("m = "+ m + " e = " + e);
        //e.comprarBebida(m);
        System.out.println("m = "+ m + " e = " + e);
        System.out.println(e.comprarBebida(m).beber());
    }
    
}