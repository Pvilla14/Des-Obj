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
    public String beber(){
        return "gluglu";
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

class Moneda{
    public Moneda(){

    }
}

class Expendedor{
    private Deposito d = new Deposito();
    public Expendedor(int c){
        for(int i = 0; i < c; i++){
            Bebida b = new Bebida(i);
            d.addBebida(b);
        }
    }
    public Bebida comprarBebida(Moneda m){
        return d.getBebida();
    }
}

public class Ej28 {
    public static void main(String[] args) {
        Expendedor e = new Expendedor(2);
        Moneda M = new Moneda();
        Bebida be = e.comprarBebida(M);
        Bebida bee = e.comprarBebida(M);
        System.out.println(be);
        System.out.println(bee);
    }
}
