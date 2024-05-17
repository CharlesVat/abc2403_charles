import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner sc;
		sc= new Scanner(System.in);
		int Nombre;
		int Top=0;
		int NombreM=0;
		int i=1;
		do {
			System.out.println("Saisir le  nombre Numéro: "+ i++);
			Nombre=sc.nextInt();
			
			if(Nombre>NombreM) {
				NombreM=Nombre;
				Top=i;
			}
		}while(Nombre!=0);
		
		System.out.println("le plus grand nombre est: "+ NombreM);
		System.out.println(NombreM+ " étant le nombre numéro: " + Top);
		
		
		
		
		
	}
}
