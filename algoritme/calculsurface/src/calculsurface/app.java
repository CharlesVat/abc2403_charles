package calculsurface;

import java.util.Scanner;
import java.lang.Math;

public class app {

	public static void main(String[] args) {
		
		double rayon;
		long angle;
		double Secteur;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Saisissez un rayon: ");
		
		rayon = sc.nextDouble();
		
		System.out.println("Saisissez un angle");
		
		angle = sc.nextLong();
		
		Secteur = ( Math.PI * (Math.pow(rayon,  2)* angle))/360;
		System.out.println("le total est " + Secteur);
		
		sc.close();
		
	}
	
}
