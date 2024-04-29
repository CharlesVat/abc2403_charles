import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		double Heure;
		double Minute;
		double Resultat;
		Scanner sc;
		
		sc=new Scanner(System.in);
		
		System.out.println("Entrez Heure");
		Heure= sc.nextInt();
		System.out.println("Entrez minute");
		Minute= sc.nextInt();
		Resultat= 3 + Minute;
		if(Resultat >=60){
			Resultat=0;
			Heure=Heure+1;
		}
		
		if(Heure ==24) {
			Heure=0;
		}
		System.out.println(Heure +"h " + Resultat +" min");
	}

}
