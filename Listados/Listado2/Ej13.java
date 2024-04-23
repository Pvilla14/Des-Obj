package Listados.Listado2;

class Bebida{
    private boolean llena;
    public Bebida(boolean a){
        this.llena = a;
    }
    public String beber(){
        if(llena == true){
            this.llena = false;
            String s = new String("gluglu");
            return s;
        }
        else{
            
            return null;
        }
    }
}
public class Ej13 {
    public static void main(String[] args) {
        Bebida b = new Bebida( true);
        System.out.println(b.beber());
        System.out.println(b.beber());
    }
    
}
