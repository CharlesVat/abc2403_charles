import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc;
		sc= new Scanner(System.in);
		int[] tableau1= new int[] {4,8,7,12};
		int[] tableau2= new int[] {3,6};
		int resultat=0;
		
		for(int i=0; i<tableau1.length;i++) {
			for(int j=0;j<tableau2.length;j++) {
				resultat+=tableau1[i]*tableau2[j];
			}
		}
		
		
//		int calcul=0;
//		int calcul2=0;
//		int calcul3=0;
//		
		//for(int i=0;i<tableau1.length;i++) {
//			System.out.println("Saisir 4 chiffre pour le tableau");
//			tableau1[i]=sc.nextInt();
//		}
//		
//		for(int i=0;i<tableau2.length;i++) {
//			System.out.println("Saisir 2 chiffre pour le tableau");
//			tableau2[i]=sc.nextInt();
//			
//		}
//		
//		for(int i=0;i<4;i++) {
//		calcul=tableau1[i]*tableau2[0];
//		calcul3=tableau1[i]*tableau2[1];
//		calcul2+=calcul+calcul3;
//		
//		}
		System.out.println(resultat);
	}
}
