import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		Bouteille bouteille1 = new Bouteille();
		float resu= bouteille1.donneContenanceEnCl();
		
		
		/*double resultat= App.Aditionner(2, 3);
		String prenom="Mickaël";
		String nom="Devoldere";
		
		String nomComplet= App.NomComplet(prenom,nom);
		
		System.out.println(nomComplet);
				
				App.JourEtHeures();
				
		float prix=10;*/
		
	
	}	
	
	public static double Aditionner(double valeur1, double valeur2) {
		double somme;
		somme = valeur1+valeur2;
		return somme;
	}

	
	public static String NomComplet(String prenom, String nom) {
		String retour;
		
		retour = prenom+"."+nom;
		return retour;
	}
	public static void JourEtHeures() {
	SimpleDateFormat s= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date= new Date();
	System.out.println(s.format(date));
		
		
//		int JourEtHeures=Heures && Jour;
		
		
	}
	
	public float ajouterUneTaxAPrix(float *prix) {
		
		prix= prix+prix*5.5/100;
	}
}
