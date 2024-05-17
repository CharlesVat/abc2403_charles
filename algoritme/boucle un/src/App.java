import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int Nombre;
		Scanner sc;
		sc=new Scanner(System.in);
		
		do {
			System.out.println("Saisissez un chiffre entre 1 et 3");
			Nombre= sc.nextInt();
		}while(Nombre>3 || Nombre<1);
		System.out.println("bravo vous avez trouvez");

	}

}
