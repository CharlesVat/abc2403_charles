import java.util.Scanner;

public class App {

	
	
	public static void main(String[] args) {
		int Age;
		String Categorie;
		Scanner  sc;
		
		sc= new Scanner(System.in);

		System.out.println("Saisissez votre Âge: ");
		
		Age = sc.nextInt();
		
if(Age >=35) {
	Categorie="Vétéran";
	else if(Age >=19) {
		Categorie="sénior";
	}	 else if(Age >=17) {
		Categorie="Junior";}
	
 else if(Age >=7) {
	Categorie="Poussin";
}
	 else if(Age >=9) {
		Categorie="Benjamin";
	}
	 else if(Age >=11) {
		Categorie="Pupille";
	}
	 else if(Age >=13) {
		Categorie="Poussin";
		
	} 	 else if(Age >=15) {
		Categorie="Cadet";
		
	}
	} 	 else if(Age >=7) {
		Categorie="Poussin";
	} else if(Age >=5) {	Categorie="Débutant";
	}
	else 
		Categorie="trop jeune";

 System.out.println("vous êtes " + Categorie);
	

}

}