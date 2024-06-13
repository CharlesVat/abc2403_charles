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
		
	
		
	}
	
	

}
