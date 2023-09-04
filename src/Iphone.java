
public class Iphone implements Telefone, ReprodutorMusical, NavegadorInternet {

	public void exibirPagina(String endereco) {
		System.out.println("Exibindo a página " + endereco);
		
	}

	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba");
		
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página");
		
	}

	public void tocar() {
		System.out.println("Tocando música");
		
	}

	public void pausar() {
		System.out.println("Pausando música");
		
	}

	public void selecionarMusica() {
		System.out.println("Selecionando música");
		
	}

	public void ligar(String numeroTelefone) {
		System.out.println("Ligando para " + numeroTelefone);
		
	}

	public void atender() {
		System.out.println("Atendendo telefone");
		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
		
	}

}
