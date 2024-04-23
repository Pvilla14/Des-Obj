package Listados.Listado3;

import Listados.Listado4.Bebida;

class Bebida{
    public static final int VOLUMEN = 500;
    private int contenido;
    private int serie;
    public Bebida(int x){
        serie = x;
        contenido = 0;
    } 
    public int getSerie(){
        return serie;
    }
    public void llenar(int v){
        if(contenido + v <= Bebida.VOLUMEN){
            contenido += v;
        }
        else if(contenido + v > Bebida.VOLUMEN){
            contenido = Bebida.VOLUMEN;
        }
    }
    public int cont(){
        return contenido;
    }
    public int beber(int b){
        if(contenido - b >= 0 && b > 0){
            contenido -= b;
            return b;
        }
        else if(contenido == 0){
            return 0;
        }
        else if(contenido - b < 0) {
            int aux = contenido;
            contenido = 0;
            return aux;
        }
        else{
            return 0;
        }
    }
}

public class Ej25 {
    public static void main(String[] args) {
        Bebida b=new Bebida(19);
        b.llenar(1209);
        Bebida bb=new Bebida(20);
        bb.llenar(200);
        Bebida bbb=new Bebida(21);
        bbb.llenar(500);
        System.out.println(b.getSerie());
        System.out.println(b.beber(2000));
        System.out.println(b.beber(2000));
        System.out.println(bb.getSerie());
        System.out.println(bb.beber(500));
        System.out.println(bb.beber(500));
        System.out.println(bbb.getSerie());
        System.out.println(bbb.beber(9));
        System.out.println(bbb.beber(200));
        System.out.println(bbb.beber(300));
        System.out.println(bbb.beber(300));
    }
}
