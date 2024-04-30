import java.util.Scanner;


public class App {
final static double P1 =0.1;//équivalent de const en C# constane quoi
final static double P2=0.09;	
final static double P3=0.08;

public static void main(String[] args) {
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		double Copie;
		double Facture;
		double Prix=0 ;
		
		System.out.println("Saisisez le nombre de PHotocopie");
		
		Copie=sc.nextLong();
		
		if(Copie<=10) {
			Prix=0.10;	
		} else if(Copie >10) {  
		Prix = 0.09+(0.10*10);
		Copie = Copie-10;}
		else if(Copie >30) {
	Prix= 0.08+(0.10*10) +(0.09*20);
			Copie=Copie-20;}
		
	Facture = Prix*Copie;
	System.out.println("vous devez :" + Facture);
	}
	
}
