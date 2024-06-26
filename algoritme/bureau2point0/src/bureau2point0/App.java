package bureau2point0;

public class App {

	public static void main(String[] args) {
		Bureau leTest = new Bureau(100,100,100);
		
		boolean hauteurOui= leTest.positionnerALaHauteur(50);

		
		BureaulElectrique commeTuVeux = new BureaulElectrique(100,100,100,150,50,80,100,140,true);
		boolean test= commeTuVeux.positionnerALaHauteur(160);
		
		
		
		BureaulElectrique clown = new BureaulElectrique(100,100,100,150,50,80,100,140,true);
		boolean ptitclown = clown.BureaulElectrique(bureauClone);
	}

	
	
}
