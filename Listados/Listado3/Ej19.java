package Listados.Listado3;

class Balde{
	private int capacidad;
	private int contenido;
	public Balde(int c){
		this.contenido = 0;
		this.capacidad = c;
	}
	public void llenar(int x){
		if(contenido + x < capacidad && x >=0){
			contenido = contenido + x; 
		} 
		else if(contenido + x >= capacidad && x >= 0){
			contenido = capacidad;
		}
		else if(x < 0){

		}
	}
	public int verificar(){
		return contenido;
	}
	public int vaciar(int v){
		int r = 0;
		if(v < contenido && v >= 0){
			//r = v;
			contenido = contenido - v;
			return v;
		}
		else if(v >= contenido && v >= 0){
			r = contenido;
			contenido = 0;	
			return contenido;
		}
		return r;
	}
}

public class Ej19{
	public static void main(String[] args){
        Balde b = new Balde(5);     
        b.llenar(3);
        int s = b.vaciar(2); 
        System.out.println(s);             
        System.out.println(b.verificar()); 
    }
}
