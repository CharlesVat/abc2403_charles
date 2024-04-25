package moyenne2nombre;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int Nombre1;
		int Nombre2;
		float Moyenne;
		Scanner sc;
		
		sc= new Scanner(System.in);
		
		System.out.println("veuillez saisir un premeir nombre: ");
		
		Nombre1 = sc.nextInt();
		
		System.out.println("Veuillez saisir un second nombre: ");
		
		Nombre2 =sc.nextInt();
		
		Moyenne = (Nombre1 + Nombre2)/2;
		
		System.out.println("la moyenne de" 
		+ Nombre1 + " et " + Nombre2 + "est: " + Moyenne);
		
		sc.close();
		
	}

}
