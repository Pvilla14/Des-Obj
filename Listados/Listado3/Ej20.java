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
public class Ej20{
	public static void main(String[] args){
		Pelota p=new Pelota(5); 
          int s = p.dameTuSerie();
          System.out.println(s);
	}
}