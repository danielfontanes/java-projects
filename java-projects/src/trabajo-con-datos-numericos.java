import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public abstract class Ejercicio1 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String seleccion;
		String numeroIntroducido;
		int media= 0;
		int contador= 0;
		int valorMaximo= 0;
		int posicionValorMaximo= 0;
		int segundoValorMaximo = 0;
		int posicionSegundoValorMaximo= 0;
		int valorMinimo = 100;
		int posicionValorMinimo= 0;
		int segundoValorMinimo = 100;
		int posicionSegundoValorMinimo= 0;

		
		while(true) {
			//Lleno array de n?meros aleatorios entre 0 y 100
			int numeros[] = new int[100];
			Random rand = new Random();
			for(int i=0;i<numeros.length;i++) {
				numeros[i] = rand.nextInt(101);
			}
			//Mostrar men? por pantalla
			System.out.println("Selecciona una opci?n:");
			System.out.println("a. Mostrar valores superiores a un n?mero introducido.");
			System.out.println("b. Calcular la media de los 50 primeros valores almacenados.");
			System.out.println("c. Mostrar por pantalla los 10 primeros valores que sean superiores a 20 junto con las posiciones que ocupan.");
			System.out.println("d. Mostrar por pantalla el primer valor inferior a un n?mero introducido.");
			System.out.println("e. Mostrar por pantalla los valores que sean primos.");
			System.out.println("f. Mostrar el valor m?ximo, el m?nimo del array, el segundo m?s alto y el segundo m?s peque?o junto con las posiciones que ocupan.");
			System.out.println("g. Mostrar por pantalla aquellos valores que sean m?ltiplos de 3 y 5 en binario.  ");
			System.out.println("h. Salir");
			
			//Leemos seleccion del usuario
			System.out.println("Indique con una letra el apartado que desea:");
			seleccion = lector.nextLine();
			
			//Apartado a
			if(String.valueOf('a').equals(seleccion)) {
				System.out.println("Seleccionaste el apartado a");
				System.out.println("Introduce el n?mero que desea:");
				numeroIntroducido = lector.nextLine();
				for(int i=0;i<numeros.length;i++) {
					if(numeros[i]> Integer.parseInt(numeroIntroducido)) {
						System.out.print(numeros[i] + ",");
					}
				}
				System.out.println();
			}
			//Apartado b
			if(String.valueOf('b').equals(seleccion)) {
				System.out.println("Seleccionaste el apartado b");
				for(int i=0;i<50;i++) {
					media+=numeros[i];
				}
				System.out.println(media/50);
			}
			//Apartado c
			if(String.valueOf('c').equals(seleccion)) {
				System.out.println("Seleccionaste el apartado c");
				for(int i=0;i<numeros.length;i++) {
					if(numeros[i]>20 && contador<20) {
						System.out.println("numero: " +numeros[i] + " posici?n: " + i);
						contador++;
					}
				}
				contador= 0;
			}
			//Apartado d
			if(String.valueOf('d').equals(seleccion)) {
				System.out.println("Seleccionaste el apartado d");
				System.out.println("Introduce el n?mero que desea:");
				numeroIntroducido = lector.nextLine();
				for(int i=0;i<numeros.length;i++) {
					if(numeros[i]<Integer.parseInt(numeroIntroducido)) {
						System.out.println(numeros[i]);
						break;
					}
				}
				
			}
			//Apartado e
			if(String.valueOf('e').equals(seleccion)) {
				System.out.println("Seleccionaste el apartado e");
				for(int i=0;i<numeros.length;i++) {
					if(numeros[i]!=0 && numeros[i]!=1) {
						for(int j=2;j<(numeros[i]/2)+1;j++){
							if(numeros[i]%j==0){
								contador++;
								break;
							}
						}
					}
					else {
						contador++;
					}
					if(contador<1){
						System.out.print(numeros[i] + ", ");
					}
					contador= 0;
				}
				System.out.println();
			}
			//Apartado f
			if(String.valueOf('f').equals(seleccion)) {
				System.out.println("Seleccionaste el apartado f");
				for(int i=0;i<numeros.length;i++) {
					
					//VALORES MAXIMOS
					if(numeros[i]>valorMaximo) {
						//Para que si el valor maximo deja de ser el valor m?ximo pase a ser el segundo valor m?ximo
						segundoValorMaximo = valorMaximo;
						posicionSegundoValorMaximo = posicionValorMaximo;
						//Guardamos el valor m?ximo
						valorMaximo = numeros[i];
						posicionValorMaximo = i;
					}
					//Buscar segundo valor m?ximo
					if(numeros[i]<valorMaximo && numeros[i]>segundoValorMaximo) {
						segundoValorMaximo = numeros[i];
						posicionSegundoValorMaximo = i;
					}
					
					//VALORES M?NIMOS
					if(numeros[i]<valorMinimo) {
						//Para que si el valor m?nimo deja de ser el valor m?nimo pase a ser el segundo valor m?nimo
						segundoValorMinimo = valorMinimo;
						posicionSegundoValorMinimo = posicionValorMinimo;
						//Guardamos el valor m?nimo
						valorMinimo = numeros[i];
						posicionValorMinimo = i;
					}
					//Buscar segundo valor m?nimo 
					if(numeros[i]>valorMinimo && numeros[i]<segundoValorMinimo) {
						segundoValorMinimo = numeros[i];
						posicionSegundoValorMinimo = i;
					}
					
				}
				System.out.println("El valor m?ximo es: " + valorMaximo + ", con la posici?n: " + posicionValorMaximo);
				System.out.println("El segundo valor m?ximo es: " + segundoValorMaximo + ", con la posici?n: " + posicionSegundoValorMaximo);
				System.out.println("El valor m?nimo es: " + valorMinimo + ", con la posici?n: " + posicionValorMinimo);
				System.out.println("El segundo valor m?nimo es: " + segundoValorMinimo + ", con la posici?n: " + posicionSegundoValorMinimo);
				System.out.println("Comprobaci?n:");
				System.out.println(Arrays.toString(numeros)); 
			}
			
			//Apartado g
			if(String.valueOf('g').equals(seleccion)) {
				System.out.println("Seleccionaste el apartado g");
				for(int i=0;i<numeros.length;i++) {
					if(numeros[i]%3==0 && numeros[i]%5==0){
						System.out.println(Integer.toBinaryString(numeros[i]));
					}
				}
			}
			//Apartado h
			if(String.valueOf('h').equals(seleccion)) {
				System.out.println("Seleccionaste el apartado h");
				System.out.println("El programa se ha detenido");
				System.exit(0);
			}
			System.out.println();
		}
	}

}
