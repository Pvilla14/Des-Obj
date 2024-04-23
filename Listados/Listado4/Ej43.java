import java.util.ArrayList;

public class Ej43 {
    public static void main(String[] args) {
        Expendedor Ex = new Expendedor(5);
        Moneda m = new Moneda();
        Bebida b = Ex.comprarBebida(m, 1);
        Moneda m2 = new Moneda();
        Bebida b2 = Ex.comprarBebida(m2, 2);
        System.out.println(b.beber());
        System.out.println(b.getSerie());
    }    
}
class Moneda{
    public Moneda(){

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
    public String beber(){
        return "sabor: ";
    }
}
class CocaCola extends Bebida{
    public CocaCola(int x){
        super(x);
    }
    public String beber(){
        return super.beber() + "cocacola";
    }
}
class Sprite extends Bebida{
    public Sprite(int x){
        super(x);
    }
    public String beber(){
        return super.beber() + "sprite";
    }
}
class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    public Expendedor( int cant){
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
