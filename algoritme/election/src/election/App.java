package election;

import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		double CandidatA;
		double CandidatB;
		double CandidatD;
		double CandidatC;
		String Resultat; 
		 Scanner sc;
		sc= new Scanner(System.in);
		
		System.out.println("Saisissez les Résultat pour Candidat A");
		CandidatA= sc.nextDouble();
		
		System.out.println("Saisissez les Résultat pour Candidat B");
		CandidatB= sc.nextDouble();

		System.out.println("Saisissez les Résultat pour CandidatC");
		CandidatC= sc.nextDouble();

		System.out.println("Saisissez les Résultat pour CandidatD");
		CandidatD= sc.nextDouble();
		
		if(50<CandidatA) {
			Resultat="élu";
		}else if(12.5<=CandidatA && CandidatA>CandidatB && CandidatA>CandidatC && CandidatA>CandidatD) {
			Resultat="favroable";
		}else if(12.5<=CandidatA) {
			Resultat="défavorable";
		}else {
			Resultat="perdant";
		}
		System.out.println("Le CandidatA est "+ Resultat+" avec "+ CandidatA);
	}
}
