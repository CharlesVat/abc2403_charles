import java.util.Arrays;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner sc;
		sc= new Scanner(System.in);
		int tailles;
		int[] Tableau=new int[] {1, 4, 5, 10, 20, 22, 25 , 30, 32};
		int[] Tableau2= new int[Tableau.length+1];
		
	
		
		for(int i=0;i<Tableau.length;i++)
		{
	
Tableau2[i]=Tableau[i];
	
			

		}
		System.out.println("Ajoutez le 7");
		Tableau2[9]=sc.nextInt();
		
		for(int i=0; i<Tableau2.length;i++) {
		Arrays.sort(Tableau2);
	}
		System.out.println(Arrays.toString(Tableau2));
	
	
	

}
}