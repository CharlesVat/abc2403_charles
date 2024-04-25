package inversion;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		long ChiffreA;
		long ChiffreB;
		long Melangeur;
		Scanner sc;
		
		sc = new Scanner(System.in);
	
		System.out.println("Saisissez un chiffre A: ");
		
		ChiffreA = sc.nextLong();
		
		System.out.println("Saisissez un chiffre B");

		ChiffreB = sc.nextLong();
		
		System.out.println("vous avez choisi: "+ ChiffreA +" et " + ChiffreB);
		
		Melangeur = ChiffreA;
		ChiffreA= ChiffreB;
		ChiffreB= Melangeur;
		
		System.out.println("une fois inversé ca fait: "+ ChiffreA +" et " + ChiffreB);
		
		sc.close();
		
	}

}
