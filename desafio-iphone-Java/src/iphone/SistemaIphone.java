package iphone;

import java.util.InputMismatchException;
import java.util.Scanner;

import iphone.musica.ReprodutorMusical;
import iphone.navegador.NavegadorInternet;
import iphone.telefone.AparelhoTelefonico;

public class SistemaIphone {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		int escolha;
		int opcao;
		
		
		AparelhoTelefonico telefone = new AparelhoTelefonico();
		ReprodutorMusical musica = new ReprodutorMusical();
		NavegadorInternet navegador = new NavegadorInternet();		
		
		do {
			
		System.out.println("\tIPHONE 27\n\n1.Telefone\n2.Musica\n3.Navegar\n*.Sair\n\n");
		opcao = scan.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("\tIPHONE 27\n\tTelefone\n1.Ligar\n2.Atender Chamada\n3.Ouvir correio de voz\n*.Voltar\n\n");
				escolha = scan.nextInt();
				switch(escolha) {
					case 1:
						String numero = "";
						System.out.println("Digite o numero:\n");
						numero = scan.next();
						telefone.ligar(numero);
						break;
					case 2:
						telefone.atender();
						break;
					case 3:
						telefone.iniciarCorreioVoz();
						break;
					case 0:
						break;
					default:
				}
				break;
			case 2:
				System.out.println("\tIPHONE 27\n\tMusica\n1.Play\n2.Pausar\n3.Escolher Musica\n*.Voltar\n\n");
				escolha = scan.nextInt();
				switch(escolha) {
				case 1:
					musica.tocar();
					break;
				case 2:
					musica.pausar();
					break;
				case 3:
					System.out.println("\nDigite o nome da musica:");
					scan.nextLine();
					String novaMusica=scan.nextLine();
					
					musica.selecionarMusica(novaMusica);				
					break;
				case 0:
					break;
				default:
			}
				break;
			case 3:
				System.out.println("\tIPHONE 27\n\tNavegar\n1.Ir Ate a Pagina\n2.adicionarNovaAba\n3.Recarregar Pagina\n*.Voltar\n\n");
				escolha = scan.nextInt();
				switch(escolha) {
				case 1:
					try {
						System.out.println("Digite a url:");
						String url = scan.next();
						navegador.exibirPagina(url);
					} catch (InputMismatchException e) {
						System.err.println("Digite a url sem espaço.");
					}
					
					
					break;
				case 2:
					navegador.adicionarNovaAba();
					break;
				case 3:
					navegador.atualizarPagina();
					break;
				case 0:
					break;
				default:
			}
				break;
			default:
				System.out.println("\tIPHONE 27\n\nTCHAU ATE A PROXIMA.");
				Thread.sleep(3000);
				opcao = 0;		
		}

	}while(opcao != 0);
	}
	
	
    

}
