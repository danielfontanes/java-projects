import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int seleccion;
		Random rand = new Random();
		int numeroRandom= 0;
		int intentos= 0;
		boolean primeraPartida = true;
		String continuar;
		boolean respuesta= false;
		
		while(true) {
			if(primeraPartida==true) {
				System.out.println("Bienvenido al juego de adivina un n�mero:");
				primeraPartida=false;
			}
			else{
				while(respuesta== false) {
					System.out.println("�Te apetece jugar otra partida?(Y/N)");
					continuar = lector.nextLine();
					if(continuar.equals("Y")){
						System.out.println("Esa es la actitud!!");
						System.out.println();
						respuesta= true;
					}
					else if(continuar.equals("N")) {
						System.out.println("El juego a finalizado.");
						System.exit(0);
					}
				}
				respuesta= false;
			}
			System.out.println("Elige un Nivel:");
			System.out.println("1. Nivel 1. El n�mero generado est� entre 1 y 15. Tienes 3 intentos.");
			System.out.println("2. Nivel 2. El n�mero generado est� entre 1 y 30. Tienes 4 intentos.");
			System.out.println("3. Nivel 3. El n�mero generado est� entre 1 y 50. Tienes 5 intentos.");
			seleccion = Integer.parseInt(lector.nextLine());
			//Nivel 1
			if(seleccion==1) {
				System.out.println("Seleccionaste el Nivel 1. Parece que eres poco valiente.");
				numeroRandom = rand.nextInt(15);
				//Para que el n�mero no sea 0
				numeroRandom++;
				intentos=3;
				while(intentos>0) {
					System.out.println("Introduce un n�mero:");
					if(numeroRandom == Integer.parseInt(lector.nextLine())) {
						System.out.println("Acertaste el n�mero �Felicidades!.");
						break;
					}
					else {
						intentos--;
						System.out.println("No acertaste el n�mero. Te qued�n " + intentos + " intentos.");
					}
					if(intentos==0) {
						System.out.println("El n�mero era el " + numeroRandom);
						System.out.println("La pr�xima vez seguro que aciertas!!");
					}
				}
			}
			//Nivel 2
			if(seleccion==2) {
				System.out.println("Seleccionaste el Nivel 2. Parece una buena decisi�n.");
				numeroRandom = rand.nextInt(30);
				//Para que el n�mero no sea 0
				numeroRandom++;
				intentos=4;
				while(intentos>0) {
					System.out.println("Introduce un n�mero:");
					if(numeroRandom == Integer.parseInt(lector.nextLine())) {
						System.out.println("Acertaste el n�mero �Felicidades!.");
						break;
					}
					else {
						intentos--;
						System.out.println("No acertaste el n�mero. Te qued�n " + intentos + " intentos.");
					}
					if(intentos==0) {
						System.out.println("El n�mero era el " + numeroRandom);
						System.out.println("La pr�xima vez seguro que aciertas!!");
					}
				}
			}
			//Nivel 3
			if(seleccion==3) {
				System.out.println("Seleccionaste el Nivel 3. Parece que tienes confianza en ti mismo.");
				numeroRandom = rand.nextInt(50);
				//Para que el n�mero no sea 0
				numeroRandom++;
				intentos=5;
				while(intentos>0) {
					System.out.println("Introduce un n�mero:");
					if(numeroRandom == Integer.parseInt(lector.nextLine())) {
						System.out.println("Acertaste el n�mero �Felicidades!.");
						break;
					}
					else {
						intentos--;
						System.out.println("No acertaste el n�mero. Te qued�n " + intentos + " intentos.");
					}
					if(intentos==0) {
						System.out.println("El n�mero era el " + numeroRandom);
						System.out.println("La pr�xima vez seguro que aciertas!!");
					}
				}
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	}

}
