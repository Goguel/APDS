package dominio;

import java.util.Random;

public class Dado {
	
	private int valorFace;

	public int getValorFace() {
		return valorFace;
	}

	public void setValorFace() {
		Random gera = new Random();
		valorFace = gera.nextInt(11)+2;
	}
	
	
}
