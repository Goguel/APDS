package questao_diagrama_APDS;

public class Quarto {

	private PortaQuarto Americana;
	private boolean Banheiro;
	private float MetragemQuadrada;
	
	public PortaQuarto getAmericana() {
		return Americana;
	}
	public void setAmericana(PortaQuarto americana) {
		Americana = americana;
	}
	public boolean isBanheiro() {
		return Banheiro;
	}
	public void setBanheiro(boolean banheiro) {
		Banheiro = banheiro;
	}
	public float getMetragemQuadrada() {
		return MetragemQuadrada;
	}
	public void setMetragemQuadrada(float metragemQuadrada) {
		MetragemQuadrada = metragemQuadrada;
	}
}
