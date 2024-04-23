package Listados.Listado3;

class SumaResta{
    private float a;
    private float b;
    public SumaResta(float x, float y){
        a = x;
        b = y;
    }
    public float suma(){
        float c = a+b;
        return (c);
    }
    public float resta(){
        float c = a-b;
        return c;
    }

}

public class Ej23 {
    public static void main(String[] args){
        float d = 5;
        float e = -1;
        SumaResta s= new SumaResta(d, e);
        System.out.println(s.suma());
        System.out.println(s.resta());


    }
    
}