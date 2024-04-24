

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String prenom;//déclaration d'une varaible "prenom" de type "chaine de caractére"

		Scanner sc;// declearation d'une varaible de type scanner (penser a ajouter la ligne d'import (cf ligne 3))
		
		sc = new Scanner(System.in); // nouveau scanner
		
		System.out.println("Bonjour veuiller, saisir votre prènom: ");
		
		prenom= sc.nextLine();// demande à l'utiliseateur une saisie lorsque l'utilisateur validera avec la touche entrée la saisie est récupérée dans la variable à gauche du signe "="
		
		System.out.println ("Bonjour " + prenom + " !");
		
		sc.close();
	}

}
