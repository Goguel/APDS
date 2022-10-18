package dominio;

import java.time.LocalDate;  
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Empresa {
	
	private String nomeEmpresa;
	private int qtdFuncionarios;
			
	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public int CalculaAnos(String admissao, String recisao) {
		LocalDate x = LocalDate.parse(admissao, DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate y = LocalDate.parse(recisao, DateTimeFormatter.ISO_LOCAL_DATE);
		Period period = Period.between(x, y);
		int anos = Math.abs(period.getYears());
	    return(anos);
	}
	public int CalculaMeses(String admissao, String recisao) {
		LocalDate x = LocalDate.parse(admissao, DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate y = LocalDate.parse(recisao, DateTimeFormatter.ISO_LOCAL_DATE);
		Period period = Period.between(x, y);
		int meses = Math.abs(period.getMonths());
	    return(meses);
	}
	public int CalculaDias(String admissao, String recisao) {
		LocalDate x = LocalDate.parse(admissao, DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate y = LocalDate.parse(recisao, DateTimeFormatter.ISO_LOCAL_DATE);
		Period period = Period.between(x, y);
		int dias = Math.abs(period.getDays());
	    return(dias);
	}
}
