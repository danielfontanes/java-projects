import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		String emails [] = new String[20];
		Scanner lector = new Scanner(System.in);
		String seleccion;
		String busquedaCorreo;
		String contarCorreo;
		int counter= 0;
		String dominio [] = new String [2];
		int counterGmail = 0;
		float counterHotmailOutlook = 0;
		float counterYahoo = 0;
		float contadorGeneral = 0;
		
		while(true) {
			System.out.println("Indique con una letra el apartado que desea:");
			System.out.println("a. Guardar correo en la primera posici?n vac?a.");
			System.out.println("b. Buscar correo.");
			System.out.println("c. Contar correos de un dominio.");
			System.out.println("d. Mostrar el porcentaje de correos de cada uno de los dominios.");
			seleccion = lector.nextLine();
			emails[0]= "pepe@gmail.com";
			emails[1]= "pepito@gmail.com";
			emails[3]= "pepote@gmail.com";
			emails[5]= "segismundo@hotmail.com";
			emails[8]= "pepe@outlook.com";
					
			//Apartado a
			if(String.valueOf('a').equals(seleccion)) {
				System.out.println("Seleccionaste el apartado a");
				for (int i = 0; i < emails.length; i++) {
					if (emails[i]==null) {
						System.out.println("Indique el correo que deseas guardar:");
						emails[i]= lector.nextLine();
						System.out.println(Arrays.toString(emails)); 
						break;
					}
				}
			}
			
			//Apartado b
			if(String.valueOf('b').equals(seleccion)) {
				System.out.println("Seleccionaste el apartado b");
				System.out.println("Indica el correo que deseas buscar:");
				busquedaCorreo = lector.nextLine();
				for (int i = 0; i < emails.length; i++) {
					if (String.valueOf(busquedaCorreo).equals(emails[i])) {
						System.out.println("Se encuentra en la posici?n: " + i);
						System.out.println("Comprobaci?n:");
						System.out.println(Arrays.toString(emails)); 
						break;
					}
				}
			}
			//Apartado c
			if(String.valueOf('c').equals(seleccion)) {
				System.out.println("Seleccionaste el apartado c");
				System.out.println("Indica el dominio del que deseas obtener la canbtidad de correos:");
				contarCorreo = lector.nextLine();
				for (int i = 0; i < emails.length; i++) {
					if(emails[i]!= null){
						dominio = emails[i].split("@");
						if (String.valueOf(dominio[1]).equals(contarCorreo)){
							counter++;
						}
					}
				}
				System.out.println("Hay " + counter + " correos con el dominio " + contarCorreo);
				counter= 0;
			}
			
			//Apartado d
			if(String.valueOf('d').equals(seleccion)) {
				System.out.println("Seleccionaste el apartado d");
				for (int i = 0; i < emails.length; i++) {
					if(emails[i]!= null){
						dominio = emails[i].split("@");
						if (String.valueOf(dominio[1]).equals("gmail.com")){
							counterGmail++;
							contadorGeneral++;
						}
						else if(String.valueOf(dominio[1]).equals("hotmail.com") || String.valueOf(dominio[1]).equals("outlook.com")){
							counterHotmailOutlook++;
							contadorGeneral++;
						}
						else if(String.valueOf(dominio[1]).equals("yahoo.com")){
							counterYahoo++;
							contadorGeneral++;
						}
					}
				}
				System.out.println("Porcentaje gmail: " + (counterGmail*100)/contadorGeneral + "%");
				System.out.println("Porcentaje hotmail y outlook: " + (counterHotmailOutlook*100)/contadorGeneral + "%");
				System.out.println("Porcentaje yahoo: " + (counterYahoo*100)/contadorGeneral + "%");
				contadorGeneral= 0;
				counterGmail= 0;
				counterHotmailOutlook= 0;
				counterYahoo= 0;
			}
			System.out.println();
		}
	}
}
