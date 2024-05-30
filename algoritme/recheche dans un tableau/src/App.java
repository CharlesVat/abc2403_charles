import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc;
		sc= new Scanner(System.in);
		int tailles;
		int[] Tableau;

		System.out.println("Sasissez le nombre de numéro que vous allez saisir");
		tailles=sc.nextInt();
		Tableau=new int[tailles];

		for(int i=0; i<tailles;i++) {
		System.out.println("Saisisez un nombe pour le tableau, ");
		
		Tableau[i]= sc.nextInt();
	}
		
		for(int i=0; i<tailles; i++) {
			
		}
	}
	
}
