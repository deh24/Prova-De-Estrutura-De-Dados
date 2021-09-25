package provaParte2;

public class Principal {
	
	public static void main(String[] args) throws Exception 
	{
		try 
		{
			Pilha<Integer> pilha = new Pilha<>();
			
			Fila<Integer>fila = new Fila<>();
			
			System.out.println("Pilha A vazia? " + fila.estaVazia()+ "\n");
			
			System.out.println("Fila A");
			
			fila.enfileirar("Açai");
			fila.enfileirar("Bolo Gelado");
			fila.enfileirar("Bolo de Pote");
			fila.enfileirar("Brigadeirão");
			pilha.empilha("Mousse de Tapioca");
			pilha.empilha("Moussse de Chocolate");
			pilha.empilha("Tapioca Recheada");
			pilha.empilha("Bolo Especial");
			
			System.out.println(fila+"]");
			
			System.out.println("pilha A vazia? " + fila.estaVazia() + "\n");
			System.out.println("Tamanho da pilha A = " + fila.tamanho()+ "\n");
			System.out.println("Pilha A = " + fila + "]\n");
			
		
			
			System.out.println("---------------------------");
			
			System.out.println("Pilha B vazia? " + pilha.estaVazia()+ "\n");
			System.out.println("Tamanho da pilha B = " + pilha.tamanho()+ "\n");
			System.out.println("Pilha B [" + pilha+ "\n");
			
			System.out.println("Topo da Pilha B = " + pilha.topo()+ "\n");
			
			System.out.println("---------------------------");
			
			System.out.println("Pilha completa " + fila +""+ pilha+"\n");
			
			System.out.println("Tamanho da pilha A = " +  fila.tamanho() + "\n");
			System.out.println("Tamanho da pilha B = " + pilha.tamanho() + "\n");
			
			fila.desenfileira();
			fila.desenfileira();
			fila.desenfileira();
			
			fila.enfileirar("Coxinha");
			pilha.empilha("Risole");
			pilha.empilha("Bolinho de carne");
			pilha.empilha("Bolinho de Queijo");
			pilha.empilha("Pizza");
			fila.enfileirar("Bolinho de Arroz");
			pilha.empilha("Coxinha vegana");
			pilha.desempilha();
			fila.enfileirar("Coxinha de pote");
			fila.desenfileira();
			fila.desenfileira();
			fila.enfileirar("Bolinho de carne seca com queijo");
			fila.enfileirar("Esfira de CArne");
			pilha.empilha("Coxinha");
			fila.enfileirar("Misto quente");
			
			System.out.println("Adicionando elementos nas pilhas A e B\n" );
	
			
			System.out.println("Pilha completa " + fila +""+ pilha + "\n");
			
			System.out.println("Novo tamanho da pilha A = " + fila.tamanho());
			System.out.println("Novo tamanho da pilha B = " + pilha.tamanho() + "\n");
			
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
