import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner sc;
		int Nombres;
		int Factorielle=1;
		
		sc= new Scanner(System.in);
		
		System.out.println("ecrire un nombre");
		Nombres= sc.nextInt();
		
		 for (int i = 1; i <= Nombres; ++i) {
			       Factorielle*=i;
			


			
					
		}
		System.out.println("le factorielle de "+Nombres+ " est : "+ Factorielle);
	}
	}


