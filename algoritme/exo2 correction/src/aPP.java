import java.util.Scanner;

public class aPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		sc= new Scanner(System.in);
		String saisieUtilisateur;
		String[]LegumesPrix= new String[1];
		String[]LegumesPrix2;
		
		
		do {System.out.println("Saisissez un fruit ou un Légume");
		saisieUtilisateur= sc.nextLine();	
		
		LegumesPrix[LegumesPrix.length-1]=saisieUtilisateur;
		if(!saisieUtilisateur.equals("go")) {
			
			LegumesPrix2= new String[LegumesPrix.length+1];
			System.arraycopy(LegumesPrix2, 0, LegumesPrix, 0, LegumesPrix.length);
			
			LegumesPrix=LegumesPrix2;
			
		}
	
		}while(!saisieUtilisateur.equals("go"));
		
		for(int i=0; i<LegumesPrix.length;i++) {
			System.out.println(LegumesPrix[i]);
			
		}
		
		/*for(int i= LegumesPrix.length-1; i>=0;i--) {
			
			
		}*/
		
		sc.close();
	}

}
