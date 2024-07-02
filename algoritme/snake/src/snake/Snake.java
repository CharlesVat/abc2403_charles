package snake;

public class Snake {


private float[][] corps= new float[2][];

public Snake() {

	corps=new float [10][10] ;
}

public Snake( float[][] _corps) {

	this.corps= _corps;
}

public Snake(Snake snakeclone) {

	this.corps=snakeclone.corps;
}

public boolean avancer(){
	int i=0;
	boolean retour=false;
	do {
		i++;
		corps[i][1];

		
	}while (i<5);
	
	if(corps[0][1]<corps[1][1]) {
		corps[0][1]= corps[0][1]-1;
		corps[1][1]=corps[1][1]-1;
		corps[2][1]=corps[2][1]-1;
		 retour=true;
	}
	return retour;
}

}
