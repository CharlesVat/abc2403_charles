package moyenne;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		long rayon;
		long aire;
		long volume;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("inserez le rayon :");
		
		rayon= sc.nextLong();
		aire = (long) (4 * 3.14 * (rayon * rayon));
		volume =(long) (4 * 3.14 * (rayon * rayon * rayon));
		
		System.out.println("l'air est de "+ aire);
		System.out.println("le voulume est de"+ volume);
	}

}
