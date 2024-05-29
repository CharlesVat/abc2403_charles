import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
//		float Nombres;
		float sommes = 0;
		int[] tableau= new int[10];

		

		for (int i = 0; i < tableau.length; i++) {
			System.out.println("Saisisez un nombre");
			tableau[i] = sc.nextInt();
			sommes+=tableau[i];
				
		}
//		for(int i = 1 ; i<=tableau[i]; i++) {
//			sommes+=tableau[i];
//			
//		}
//		


		for (int i = 0; i < tableau.length; i++) {
			System.out.println("la somme de la partie " + i + " du tableau est " + sommes);
			
		}

	}

}
