package Projeto;


public class Usuario {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		Musica musica = new Musica();
		
		
		iphone.ligar();
	
		iphone.selecionarMusica();
		
		musica.exibirMusicas("Música A");
		
		
		iphone.tocar();
		iphone.pausar();
		
		iphone.atender();
		
		iphone.adicionarNovaAba();
		iphone.exibirPagina();
		iphone.atualizarPagina();
		
		iphone.iniciarCorreioVoz();
		
		

	}

}
