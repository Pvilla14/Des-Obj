package Listados.Listado2;

class Balde{
    public Balde(){
    }
    private int contenido = 0;
    public void llenar(int litros){
        contenido += litros;
        if(contenido > 12){
            contenido = 12;
        }
    }  
    public int verificar(){
        return contenido;
    }
    
}
public class Ej8 {
    public static void main(String[] args){
        Balde b = new Balde();
        b.llenar(5);
        int llenado = b.verificar();
        System.out.println(llenado);
    }
    
}
