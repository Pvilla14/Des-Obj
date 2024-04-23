import java.util.ArrayList;

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
    public abstract String beber();
}
class Fanta extends Bebida{
    public Fanta(int x){
        super(x);
    }
    public String beber(){
        return "fanta";
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
class Kem extends Bebida{
    public Kem(int x){
        super(x);
    }
    public String beber(){
        return "kem";
    }
}
class CocaCola extends Bebida{
    public CocaCola(int x){
        super(x);
    }
    public String beber(){
        return "cocacola";
    }
}

public class Ej41 {
    public static void main(String[] args) {
        Deposito d = new Deposito();
        Fanta f = new Fanta(21);
        d.addBebida(f);
        Bebida b1 = d.getBebida();
        System.out.println(b1.getSerie());
        System.out.println(d.getBebida());
        d.addBebida(new CocaCola(29));
        Sprite s = new Sprite(41);
        d.addBebida(s);
        Kem k = new Kem(31);
        d.addBebida(k);
        System.out.println(d.getBebida());
        System.out.println(d.getBebida());
        d.getBebida();
        System.out.println(d.getBebida());

    }
}

