package Listados.Listado3;

import java.util.ArrayList;

class Bebida{
    private int serie;
    public Bebida(int x){
        serie = x;
    }
    public int getSerie(){
        return serie;
    }
    public void beber(){

    }
}
class Deposito{
    private ArrayList<Bebida> stok;
    public Deposito(){
        stok = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida b){
        stok.add(b); 
    }
    public Bebida getBebida(){
        if(stok.size() != 0){
            return stok.remove(0);
        }
        else{
            return null;
        }
    }
}
public class Ej26 {
    public static void main(String[] args) {
        Deposito d=new Deposito( );
        d.addBebida(new Bebida(7));
        System.out.println(d.getBebida());
        d.addBebida(new Bebida(8));
        System.out.println(d.getBebida());
        System.out.println(d.getBebida());
        d.addBebida(new Bebida(9));
        d.addBebida(new Bebida(10));
        System.out.println(d.getBebida());
        d.addBebida(new Bebida(11));
        d.addBebida(new Bebida(12));
        d.addBebida(new Bebida(13));
        d.addBebida(new Bebida(14));
        d.addBebida(new Bebida(15));
        d.addBebida(new Bebida(16));
        d.addBebida(new Bebida(17));
        d.addBebida(new Bebida(18));
    }
}
