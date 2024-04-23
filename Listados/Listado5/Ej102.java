import java.util.ArrayList;

public class Ej102 {
    public static void main(String[] args) {
        CocaCola coc = new CocaCola(2);
        Sprite spr = new Sprite(3);
        System.out.println(spr.beber() + spr.getSerie());
        System.out.println(coc.beber() + coc.getSerie());
    }    
}

abstract class Moneda{
    private int serie;
    public Moneda(){
    }
    public Moneda getSerie(){
        return this;
    }
    public abstract int getValor();
}
class Moneda1500 extends Moneda{
    public Moneda1500(){
        super();
    }
    public int getValor(){
        return 1500;
    }
}
class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }
    public int getValor(){
        return 1000;
    }
}
class Moneda500 extends Moneda{
    public Moneda500(){
        super();
    }
    public int getValor(){
        return 500;
    }
}
class Moneda100 extends Moneda{
    public Moneda100(){
        super();
    }
    public int getValor(){
        return 100;
    }
}
class Deposito{
    private ArrayList<Bebida> Arr;
    public Deposito(){
        Arr = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida beb){
        Arr.add(beb);
    }
    public Bebida getBebida(){
        if(Arr.size() > 0){
            return Arr.remove(0);
        }
        return null;
    }
}
abstract class Bebida{
    private int serie;
    public Bebida(int x){
        serie = x;
    }
    public int getSerie(){
        return serie;
    }
    public abstract String beber();
}
class CocaCola extends Bebida{
    public CocaCola(int x){
        super(x);
    }
    public String beber(){
        return "cocacola";
    }
}
class Sprite extends Bebida{
    public Sprite(int x){
        super(x);
    }
    public String beber(){
        return "sprite";
    }
}
class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    public Expendedor( int cant, int precio){
        coca = new Deposito();
        for(int i = 0; i < cant; i++){
            CocaCola c = new CocaCola(100 + i);
            coca.addBebida(c);
        }
        sprite = new Deposito();
        for(int i = 0; i < cant; i++){
            Sprite s = new Sprite(200 + i);
            sprite.addBebida(s);
        }
    }
    public Bebida comprarBebida(Moneda m, int tipo){
        if(tipo == 1){//coca
            return coca.getBebida(); 
        }
        else if( tipo == 2){ //sprite
            return sprite.getBebida();
        }
        else{
            return null;
        }
        
    }
}

