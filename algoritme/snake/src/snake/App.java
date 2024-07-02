package snake;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[][] corps = new float[][] {{1,1},{1,2},{1,3}};
		
		float[] position1 =corps[0];
		float position1X= position1[0];
		float positionY= corps[0][1];
		float[] position2 = corps[2];
		
		Snake serpent  = new Snake(corps) ;
		
		boolean avancer = serpent.avancerUnCran();
		
	}

}
