package aula2;

public class Lampada {
	String fabricante;
	int watts;
	boolean estado;

	public Lampada(String fabricante, int watts) {
		this.fabricante = fabricante;
		this.watts = watts;
	}

	public void ligaLampada() {
		estado = true;
		System.out.println("Ligada");
	}

	public void desligaLampada() {
		estado = false;
		System.out.println("Desligada");
	}

	public boolean estaligada() {
		return estado;
	}

}
