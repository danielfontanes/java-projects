import java.util.Scanner;

public class Extra3 {

	public static void main(String[] args) {
		//CADENA PALÍNDROMA
		Scanner lector = new Scanner(System.in);
		String frase;
		boolean noPalindroma = false;
		int contadorPalindromas = 0;
		String continuar;
		
		while(true){
			//Pedir introducir frase
			System.out.println("Introduza frase:");
			frase = lector.nextLine();
			//Splitear frase
			String fraseTroceada []= frase.split(" ");
			for (int i = 0; i < fraseTroceada.length; i++) {
				String palabraTroceada []= fraseTroceada[i].split("");
				for (int j = 0; j < palabraTroceada.length/2; j++) {
					if(palabraTroceada[j].equals(palabraTroceada[palabraTroceada.length -j -1])){
					}
					else {
						noPalindroma= true;
						break;	
					}
				}
				if(noPalindroma) {
					System.out.println(fraseTroceada[i] + ". No es palindroma");
					noPalindroma = false;
				}
				else {
					System.out.println(fraseTroceada[i] + ". Es palindroma");
					contadorPalindromas++;
				}
			}
			System.out.println("Palabras palindromas encontradas:" + contadorPalindromas);
			System.out.println();
			contadorPalindromas= 0;
			System.out.println("Quieres continuar (Y/N):");
			continuar = lector.nextLine();
			if(continuar.equals("Y")) {
				
			}
			else {
				System.exit(0);
			}
		}

	}

}
