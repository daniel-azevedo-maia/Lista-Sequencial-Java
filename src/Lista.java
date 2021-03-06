
public class Lista {
	
	Contato[] contatos = new Contato[100];
	int tamanho = 0;
	
	public boolean estaVazia() {
		return(tamanho == 0);
	}
	
	public boolean estaCheia() {
		return(tamanho == contatos.length);
	}
	
	public int tamanhoLista() {
		return tamanho;
	}
	
	public Contato buscar(int pos) {
	//Verifica se a variavel posi??o (pos) ? v?lida
		if ( (pos >= tamanho) || (pos < 0) ) {
			return null;
		}
		return contatos[pos];		
	}
	
	public boolean compara(Contato c1, Contato c2) {
		return (c1.nome.equals(c2.nome)) && (c1.telefone.equals(c2.telefone));
	}
	
	public int retornarPosicao(Contato contato) {
		for(int i = 0; i < tamanho; i++) 
			if(compara(contatos[i], contato)) 
				return i;
			return -1;
	}
	
	//Antes, veja a fun??o inserirContato
	public void deslocaDireita(int pos) {
		for (int i = tamanho; i > pos; i--) { //N?o vai acontecer na inclus?o do 1? elemento. Esse for vai do TAMANHO DA LISTA at? esse tamanho ficar MAIOR do que a posi??o indicada
			contatos[i] = contatos[i - 1];
		}
	}
	
	public boolean inserirContato(int pos, Contato c) {
		if ( estaCheia() || (pos > tamanho) || (pos < 0) )
			return false;
		deslocaDireita(pos);
		contatos[pos] = c;
		tamanho++;
		return true;
	}

	//Antes, veja a fun??o removerContato
	public void deslocaEsquerda(int pos) {
		for (int i = pos; i < (tamanho - 1); i++) {
			contatos[i] = contatos[i + 1];
		}
	}
	
	public boolean remover(int pos) {
		if ( (pos >= tamanho) || (pos < 0) )
			return false;
		deslocaEsquerda(pos);
		tamanho--;
		return true;
	}
	
	public void exibirLista() {
		for(int i = 0; i < tamanho; i++) {
			System.out.println("\nContato " + (i + 1) + "\nNome: "
					+contatos[i].nome
					+"\nTelefone: "
					+contatos[i].telefone);
		}
	}
}






















