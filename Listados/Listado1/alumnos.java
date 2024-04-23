package Listados.Listado1;
import java.util.Scanner;
public class alumnos{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("ingrese la cantidad de alumnos: ");
		int cant = scanner.nextInt();
		float[] notas = new float[cant];
		String[] nombres = new String[cant];
		String[] resultados = new String[cant];
		for(int i = 0; i < cant; i++){
			System.out.print("ingrese el nombre del alumno: ");
			String nombre = scanner.nextLine();
			nombres[i] = nombre;
			System.out.print("ingrese la nota del alumno: ");
			float nota = scanner.nextFloat();
			while(nota < 0 || nota > 10){
				System.out.print("nota mal ingreada, ingrese la nota del alumno denuevo: ");
				nota = scanner.nextFloat();
			}
			if(nota <= 4.99){
			resultados[i] = "Suspenso";
			}
			else if(nota >= 5.00 || nota <= 6.99){
			resultados[i] = "Bien";
			}
			else if(nota >= 7.00 || nota <= 8.99){
			resultados[i] = "Notable";
			}
			else{
			resultados[i] = "sobresaliente";
		    }
        }
		for(int i = 0; i < cant; i++){
			System.out.print("El alumno " + nombres[i]);
			System.out.println(" cuya nota es " + notas[i]);
			System.out.println(" tubo la calificacioón de " + resultados[i]);
		}
	}
}