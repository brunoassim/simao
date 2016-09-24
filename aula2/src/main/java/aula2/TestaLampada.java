package aula2;

public class TestaLampada {
	public static void main(String[] args) {
		Lampada A = new Lampada("fabricante", 1234);
		Interruptor B = new Interruptor(A);
		B.lamp.ligaLampada();
		B.apertar();
		B.apertar();
		B.apertar();
		B.apertar();
		B.apertar();
		B.apertar();
		B.apertar();

	}
}
