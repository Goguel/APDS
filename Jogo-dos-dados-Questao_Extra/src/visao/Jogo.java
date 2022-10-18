package visao;

import java.util.Scanner;

import java.util.ArrayList;
import dominio.Jogador;
import dominio.Dado;
import dominio.Arquivo;

public class Jogo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int qtdJogadores, cnfrm, cnfrm2;
		int i= 1;
		int aux = 0;

		System.out.println("Digite quantos jogadores vão participar desta rodada :\n");
		qtdJogadores = ler.nextInt();
		if(qtdJogadores > 1 && qtdJogadores < 12 ) {
			ArrayList<Jogador> a1 = new ArrayList<Jogador>();
			
			do{
				Jogador j1 = new Jogador();
				System.out.println("\nDigite o primeiro nome do " + i + "º jogador:\n");
				j1.setNome(ler.next());
				System.out.println("\nDigite o número da aposta de " + j1.getNome() + ":");
				j1.setValorAposta(ler.nextInt());
				System.out.println("Informações inseridas no sistema");
				a1.add(j1);
				i++;
			}while(i < qtdJogadores+1);
			
			System.out.println("\nDigite 1 para jogar os dados, ou, 2 para desistir das apostas");
			cnfrm = ler.nextInt();
			
			if(cnfrm == 1) {
				Dado d1 = new Dado();
				d1.setValorFace();
				System.out.println("\nDados jogados\n");
				System.out.println("O resultado dos dados foi "+ d1.getValorFace()+"\n");
				for(i = 0; i<qtdJogadores; i++) {
					if(a1.get(i).getValorAposta()==d1.getValorFace()) {
						System.out.println("O jogador vencedor é "+ a1.get(i).getNome()+", que apostou o valor "+a1.get(i).getValorAposta());
						String path = "C:\\Users\\migue\\OneDrive\\Documentos\\out.txt";
						String texto_escrever = "\r\nO jogador " + a1.get(i).getNome()+ ", ganhou o jogo com a aposta de número "+a1.get(i).getValorAposta();
						if (Arquivo.Write(path, texto_escrever)) {
							   System.out.println("\nDados do ganhador gravados no arquivo");
							} else System.out.println("\nErro na gravação dos dados do ganhador");
						aux = 1;
					}
				}
				if(aux == 0) {
				System.out.println("Ninguém acertou. A máquina ganhou!");
				}
			} else System.out.println("\nApostas canceladas. Fim de jogo!");
		}else System.out.println("\nNúmero inválido de jogadores");
	}
}
