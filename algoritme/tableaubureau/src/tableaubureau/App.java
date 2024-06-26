package tableaubureau;

public class App {

	public static void main(String[] args) {
		bureau elbrureau = new bureau();
		boolean br= elbrureau.branchage();
//		
//		bureau elbareu = new bureau(false, 20, 100,10 ,35 ,40,50 );
//		boolean branchLa= elbareu.branchage();
//		
//		bureau elboreu = new bureau(true, 20, 100,100 ,35 ,40,50 );
//		boolean debranche1= elboreu.debranchage();
//		
//		bureau elboreux = new bureau(false, 20, 100,10 ,35 ,40,50 );
//		boolean debranche2= elboreux.debranchage();
		
		bureau elborexu = new bureau(true, 50, 100,20 ,35 ,40,50 );
		boolean decente= elborexu.Decendre(25);
		
		bureau elborexur = new bureau(true, 20, 100,20 ,35 ,40,50 );
		boolean decente2= elborexur.Decendre(25);
		
		bureau elbureau = new bureau(true, 20, 100,20 ,35 ,40,50 );
		boolean monter= elbureau.Monter(25);
		
		bureau lebureau1 = new bureau(true, 20, 100,20 ,35 ,40,50 );
		boolean Niveau1= lebureau1.MettreALaHateur1();
		
		bureau lebureau2 = new bureau(true, 20, 100,20 ,35 ,40,50 );
		boolean bonneHauteur= lebureau2.PositonnetALaHauteur(50);
		
		bureau lebureau3 = new bureau(true, 20, 100,20 ,35 ,40,50 );
		boolean bonnehauteur2= lebureau3.PositonnetALaHauteur(150);
		
		bureau lebureau4 = new bureau(true, 20, 100,20 ,35 ,40,50 );
		boolean bonnehauteur3= lebureau4.PositonnetALaHauteur(10);
		
		bureau lebureau5 = new bureau(true, 20, 100,20 ,35 ,40,50 );
		boolean Niveau2= lebureau5.MettreALaHateur2();
		
		
	}
	
	

}
