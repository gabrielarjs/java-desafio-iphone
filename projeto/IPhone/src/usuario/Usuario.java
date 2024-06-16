package usuario;

import dispositivo.IPhone;

public class Usuario {
	
	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		
		iphone.selecionarMusica("Yellow Submarine");
		iphone.tocar();
		iphone.pausar();
		
		iphone.ligar("4002-8922");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		iphone.adicionaNovaAba();
		iphone.exibePagina("web.dio.me");
		iphone.atualizarAba();
	
	}
	
	
}
