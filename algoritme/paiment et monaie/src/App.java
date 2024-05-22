import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		int UnEuro=0;
		int i=0;
		float Prix;
		float Monaie;
		float Total=0;
		float Calcul;
		float Rendu ;
		double Pieces=0;
		int DeuxEuro=0;
		int CinquanteC=0;
		int VightC=0;
		int centime=0;
		do {
			System.out.println("Saisir un prix" );
			Prix= sc.nextFloat();
			Total+=Prix;
//			if(Monaie==0) {
//				Monaie=Prix;
//				
//			}
//			System.out.println( Monaie );
//			if(Monaie!=Prix) {
//			Total=Prix+Monaie;
//			
//			}
//			System.out.println(Total);
//			
		}
		
		while(Prix!=0);
		Monaie=Total;
		do {
			Monaie=Monaie-5;
			i++;
		}
		
		while(Monaie>0.00);
		
		
		Calcul=i*5;
		Rendu= Calcul-Total;
		Pieces=Rendu;
		
		System.out.println("le client doit payer: "+ Total );
		System.out.println( "il doit donner "+ i+ " billet de 5 euros soit " +Calcul );
		
		System.out.println("Monaie rendu monaie: "+ Rendu);
		
		if(Pieces>=2) {
			
			
			do{DeuxEuro++;
			Pieces=Pieces-2;
			
			}while(Pieces>1.90);
			System.out.println( "vous devez " + DeuxEuro +  " pieces de 2 euros  ");	
		}
		
		if(Pieces>=1) {
			do{UnEuro++;
			Pieces=Pieces-1;
			}while(Pieces>0.90);
			System.out.println( "vous devez " + UnEuro +  " pieces de 1 euros  ");
		}
		if(Pieces>=0.50) {
			do {CinquanteC++;
			Pieces=Pieces-0.5;
			}while(Pieces>=0.50);
			System.out.println( "vous devez " + CinquanteC +  " pieces de 0.50 euros  ");
		}
		if(Pieces>=0.20) {
			do {VightC++;
			Pieces=Pieces-0.2;
			}while(Pieces>=0.20);
			System.out.println( "vous devez " +VightC +  "Pieces de 0.20 euros  ");
		}
		
		if(Pieces>=0.10) {
			Pieces=Pieces-0.10;
			System.out.println( "vous devez 1 Pieces de 0.10 euros  ");
		}
		
		if(Pieces>=0.05) {
			Pieces=Pieces-0.05;
			System.out.println( "vous devez 1 Pieces de 0.5 euros  ");
		}
		
		if(Pieces>=0.04) {
			do {
			Pieces=Pieces-0.01;
			++centime;
			}while (Pieces>=0.01);
			
			System.out.println( "vous devez " +centime+ " Pieces de 0.01 euros  ");
		}
	}

}
