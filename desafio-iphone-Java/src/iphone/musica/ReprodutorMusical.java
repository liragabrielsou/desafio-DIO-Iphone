package iphone.musica;

public class ReprodutorMusical {
	String musicaAtual = "Lulu Santos - Apenas uma de Amor";
	//tocando = 0 ,significa que está pausado se estiver com 1 estara reproduzindo.
	int tocando = 0;
	
	public void tocar() {
		if(tocando==0) {
		System.out.println("\n\n[Tocando] "+musicaAtual+"\n\n");
		tocando = 1;
		}else {
			System.out.println("\n\n\tJÁ REPODUZINDO\n\n[Tocando] "+musicaAtual+"\n\n");
		}
	}
	public void  pausar() {
		if(tocando==1) {
		System.out.println("\n\n[Pausado] "+musicaAtual+"\n\n");
		tocando=0;
		}else {
			System.out.println("\n\n\tJÁ ESTÁ EM PAUSA\n\n[Pausado] "+musicaAtual+"\n\n");
		}
	}
	public String selecionarMusica(String musica) {
		musicaAtual = musica;
		System.out.println("\n\nReproduzindo\n"+musica+"\n\n");
		return "";
	}
	
}
