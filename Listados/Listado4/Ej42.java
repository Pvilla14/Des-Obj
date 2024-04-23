import java.util.ArrayList;

public class Ej42 {
    public static void main(String[] args) {
        Deposito d = new Deposito();
        Bebida f = new Fanta(21);
        d.addBebida(f);
        Bebida b1 = d.getBebida();
        System.out.println(b1.getSerie() + b1.beber());
        System.out.println(d.getBebida());
        Bebida c = new CocaCola(25);
        d.addBebida(c);
        Bebida s = new Sprite(41);
        d.addBebida(s);
        Bebida k = new Kem(31);
        d.addBebida(k);
        Bebida b2 = d.getBebida();
        System.out.println(b2.getSerie() + b2.beber());
        Bebida b3 = d.getBebida();
        System.out.println(b3.getSerie() + b3.beber());
        Bebida b4 = d.getBebida();
        System.out.println(b4.getSerie() + b4.beber());
        System.out.println(d.getBebida());
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
        this.serie = x;
    }
    public int getSerie(){
        return serie;
    }
    public String beber(){
        return "sabor: ";
    }
}
class Fanta extends Bebida{
    public Fanta(int x){
        super(x);
    }
    public String beber(){
        return super.beber() + "fanta";
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
class Kem extends Bebida{
    public Kem(int x){
        super(x);
    }
    public String beber(){
        return super.beber() + "kem";
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

