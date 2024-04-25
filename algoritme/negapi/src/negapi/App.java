package negapi;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		int NombresA;
		int NombresB;
		int Resultat;
		 Scanner sc;
		sc= new Scanner(System.in);
		
		System.out.println("Sasissez un permier nombre ");
		NombresA = sc.nextInt();
		System.out.println("Sasissez un second nombre");
		NombresB =sc.nextInt();
		Resultat= NombresA +NombresB;
		if(Resultat >=0){
			System.out.println(Resultat + " est positif");
		} else
		{
			System.out.println(Resultat + " est negatif");
		}
		
		
	}
	

}
