import java.util.*;

public class App {

	public static void main(String[] args) {
		Scanner sc;
		sc= new Scanner(System.in);
		int tailles;
		int[] Tableau;
		int Max=0;
		System.out.println("Sasissez la taille du tabeau voulu");
		tailles=sc.nextInt();
		Tableau=new int[tailles];
		int place=0;

		for(int i=0; i<tailles;i++) {
		System.out.println("Saisisez le n°" + i+"case pour le tableau");
		
		Tableau[i]= sc.nextInt();
	}
		
		System.out.println("le tableau écrit est "+Arrays.toString(Tableau));
		
		for(int i=0; i<tailles; i++) {
			
			if (Max<Tableau[i]) {
				Max=Tableau[i];
				place=i;
			}
			
			
		}
		System.out.println("la plus grande valeur ce trouve en "+place+ " c'est "+Max);
	}
	
}
