import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc;
		sc= new Scanner(System.in);
		int tailles;
		int[] Tableau;
		int negatif=0;
		int positif=0;
		
		System.out.println("Sasissez le nombre de numéro que vous allez saisir");
		tailles=sc.nextInt();
		Tableau=new int[tailles];

		for(int i=0; i<tailles;i++) {
		System.out.println("Saisisez un nombe pour le tableau, ");
		
		Tableau[i]= sc.nextInt();
		if(Tableau[i]<0) {
			negatif++;
		} else positif++; 
	}
		
//		}
//		for(int i=0; i<Tableau.length;i++) {
//			if(Tableau[i]<0) {
//				System.out.println("la partie "+ i+ " du tableau est" + Tableau[i]+" est négative");
//			} else System.out.println("la partie "+ i+ " du tableau est" + Tableau[i]+" est positive");
//		}
		
		System.out.println("vous avez saisi "+ negatif+" Nombres negatif");
	System.out.println("vous avez saisi: "+positif+" positif");
		
		sc.close();
		}
	}


