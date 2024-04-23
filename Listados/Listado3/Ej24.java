package Listados.Listado3;

class CuatroOperaciones{
    private SumaResta operacion;
    public CuatroOperaciones(float num1, float num2){
        this.operacion = new SumaResta(num1, num2);
    }
    public float multiplica(){
        return((operacion.getUno())*(operacion.getDos()));
    }
    public float divide(){
        return ((operacion.getUno()/(operacion.getDos())));
    }
    public float suma(){
        return operacion.suma();
    }
    public float resta(){
        return operacion.resta();
    }
}

public class Ej24 {
    public static void main(String[] args) {
        
    }
}

class SumaResta{
    private float s1;
    private float s2;
    public SumaResta(float x, float y){
        this.s1 = x;
        this.s2 = y;
    }
    public float suma(){
        float c = s1+s2;
        return (c);
    }
    public float resta(){
        float c = s1-s2;
        return c;
    }
    public float getUno(){
        return s1;
    }
    public float getDos(){
        return s2;
    }
}
