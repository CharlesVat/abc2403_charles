import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner sc;
		sc= new Scanner(System.in);
		int[]tableau1=new int[6];
		int[]tableau2=new int[6];
		int[]tableau3=new int[6];
		
		for (int i = 0; i < tableau1.length; i++) {
			System.out.println("Saisisez un nombre pour le tableau 1 case N°"+ i+".");
			tableau1[i] = sc.nextInt();
				
		}
		
		for (int i = 0; i < tableau2.length; i++) {
			System.out.println("Saisisez un nombre pour le tableau 2 case N°"+ i+".");
			tableau2[i] = sc.nextInt();
				
		}
		
		for (int i = 0; i < tableau3.length; i++) {
			tableau3[i] = tableau1[i]+tableau2[i];
			System.out.println("tableau 3 case N°" + i+ " est " + tableau3[i]+"."+ " ");
			
		}
		
		
	}
}
