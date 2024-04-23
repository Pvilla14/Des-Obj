package Listados.Listado4;

class CreaYPruebaBebida {
    public CreaYPruebaBebida(int que, int serie){
        Bebida b=null;
        switch (que){
            case 1:  b = new Sprite(serie); break;
            case 2:  b = new Fanta(serie); break;
            case 3:  b = new Kem(serie); break;
            case 4:  b = new CocaCola(serie); break;
            default: return;
        }
        System.out.println(b.getSerie()+": "+b.beber());  
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
public class Ej40 {
    public static void main(String[] args) {
        CreaYPruebaBebida.pruebaeSerieBebe(1,129);
        CreaYPruebaBebida.CreaYPruebaBebida(2,130);
        CreaYPruebaBebida.CreaYPruebaBebida(2,131);
        CreaYPruebaBebida.CreaYPruebaBebida(1,132);
        CreaYPruebaBebida.CreaYPruebaBebida(3,133);
        CreaYPruebaBebida.CreaYPruebaBebida(4,134);
        CreaYPruebaBebida.CreaYPruebaBebida(4,135);
        CreaYPruebaBebida.CreaYPruebaBebida(3,136);
    }
}
