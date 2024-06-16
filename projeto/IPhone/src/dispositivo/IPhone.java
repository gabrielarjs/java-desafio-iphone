package dispositivo;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
	
	private String musica;
	private String numero;
	private String url;
	
	public IPhone(){}

	@Override
	public void selecionarMusica(String musica) {
		this.musica = musica;
		System.out.println("Adionando musica: "+this.musica);
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica: "+this.musica);
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica: "+this.musica);
	}
	
	@Override
	public void ligar(String numero) {
		this.numero = numero;
		System.out.println("Ligando para: "+this.numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}

	@Override
	public void exibePagina(String url) {
		this.url = url;
		System.out.println("Acessando a pagina "+this.url);
	}

	@Override
	public void adicionaNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarAba() {
		System.out.println("Atualizando a pagina "+this.url);
	}

}
