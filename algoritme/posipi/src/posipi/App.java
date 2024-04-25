package posipi;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int Nombres;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Saisissez un Nombre");
		Nombres =sc.nextInt();
		if(Nombres >=0) {
			System.out.println(Nombres + " est positif");
			
			
		}else {
			System.out.println(Nombres +" est négatif");
		}
		
		

	}

}
