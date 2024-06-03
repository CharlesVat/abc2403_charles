import java.util.*;

public class App {
	public static void main(String[] args) {
//		Scanner sc;
//		sc= new Scanner(System.in);
		int[] Tableau= new int[] {2,4,1,8,6,14,23,25,7,42};
		float Calcul=0;
		double AuCarre;
		int ChiffreMax=0;
		
		for(int i=0; i<Tableau.length;i++) {
			Calcul+=Tableau[i];
			
			if(ChiffreMax<Tableau[i]) {
				ChiffreMax=Tableau[i];
			}
			
		
		}
	

		Calcul=Calcul/Tableau.length;
		
		AuCarre=ChiffreMax*ChiffreMax;//Math.pow(ChiffreMax, 2);
		
		
		System.out.println("Bienvenu dans le programe de calcul du talbeau d'entier");
		System.out.println("Moyenne des valeurs de tableau: "+ Calcul);
		System.out.println("la valeur la plus grande("+ChiffreMax+")élevée au carrée "+ AuCarre);
	
	}
}
