import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc;
		sc= new Scanner(System.in);
		int[] Tableau=new int[] { 8, 16, 32, 64, 128, 256, 512};
		int N;
		int BonNombre=0;
		
		
		System.out.print("Saisissez votre numéro");
		N=sc.nextInt();
		for(int i=0; i<Tableau.length;i++) {
			if(BonNombre==Tableau[i]) {
				System.out.print("le nombre trouvé case "+ i+".");
			
		}
		}else 
	}

}
