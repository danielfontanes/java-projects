import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Extra1 {

	public static void main(String[] args) {
		//HUNDIR LA FLOTA
		//Matriz que utilizo para que el programa sepa donde est?n los barcos
		byte map [][] = new byte [8][8];
		//Matriz que utilizo para que el usuario vea donde ya impacto el misilaco
		byte mapUser [][] = new byte [8][8];
		
		Random rand = new Random();
		int randomRow = 0;
		int randomColum = 0;
		int counter = 0;
		int shipsFound = 0;
		int userRow = 0;
		int userColum = 0;
		Scanner lector = new Scanner(System.in);
		
	
		
		while(true) {			
			//Lleno de ceros las matrices matriz
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					map[i][i]= 0;
					mapUser[i][i]= 0;
				}
			}
			//A?ado los barcos
			while(counter < 10) {
				randomRow = rand.nextInt(map.length);
				randomColum = rand.nextInt(map.length);
				//Compruebo que esa posici?n no est? ocupada por un 1
				if(map[randomRow][randomColum] == 0) {
					map[randomRow][randomColum] = 1;
					counter++;
				}
			}
			counter= 0;
			//Temporal para que se pueda corregir el ejercicio
			System.out.println("Para que puedas ver el mapa en el que se generan los barcos el cual no se le mostrar?a al jugador:");
			for (int i = 0; i < map.length; i++) {
				System.out.println(Arrays.toString(map[i]));
			}
			System.out.println("");
			
			//Empieza el juego
			while(shipsFound<10) {
				System.out.println("Selecciona fila (0-7):");
				userRow = Integer.parseInt(lector.nextLine());
				System.out.println("Selecciona columna (0-7):");
				userColum = Integer.parseInt(lector.nextLine());
				//Compruebo si le dio con el misilaco por primera vez
				if(map[userRow][userColum] == 1 &&  mapUser[userRow][userColum]== 0) {
					mapUser[userRow][userColum] = 1;
					shipsFound++;
					System.out.println("Has dado al barco con tu Misilaco!!");
					for (int i = 0; i < map.length; i++) {
						System.out.println(Arrays.toString(mapUser[i]));
					}
					System.out.println();
				}
				else {
					System.out.println("Has fallado.");
					for (int i = 0; i < map.length; i++) {
						System.out.println(Arrays.toString(mapUser[i]));
					}
					System.out.println();
				}
			}
			System.out.println("Has hundido todos los barcos. Buen trabajo!!");
			 
			 
			System.out.println("");
		}

	}

}
