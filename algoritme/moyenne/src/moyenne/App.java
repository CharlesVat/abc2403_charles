package moyenne;
//import qui import le outils
import java.util.Scanner;
import java.lang.Math;
public class App {

	public static void main(String[] args) {
		long rayon;
		long aire;
		long volume;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("inserez le rayon :");
		
		rayon= sc.nextLong();
		aire = (long) (4.0* Math.PI * (Math.pow(rayon,  2)));
		volume =(long) (4.0 * Math.PI * (Math.pow(rayon,  3)))/3;
		
		System.out.println("l'air est de "+ aire);
		System.out.println("le volume est de "+ volume);
		
		sc.close();
	}

}
