package Listados.Listado4;

class SumaResta{
    private float uno;
    private float dos;
    public SumaResta(float p, float q){
        uno = p;
        dos = q;
    }
    public float suma(){
        return (uno + dos);
    }
    public float resta(){
        return (uno - dos);
    }
    public float getUno(){
        return uno;
    }
    public float getDos(){
        return dos;
    }
}
class CuatroOperaciones extends SumaResta{
    public CuatroOperaciones(float p, float q){
        super(p,q);
    }
    public float multiplica(){
        return getUno()*getDos();
    }
    public float divide(){
        return getUno()/getDos();
    }
}
public class Ej39 {
    public static void main(String[] args) {
        CuatroOperaciones co = new CuatroOperaciones(5, 10);
        System.out.println(co.suma());
        System.out.println(co.resta());
        System.out.println(co.multiplica());
        System.out.println(co.divide());
    }
    
}
