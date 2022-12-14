package visao;

import java.util.Scanner;
import dominio.Pessoa;
import dominio.Empresa;
import dominio.Emprego;

public class Principal {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		String admiss?o, recis?o;
		int i, n;
		
		System.out.println("Quantas pessoas trabalharam?");
		n = l.nextInt();

		Pessoa p1 = new Pessoa();
		Emprego e1 = new Emprego();
		Empresa ep1 = new Empresa();	
		
		for(i=0; i<n; i++) {
			System.out.println("Digite o primeiro nome da "+(i+1)+"? pessoa:");
			p1.setNome(l.next());
			System.out.println("Digite o Cpf (apenas os n?meros) de "+p1.getNome()+":");
			p1.setCPF(l.nextInt());
			System.out.println(p1.getNome()+" trabalhou em quantas empresas?");
			p1.setNumEmpresas(l.nextInt());
				for(i=0; i<p1.getNumEmpresas(); i++) {
					System.out.println("Digite o nome da "+(i+1)+" empresa em que "+p1.getNome()+" trabalhou (Sem utilizar espa?os):");
					ep1.setNomeEmpresa(l.next());
					System.out.println("Digite a quantidade de funcion?rios que trabalham na empresa "+ep1.getNomeEmpresa()+":");
					ep1.setQtdFuncionarios(l.nextInt());
					System.out.println("Digite o nome do seu emprego na empresa "+ep1.getNomeEmpresa()+":");
					e1.setNomeEmprego(l.next());
					System.out.println("Digite o seu sal?rio no emprego "+ e1.getNomeEmprego()+":");
					e1.setSalario(l.nextInt());
					System.out.println("Digite a data de admiss?o de "+p1.getNome()+" na empresa "+ep1.getNomeEmpresa()+":");
					admiss?o=l.next();
					System.out.println("Digite a data de recis?o de "+p1.getNome()+" na empresa "+ep1.getNomeEmpresa()+":");
					recis?o=l.next();
					System.out.println(p1.getNome()+" trabalhou "+ep1.CalculaAnos(admiss?o, recis?o)+" anos, "+ep1.CalculaMeses(admiss?o, recis?o)+" meses e "+ep1.CalculaDias(admiss?o, recis?o)+" dias, na empresa "+ep1.getNomeEmpresa()+", no emprego "+e1.getNomeEmprego()+".");
				}
		}
	}

}
