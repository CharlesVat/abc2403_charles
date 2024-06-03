import java.util.*;
public class App {

	public static void main(String[] args) {
		Scanner sc;
		sc= new Scanner(System.in);
		int Tailles=0;
		int[]Tableau;
		float Calcul=0;
		int[] Max;
		
		System.out.println("Saisir la taille du tableau");
		Tableau= new int[sc.nextInt()];
		
		for(int i=0;i<Tableau.length;i++) {
			System.out.println("la note numéro: "+ i);
			Tableau[i]=sc.nextInt();
			Calcul+=Tableau[i];
		}
	Calcul/=Tableau.length;	
		
		for(int i=0;i<Tableau.length;i++) {
			if(Calcul<=Tableau[i]) {
				Tailles+=1;
			}
		}
		
//		for(int i=0;i<Tailles;i++) {
//			Max=new int[Tailles];
//			if(Calcul<=Tableau[i]) {
//				Max[i]=Tableau[i];
//			}
		System.out.println("il ya "+ Tailles+" de note supérieur a la moyenne qui est de"+ Calcul);	
	
	}
		


}

