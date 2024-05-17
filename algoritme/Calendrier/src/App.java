import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int Anne;
		int Mois;
		int Jours;
		String Date;
		Scanner  sc;
		
		sc= new Scanner(System.in);
	
	System.out.println("Sasissez l'année");
	Anne= sc.nextInt();
	
	System.out.println("Sasissez le mois");
	Mois= sc.nextInt();
	
	System.out.println("Sasissez le jour");
	Jours= sc.nextInt();
	
	if (Anne%4!=0 && Mois==2 && Jours>=29 || Mois==4 || Mois==6 || Mois==9 || Mois==11 && Jours>30) {
		Date="Date invalide";
	
	}
	else Date="Date valide";
	
	System.out.println("votre date est une: "+Date+".");
	}
	
}
