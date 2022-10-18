package visao;

import java.util.Scanner;
import dominio.Pessoa;
import dominio.Empresa;
import dominio.Emprego;

public class Principal {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		String admissão, recisão;
		int i, n;
		
		System.out.println("Quantas pessoas trabalharam?");
		n = l.nextInt();

		Pessoa p1 = new Pessoa();
		Emprego e1 = new Emprego();
		Empresa ep1 = new Empresa();	
		
		for(i=0; i<n; i++) {
			System.out.println("Digite o primeiro nome da "+(i+1)+"ª pessoa:");
			p1.setNome(l.next());
			System.out.println("Digite o Cpf (apenas os números) de "+p1.getNome()+":");
			p1.setCPF(l.nextInt());
			System.out.println(p1.getNome()+" trabalhou em quantas empresas?");
			p1.setNumEmpresas(l.nextInt());
				for(i=0; i<p1.getNumEmpresas(); i++) {
					System.out.println("Digite o nome da "+(i+1)+" empresa em que "+p1.getNome()+" trabalhou (Sem utilizar espaços):");
					ep1.setNomeEmpresa(l.next());
					System.out.println("Digite a quantidade de funcionários que trabalham na empresa "+ep1.getNomeEmpresa()+":");
					ep1.setQtdFuncionarios(l.nextInt());
					System.out.println("Digite o nome do seu emprego na empresa "+ep1.getNomeEmpresa()+":");
					e1.setNomeEmprego(l.next());
					System.out.println("Digite o seu salário no emprego "+ e1.getNomeEmprego()+":");
					e1.setSalario(l.nextInt());
					System.out.println("Digite a data de admissão de "+p1.getNome()+" na empresa "+ep1.getNomeEmpresa()+":");
					admissão=l.next();
					System.out.println("Digite a data de recisão de "+p1.getNome()+" na empresa "+ep1.getNomeEmpresa()+":");
					recisão=l.next();
					System.out.println(p1.getNome()+" trabalhou "+ep1.CalculaAnos(admissão, recisão)+" anos, "+ep1.CalculaMeses(admissão, recisão)+" meses e "+ep1.CalculaDias(admissão, recisão)+" dias, na empresa "+ep1.getNomeEmpresa()+", no emprego "+e1.getNomeEmprego()+".");
				}
		}
	}

}
