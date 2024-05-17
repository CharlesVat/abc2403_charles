

package promenade;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
boolean beauTemps;
boolean veloOk;
boolean reparationImmediates;
boolean livrePossede;
boolean livreDispoBibliotheque;
Scanner sc ;
	
sc = new Scanner(System.in);

System.out.println("il faut beau? true or false?");
	beauTemps=sc.nextBoolean();

if (beauTemps== true) {
		System.out.println("je vais me balader");
	
	System.out.println("est ce que la byclette est en etat?(false or true)");
	veloOk=sc.nextBoolean(); 
	
	if(veloOk==true) {
		System.out.println("j'irai me balader à bicylette");
	}
	else { System.out.println("je vais chez le garagiste");
	
	System.out.println("réparation imédiate?(true or false");
	
	reparationImmediates = sc.nextBoolean();

		if( reparationImmediates == true ) {
		System.out.println("j'irai me ballader à bicyclette");
										}
	
		else System.out.println("J'irait ceuillir des joncs");
		}
						}
	  else {System.out.println("je vais lire un livre");
	  System.out.println("possédez vous le livre GOT?(false or true");
	  livrePossede=sc.nextBoolean();
	
	if(livrePossede==false) {
		System.out.println("je vais a la biliblothéque");
		
		System.out.println("est ce qu'il ont le livre?(true or false)");
		livreDispoBibliotheque=sc.nextBoolean();
		
		if(livreDispoBibliotheque==true) {
			System.out.println("j'emprunte GOT");
		}
		
		else {System.out.println("j'emprunte un romman policier");}
		
		System.out.println("je rentre chez moi");
	
		
		
							}else System.out.println("je lis GOT");

	System.out.println("je lit mon livre dans le fauteuil");
	} 
sc.close();
	}

}
