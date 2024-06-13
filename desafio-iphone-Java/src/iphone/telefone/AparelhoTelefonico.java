package iphone.telefone;

import java.util.Scanner;

public class AparelhoTelefonico {
	Scanner scan = new Scanner(System.in);
	int chamadaPerdida = 1;
	
	public String ligar(String numero) throws InterruptedException {
		System.out.println("\n\n\tChamando\n\t"+numero+"\n\n");
		Thread.sleep(7000);
		System.out.println("\n\n\tChamada\n\tNão atendida\n\t"+numero+"\n\n\n\tTente novamente");
		Thread.sleep(7000);
		return "";
	}
	
	public void atender() throws InterruptedException {
		System.out.println("\n\n\tCOVT\n\t(21)0800-8524\n\tConectando");
		Thread.sleep(7000);
		System.out.println("\n\n\tCOVT\n\t(21)0800-8524\n\tNão foi possivel\n\tConectar");
		Thread.sleep(4000);
		chamadaPerdida++;
	}
	
	public void iniciarCorreioVoz() throws InterruptedException {
		int ouvir = 0;
		System.out.printf("\n\tCORREIO DE VOZ\n\tVoce possui %d \n\tmensagens de voz\n\nDeseja ouvir o ultimo correio?\n(A voz sera transcripta por conta do sinal.)\n1.Sim\n2.Não",chamadaPerdida);
		ouvir = scan.nextInt();
		
		switch(ouvir) {
		case 1:
			System.out.println("\n\nOlá, voce sabia que a COVT está com uma grandre\npromoção para você ,basta recarrgar R$ 30 ...\n\ndigite para voltar.\n\n");
			scan.nextLine();
			scan.nextLine();
			break;
		case 2:
			
			break;
		default:
					
		}
		
	}
	
	
	
	

}
