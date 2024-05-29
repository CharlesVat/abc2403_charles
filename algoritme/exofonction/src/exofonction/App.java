package exofonction;

public class App {
/*
 * Calcule et affiche le préimètre d'un triangle
 * @param a longueur du 1er coté
 *@param a longueur du 2eme coté
 *@param a longueur du 3eme coté
 */
	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c=40;
		
		App.calculerPerimetreTriangle(a,b,c);
		
		
	int[] valeurs = new int[] {1,3,5,7,3,4,2,4,22};
	
	App.calculerMoyenne(valeurs);
	
	}

	public static void calculerPerimetreTriangle(int a, int b, int c) {
		
		int Resultat= a+b+c;
		
		System.out.println("périmetre est: "+ Resultat);
	}
	/**
	 * Calcule et affiche la moyenne des valeur d'un tableau
	 * @param tableau le tableau des valeurs
	 */
	
	public static void calculerMoyenne(int[] tableau) {
		float somme=0;
		
		for (int i=0;i<tableau.length;i++){
			somme=somme+tableau[i];
			}
		
		somme=somme/tableau.length;
		
		System.out.println("la moyenne est de " +somme);
	}
	
	}
	

