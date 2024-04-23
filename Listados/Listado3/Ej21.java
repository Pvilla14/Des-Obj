package Listados.Listado3;

class Pelota{
    private int serie;
    public Pelota(int x){
        serie = x;
    }
    public int dameTuSerie(){
        return serie;
    }
}

class EnvaseCarton{
    private Pelota pel;
    public EnvaseCarton(){
        pel = null;
    }
    public Pelota metePelota(Pelota p){
        if(pel == null){
            pel = p;
            return null;
        }
        else{
            return p;
        }
    }
    public Pelota damePelota(){
        if(pel != null){
            Pelota aux = pel;
            pel = null;
            return aux;
        }
        else{
            return null;
        }
    }
}
public class Ej21{
	public static void main(String[] args){
        EnvaseCarton ec = new EnvaseCarton();   //crea un envase
        Pelota p1=new Pelota(5);                //crea instancia con serie 5
        Pelota r1 = ec.metePelota(p1);          //trata de meter pelota 5 y recibe confirmacion de si se pudo
        if(p1==r1){
            System.out.println("NO entro"+": "+p1.dameTuSerie()); //si devuelve la misma direccion significa que la pelota NO entro
        }
        else {
            System.out.println("SI entro"+": "+p1.dameTuSerie());      //si devuelve null significa que le pelota entro
        }
        Pelota p2=new Pelota(6);                //crea otra instancia con serie 6
        Pelota r2 = ec.metePelota(p2);                          //trata de meter pelota 6 y recibe confirmacion de si se pudo
        if(p2==r2){
            System.out.println("NO entro"+": "+p2.dameTuSerie()); //si devuelve la misma direccion significa que la pelota NO entro
        }
        else {
            System.out.println("SI entro"+": "+p2.dameTuSerie());      //si devuelve null significa que le pelota entro
        }
        Pelota saca1 = ec.damePelota();                         //trata de sacar la pelota que haya en el envase
        if(saca1!=null){
        System.out.println(saca1.dameTuSerie()); //imprime serie si es que habia pelota, deberia imprimir puntero no null
        }
        else{
         System.out.println(saca1);                         //imprime el valor del puntero si es null
        }
         Pelota saca2 = ec.damePelota();                         //trata de sacar la pelota que haya, otra vez
        if(saca2!=null){
            System.out.println(saca2.dameTuSerie()); //imprime serie si es que habia pelota
        }
        else {
            System.out.println(saca2);
        }
    }
}
