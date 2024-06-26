package bureau2point0;

public class Bureau {
	protected float hauteurEnCM;

	protected float largeurEnCM;

	protected float longueurEnCM;

	public Bureau() {
		hauteurEnCM = 50;
		largeurEnCM = 100;
		longueurEnCM = 100;

	}
	
	public Bureau(float _hauteurEnCM,float _largeurEnCM,float _longueurEnCM) {
		this.hauteurEnCM=_hauteurEnCM;
		this.largeurEnCM=_largeurEnCM;
		this.longueurEnCM=_longueurEnCM;
	}
	
	public Bureau(Bureau bureauClone) {
		this.hauteurEnCM=bureauClone.hauteurEnCM;
		this.largeurEnCM=bureauClone.largeurEnCM;
		this.longueurEnCM=bureauClone.longueurEnCM;
	}

	public boolean positionnerALaHauteur(float hauteur) {
		boolean retour;
		if ( hauteur >0) {
			retour = true;
			hauteurEnCM = hauteur;
		} else {
			retour = false;
			
		}
	return retour;
	}
}