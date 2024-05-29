import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner sc;
		sc= new Scanner(System.in);
		long Ordre;
		long Desordre;
		int Chevaux;
		int ChevauxJoue;
		long Calcul2=1;
		int MixCheval;
		long Calcul=1;
		long Celcul=1;
		
		System.out.println( "Ecrire le nombre de chevaux");
		Chevaux= sc.nextInt();
		System.out.println( "Saisissez le nombre de chevaux joué");
		ChevauxJoue= sc.nextInt();
		
		MixCheval= Chevaux-ChevauxJoue;
		
		for(int i=1;i<= Chevaux;i++) {
			Calcul*=i;
		}
		
		for(int j=1;j<= ChevauxJoue;j++) {
			Celcul*=j;	
		}
		
		for(int i=1; i<=MixCheval;i++)
		{
			Calcul2*=i;
		}
	
		Ordre=(Calcul/Calcul2)/100;
		
		Desordre=Calcul/(Celcul*Calcul2)/100;
//		System.out.println("dans l'ordre: une chance sur "+ Ordre+" de gagner");
//		System.out.println( "dans le désordre: vous avez une chance sur: " + Desordre+" de gagner");
		System.out.println("dans l'ordre: vous avez  "+ Ordre+" % de chance de gagner");
		System.out.println( "dans le désordre: vous avez  " + Desordre+" % de chance de gagner");
	}

}
