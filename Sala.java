package questao_diagrama_APDS;

public class Sala {

	private PortaSala PortaEntrada;
	private float MetragemQuadrada;
	private Porta PortaAuxiliar;
	
	public PortaSala getPortaEntrada() {
		return PortaEntrada;
	}
	public void setPortaEntrada(PortaSala portaEntrada) {
		PortaEntrada = portaEntrada;
	}
	public float getMetragemQuadrada() {
		return MetragemQuadrada;
	}
	public void setMetragemQuadrada(float metragemQuadrada) {
		MetragemQuadrada = metragemQuadrada;
	}
	public Porta getPortaAuxiliar() {
		return PortaAuxiliar;
	}
	public void setPortaAuxiliar(Porta portaAuxiliar) {
		PortaAuxiliar = portaAuxiliar;
	}
}
