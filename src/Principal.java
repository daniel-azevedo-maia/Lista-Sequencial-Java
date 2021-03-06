
public class Principal {

	public static void main(String[] args) {
		
		Lista listaSequencial = new Lista();
		
		System.out.println("Lista vazia? " +  listaSequencial.estaVazia());
		System.out.println("Lista cheia? " + listaSequencial.estaCheia());
		System.out.println("A lista cont?m " + listaSequencial.tamanhoLista() + " elementos.");
		
	//Criando contatos:
		
	Contato c1 = new Contato();
	c1.nome = "Goku";
	c1.telefone = "1111-1111";
	
	Contato c2 = new Contato();
	c2.nome = "Gohan";
	c2.telefone = "2222-2222";
	
	Contato c3 = new Contato();
	c3.nome = "Goten";
	c3.telefone = "3333-3333";
	
	Contato c4 = new Contato();
	c4.nome = "Bulma";
	c4.telefone = "4444-4444";
	
	//Inserindo contatos:
	
	listaSequencial.inserirContato(0, c1);
	listaSequencial.inserirContato(1, c2);
	listaSequencial.inserirContato(2, c3);
	listaSequencial.inserirContato(3, c4);
	listaSequencial.inserirContato(2, c4);
	
	//Exibindo lista:
	
	listaSequencial.exibirLista();
	
	//Removendo o elemento da primeira posi??o:
	listaSequencial.remover(0);
	
	//Buscar elemento por ?ndice:
	System.out.println("\nNome do elemento da terceira posi??o ?: " + listaSequencial.buscar(2).nome);
	
	//Buscar posi??o do elemento c2 (Gohan):
	System.out.println("\nPosi??o do contato Gohan ?: " + listaSequencial.retornarPosicao(c2));
		
	}
}
