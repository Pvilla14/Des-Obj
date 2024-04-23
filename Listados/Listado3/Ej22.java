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

class Tubo{
    private Pelota bola1, bola2;
    public Tubo(){
        bola1 = null;
        bola2 = null;
    }
    public Pelota meteA(Pelota p){
        if(bola1 == null && bola2 == null){
            bola1 = p;
            return null;
        }
        else if(bola1 != null && bola2 != null){
            Pelota aux = bola2;
            bola2 = bola1;
            bola1 = p;
            return aux;
        }
        else if(bola1 != null && bola2 == null){
            bola2 = bola1;
            bola1 = p;
            return null;
        }
        else{
            bola1 = p;
            return null;
        }
    }
    public Pelota meteB(Pelota p){
        if(bola2 == null && bola1 == null){
            bola2 = p;
            return null;
        }
        else if(bola2 != null && bola1 != null){
            Pelota aux = bola1;
            bola1 = bola2;
            bola2 = p;
            return aux;
        }
        else if(bola2 != null && bola1 == null){
            bola1 = bola2;
            bola2 = p;
            return null;
        }
        else{
            bola2 = p;
            return null;
        }
    }
    public void verTubo(){
        if(bola1 != null && bola2 != null){
            System.out.println("A:[" + bola1.dameTuSerie() + "," + bola2.dameTuSerie() + "]:B");
        }
        else if(bola1 == null && bola2 != null){
            System.out.println("A:[" + null + "," + bola2.dameTuSerie() + "]:B");            
        }
        else if(bola1 != null && bola2 == null){
            System.out.println("A:[" + bola1.dameTuSerie() + "," + null + "]:B");            
        }
        else {
            System.out.println("A:[" + null + "," + null + "]:B");            
        }
    }

}

public class Ej22 {
    public static void main(String[] args) {
        Tubo t = new Tubo();
        Pelota sale;
        Pelota nueva;
        t.verTubo();
        nueva = new Pelota(1001);
        sale = t.meteB(nueva);
        if(sale!=null){
            System.out.print(sale.dameTuSerie()+"<-");
        }
        else{
            System.out.print(sale+"<-");
        }
        System.out.println("[       ]<-" + nueva);

        t.verTubo();
        nueva = new Pelota(5002);
        sale = t.meteA(nueva);

        System.out.print(5002+"->[       ]");

        if(sale!=null){
            System.out.println("->"+sale.dameTuSerie());
        }
        else{
            System.out.println("->"+sale);
        }
        t.verTubo();
        for(int i=0;i<5;i++){
            int s= 14+i;
            nueva = new Pelota(s);
            sale = t.meteB(nueva);
            if(sale!=null){
                System.out.print(sale.dameTuSerie()+"<-");
            }
            else {
                System.out.print(sale+"<-");
            }
            System.out.println("[       ]<-"+ s);
            t.verTubo();
        }
        for(int i=0;i<5;i++){
            int s= 53+i;
            nueva = new Pelota(s);
            sale = t.meteA(nueva);
            System.out.print(s+"->[       ]");
            if(sale!=null){
                System.out.println("->"+sale.dameTuSerie());
            }
            else {
                System.out.println("->"+sale);
            }
            t.verTubo();
        }

    }
}
