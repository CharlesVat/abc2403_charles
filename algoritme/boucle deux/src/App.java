import java.util.Scanner;
public class App {

	public static void main(String[] args) {
	int Nombre;
	Scanner sc;
	
	sc= new Scanner(System.in);
	
	do {
		System.out.println("Saisissez un nombre entre 10 et 20");
		Nombre=sc.nextInt();
		 	if(Nombre>20) {
			System.out.println("Plus petit");
		} else if(Nombre<10) {
			System.out.println("plus grand");
		}
		
	}while(Nombre>20 || Nombre<10);
	
	System.out.println("Yes you did it!");

	}

}
