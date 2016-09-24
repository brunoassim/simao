package aula2;

public class Ponto {
	double x, y;
	
	public Ponto(double x,double y){
		this.x=x;
		this.y=y;
	}
	Ponto(double cordx){
		x=cordx;
		y=0;
	}
	Ponto(String alo){
		
	}

	public void deslocarPonto(double deltax, double deltay) {
		x += deltax;
		y += deltay;
	}

	public void zerarPonto() {
		x = 0;
		y = 0;
	}

	public boolean isYmenorQue0() {
		return(y<0);
	}

}
