import java.util.Scanner;

public class App {
//	if(Age<25 && Permis>=2 && Accident==0)
	
	public static void main(String[] args) {
	int Age;
	int Permis;
	int Ancien;
	String Forfait;
	int Accident;
	Scanner sc;
	
	sc= new Scanner(System.in);
	
	System.out.println("Saisissez votre âge: ");
		Age=sc.nextInt();
		
	System.out.println("Saisissez combien d'année vous êtes titulaire du permis: ");	
		Permis=sc.nextInt();
		
	System.out.println("Saisissez vos année d'ancienneté ");
	Ancien=sc.nextInt();
	
	System.out.println("Saisissez vos nombres d'accidents");
	Accident=sc.nextInt();
	
	if(Age>=25 && Permis>=2 && Accident==0) {
		
		Forfait= "VERT";
		
		}
		
	else if (Age<25 && Permis<2 && Accident==0||Age>=25 && Permis>=2 && Accident==2 ||Age>=25 && Permis<=1 && Accident==1){
	Forfait= "ROUGE";
	
	}else if(Age<25 && Accident>0 || Age>=25 && Accident >2) { 
		Forfait= "non eligible";}
		else  
			Forfait="ORANGE";
	
	if(Ancien>=5 && Forfait=="VERT") {
		Forfait="BLEU";
	}else if(Ancien>=5 && Forfait=="ORANGE") {
		Forfait="VERT";
	}else if (Ancien>=5 && Forfait=="ROUGE") {
		Forfait="ORANGE";
	}
	
	
		

	
		System.out.println("Votre forfait est: "+ Forfait);
		sc.close();
}

}