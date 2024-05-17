import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner sc;
		sc= new Scanner(System.in);
		int Nombre;
		int Top=0;
		int NombreM;
		
		NombreM=0;
		for (int i=1;i<=20;i++) {
			
			System.out.println("Saisissez le numero "+ i);
			Nombre=sc.nextInt();
			if(Nombre>NombreM) {
				NombreM=Nombre;
				Top=i;
			}
			
		}
		System.out.println("le plus grand nombre est: "+ NombreM);
		System.out.println(NombreM+ " étant le nombre numéro: " + Top);
		

	}

}
