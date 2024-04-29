import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		long Heure;
		long Minute;
		long Resultat;
		Scanner sc;
		
		sc=new Scanner(System.in);
		
		System.out.println("Entrez Heure");
		Heure= sc.nextInt();
		System.out.println("Entrez minute");
		Minute= sc.nextInt();
		Resultat= 3 + Minute;
		
		if(Heure >=24 || Minute >=60) {
			System.out.println("les données saisies sont invalide");
		}else {
		
		if(Resultat >=60){
			Resultat= Resultat-60;
			Heure=Heure+1;
		}
		
		if(Heure ==24) {
			Heure=0;
		}
		System.out.println("dans 3minute il serra : "+ Heure +"h" + Resultat);}
		
		
		
	}
}
