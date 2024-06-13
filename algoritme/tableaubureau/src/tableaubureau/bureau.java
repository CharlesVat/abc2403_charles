package tableaubureau;

public class bureau {

	private boolean brancher;

	private float hauteurMaxEnCM;

	private float hauteurMinEnCM;

	private float hauteur1EnCM;

	private float hauteur2EnCM;

	private float hauteur3EnCM;

	private float hauteurEnCM;

	public bureau() {
		brancher = true;
		hauteurEnCM = 85;
		hauteurMaxEnCM = 100;
		hauteurMinEnCM = 50;
		hauteur1EnCM = 80;
		hauteur2EnCM = 90;
		hauteur3EnCM = 95;

	}

	public bureau(boolean _brancher, float _hauteurEnCM, float _HauteurMaxEnCM, float _HauteurMinEnM,
			float _hauteur1EnCM, float _hauteur2EnCM, float _hauteur3EnCM) {
		brancher = _brancher;
		hauteurEnCM = _hauteurEnCM;
		hauteurMaxEnCM = _HauteurMaxEnCM;
		hauteurMinEnCM = _HauteurMinEnM;
		hauteur1EnCM = _hauteur1EnCM;
		hauteur2EnCM = _hauteur2EnCM;
		hauteur3EnCM = _hauteur3EnCM;

	}

	public void Bureau() {
	}

	public boolean branchage() {
		boolean retour;
		if (brancher == false) {
			brancher = true;
			retour = true;
		} else {
			retour = false;

		}
		return retour;

	}

	public boolean debranchage() {
		boolean retour;
		if (brancher == true) {
			brancher = false;
			retour = true;
		} else {
			retour = false;
		}
		return retour;
	}

	public boolean Decendre(float Hauteur) {
		boolean retour;
		if (hauteurMaxEnCM >= hauteurEnCM - Hauteur && hauteurEnCM - Hauteur >= hauteurMinEnCM && brancher == true) {
			retour = true;
			hauteurEnCM -= Hauteur;
		} else
			retour = false;

		return retour;
	}
	
	public boolean Monter(float Hauteur) {
		boolean retour;
		if( hauteurEnCM+Hauteur < hauteurMaxEnCM  && brancher == true) {
			retour=true;
			hauteurEnCM += Hauteur;
			
		} else retour =false;
		return retour;
	}

//public BureauElectrique();{
//	
//}

}
