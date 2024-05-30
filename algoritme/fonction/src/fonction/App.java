package fonction;

public class App {
	public static void main(String[] args) {
		System.out.println("Démo sur les fonctions");
		App.helloworld();
		/**
		 * affiche "hello world" dans la console
		 * utilisation : app.helloworld();
		 *   */	
	}
public static void helloworld(){
	System.out.println("Hello world");
	System.out.println("jeremy");
	System.out.println("michelle");
	System.out.println("Steve");
}

/**
 * afffiche le prénom fourni en argument dans la console
 * @param prenom le prénom afficher
 * 
 * toujour mettred des commentaires
 */
public static void hello(String prenom)
{
	System.out.println("Hello"+prenom);}

public static int caclulerSomme(int a,int b) {
	
	
	int resultat= a+b;
	return resultat;

}
}
