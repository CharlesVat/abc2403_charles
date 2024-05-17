package dixprochainchifffre;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
	Scanner sc;
	int Nombres;
	int Nombresup;
	
	sc= new Scanner(System.in);
	
	System.out.println("Saisissez un nombre");
	Nombres= sc.nextInt();
	Nombresup=Nombres+10;
	System.out.println("les 10 prochaine nombre aprés "+Nombres+" est:");
//	while(Nombres != Nombresup) {
//		Nombres++;
//		System.out.print(" "+Nombres);
//	}
	
	for(int i = Nombres+1; i <= Nombresup;i++){
		System.out.print(" "+i);
	}
	
	}

}
