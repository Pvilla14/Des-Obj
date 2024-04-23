package Listados.Listado4;

class SumaResta{
    protected float uno;
    protected float dos;
    public SumaResta(){

    }
    public float suma(){
        return (uno + dos);
    }
    public float resta(){
        return (uno - dos);
    }
}
class CuatroOperaciones extends SumaResta{
    public CuatroOperaciones(float x, float y){
        this.uno = x;
        this.dos = y;
    }
    public float multiplica(){
        return uno*dos;
    }
    public float divide(){
        return uno/dos;
    }
}
public class Ej38 {
    public static void main(String[] args) {
        CuatroOperaciones co = new CuatroOperaciones(5, 10);
        System.out.println(co.suma());
        System.out.println(co.resta());
        System.out.println(co.multiplica());
        System.out.println(co.divide());
    }
}
