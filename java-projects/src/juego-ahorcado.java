import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Extra2 {

	public static void main(String[] args) {
		//EL JUEGO DEL AHORCADO
		String palabras [] = {"INFORMATICA","COCHE","PERRO","GATO"};
		Random rand = new Random();
		String palabraElegida;
		Scanner lector = new Scanner (System.in);
		String  letraUsuario;
		int vidas = 5;
		boolean acertada = false;
		int contadorNoAcertadas  = 0;
		
		while(true) {
			//Doy vidas al usuario
			vidas = 5;
			//Elijo la palabra de `?la matriz de forma random
			palabraElegida = palabras[rand.nextInt(palabras.length)];
			//Divido la palabra en letras
			System.out.println("Palabra elegida aleatoriamente:");
			System.out.println(palabraElegida);
			String palabraTroceada []= palabraElegida.split("");
			System.out.println("Para que puedas ver la palabra troceada:");
			System.out.println(Arrays.toString(palabraTroceada));
			//pinto al usuario un _
			String palabrasUsuario [] = new String [palabraTroceada.length];
			for (int i = 0; i < palabrasUsuario.length; i++) {
				palabrasUsuario[i]="_";
			}
			//Muestro al usuario cuantas letras tiene la palabra
			System.out.println("Esto es lo ?nico que se le mostrar?a al jugador:");
			System.out.println(Arrays.toString(palabrasUsuario));
			while(vidas>0){
				//Pregunto al usuario que me diga que letra piensa
				System.out.println("Introduce una letra:");
				letraUsuario = lector.nextLine();
				for (int i = 0; i < palabraTroceada.length; i++) {
					if(palabraTroceada[i].equals(letraUsuario)) {
						//Muestro al usuario la letra
						palabrasUsuario[i] = palabraTroceada[i];
						acertada= true;
					}
				}
				if(acertada) {
					System.out.println("La letra " + letraUsuario + " se encuentra en la palabra!.");
					acertada = false;
				}
				else {
					vidas --;
					System.out.println("La letra " + letraUsuario + " no se encuentra en la palabra.");
					System.out.println("Te quedan " + vidas + " vidas");
				}
				System.out.println(Arrays.toString(palabrasUsuario));
				//Compruebo si ya se acertaron todas
				for (int i = 0; i < palabrasUsuario.length; i++) {
					if(palabrasUsuario[i].equals("_")) {
						contadorNoAcertadas++;
						break;
					}
				}
				if(contadorNoAcertadas == 0) {
					System.out.println("Has ganado!!");
					contadorNoAcertadas = 0;
					break;
				}
				else {
					contadorNoAcertadas = 0;
				}
				System.out.println();
			}
			System.out.println();		
		}
	}

}
