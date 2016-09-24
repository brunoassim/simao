package aula2;

public class Interruptor {
	Lampada lamp;

	public Interruptor(Lampada lamp) {
		this.lamp = lamp;
	}

	public void apertar() {
		if (lamp.estaligada())
			lamp.desligaLampada();
		else
			lamp.ligaLampada();
	}
}
