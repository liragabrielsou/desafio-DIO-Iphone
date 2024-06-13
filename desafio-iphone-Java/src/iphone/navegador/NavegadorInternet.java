package iphone.navegador;

import java.util.Scanner;

public class NavegadorInternet {
	Scanner scan = new Scanner(System.in);
	String urlAtual = "www.bolos.com";

	public String exibirPagina(String url) throws InterruptedException {
		urlAtual=url;
		System.out.println("https://" + urlAtual + "/");
		for (int i = 0; i < 3; i++) {
			Thread.sleep(1000);
			System.out.printf(".");
		}

		System.out.println("\n\n\tBEM-VINDO\n\n\tSair");
		scan.nextLine();
		scan.nextLine();
		return "";
	}
	
	public void adicionarNovaAba() throws InterruptedException{
	System.out.println("NOVA ABA\n Url:\n");
	exibirPagina(scan.next());
	
	}
	
	public void atualizarPagina() throws InterruptedException {
		exibirPagina(urlAtual);
	}


}
