import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner sc;
		int Nombres;
		int Somme=0;
		
		sc= new Scanner(System.in);
		
		System.out.println("ecrire un nombre");
		Nombres= sc.nextInt();
		
		for (int i = 1; i <= Nombres; ++i) {
			Somme+=i;
			


			
					);
		}
		System.out.println("la somme  des nombres jusqu'a "+Nombres+ " est :"+ Somme);
	}
}
