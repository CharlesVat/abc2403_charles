package bureau2point0;

public class BureaulElectrique extends Bureau {
	private boolean branche;

	private float hauteurMaxEnCM;

	private float hauteurMinEnCM;

	private float hauteur1EnCM;

	private float hauteur2EnCM;

	private float hauteur3EnCM;

	public BureaulElectrique() {
		super();
		branche = true;
		hauteurMaxEnCM = 100;
		hauteurMinEnCM = 50;
		hauteur1EnCM = 80;
		hauteur2EnCM = 90;
		hauteur3EnCM = 95;

	}

	public BureaulElectrique(float _hauteurEnCM, float _largeurEnCM, float _longeurEnCM, float _hauteurMaxEnCM,
			float _hauteurMinEnCM, float _hauteur1EnCM, float _hauteur2EnCM, float _hauteur3EnCM, boolean _brancher) {
		super(_hauteurEnCM, _largeurEnCM, _longeurEnCM);
		this.hauteur1EnCM = _hauteur1EnCM;
		this.hauteur2EnCM = _hauteur2EnCM;
		this.hauteur3EnCM = _hauteur3EnCM;
		this.hauteurMaxEnCM = _hauteurMaxEnCM;
		this.hauteurMinEnCM = _hauteurMinEnCM;
		this.branche=_brancher;
	}
	
	public BureaulElectrique(BureaulElectrique bureauElectriqueClone) {
	super(bureauClone);
	this.hauteur1EnCM=bureauElectriqueClone.hauteur1EnCM;
	this.hauteur2EnCM=bureauElectriqueClone.hauteur2EnCM;
	this.hauteur3EnCM=bureauElectriqueClone.hauteur3EnCM;
	this.hauteurMaxEnCM=bureauElectriqueClone.hauteurMaxEnCM;
	this.hauteurMinEnCM=bureauElectriqueClone.hauteurMinEnCM;
	this.branche=bureauElectriqueClone.branche;
	}
@Override
	public boolean positionnerALaHauteur(float Hauteur) {
		boolean retour=false;
		if (branche == true && Hauteur <= hauteurMaxEnCM && Hauteur >= hauteurMinEnCM) {
			retour=super.positionnerALaHauteur(Hauteur);
		
	} 
		return retour;

	}

	public boolean mettreALaHateur1() {
		return positionnerALaHauteur(hauteur1EnCM);
	}

	public boolean mettreALaHateur2() {
		return positionnerALaHauteur(hauteur2EnCM);
	}

	public boolean mettreALaHateur3() {
		return positionnerALaHauteur(hauteur3EnCM);
	}

	public boolean monter() {
		return positionnerALaHauteur(hauteurMaxEnCM);
	}

	public boolean decendre() {
		return positionnerALaHauteur(hauteurMinEnCM);
	}

}
