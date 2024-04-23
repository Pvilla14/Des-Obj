import java.util.ArrayList;

public class Ej109 {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(6,1300);
        Moneda m = null;
        Comprador c=null;
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste() + ", $" + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste() + ", $" + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste() + ", $" + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste() + ", $" + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste() + ", $" + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste() + ", $" + c.cuantoVuelto());

        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste() + ", $" + c.cuantoVuelto());
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste() + ", $" + c.cuantoVuelto());
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste() + ", $" + c.cuantoVuelto());
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste() + ", $" + c.cuantoVuelto());
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste() + ", $" + c.cuantoVuelto());
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste() + ", $" + c.cuantoVuelto());
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
class DepositoM{
    private ArrayList<Moneda> Arr;
    public DepositoM(){
        Arr = new ArrayList<Moneda>();
    }
    public void addMoneda(Moneda mon){
        Arr.add(mon);
    }
    public Moneda getMoneda(){
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
class Comprador{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda mon, int cualBebida, Expendedor exp){
        Bebida be = exp.comprarBebida(mon, cualBebida);
        if(be != null){
            sonido = be.beber();
        }
        else{
            sonido = null;
        }
        Moneda aux = exp.getVuelto();
        while(aux != null){
            vuelto += aux.getValor();
            aux = exp.getVuelto();
        }
    }
    public String queBebiste(){
        return sonido;
    }

    public int cuantoVuelto(){
        return vuelto;
    }
}
class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu = new DepositoM();
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public int precio;
    public Expendedor( int cant, int preciodef){
        precio = preciodef;
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
        if(m != null){
            if(m.getValor() < precio || (tipo != COCA && tipo != SPRITE)){
                monVu.addMoneda(m);
                return null;
            }
            if(tipo == COCA){//coca
                Bebida b = coca.getBebida();
                if(b != null){
                    for(int i = m.getValor() - precio; i > 0; i -= 100){
                        monVu.addMoneda(new Moneda100());
                    }
                    return b;
                }
                else{
                    for(int i = m.getValor(); i > 0; i -= 100){
                        monVu.addMoneda(new Moneda100());
                    }
                    return null;
                }
                
            }
            else if(tipo == SPRITE){//sprite
                Bebida b = sprite.getBebida();
                if(b != null){
                    for(int i = m.getValor() - precio; i > 0; i -= 100){
                        monVu.addMoneda(new Moneda100());
                    }
                    return b;
                }
                else{
                    for(int i = m.getValor(); i > 0; i -= 100){
                        monVu.addMoneda(new Moneda100());
                    }
                    return null;
                }
            }
            else{
                for(int i = m.getValor(); i > 0; i -= 100){
                    monVu.addMoneda(new Moneda100());
                }
                return null;
            }
        }
        else{
            return null;
        }
    }
    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}

