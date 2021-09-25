package provaParte2;

public class Pilha<T> extends Controller<T> {
	
	public Pilha()
	{
		super();
	}
	
	public Pilha(int capacidade)
	{
		super(capacidade);
	}
	
	public void empilha(int i)
	{
		super.adiciona(i);
	}
	
	public T topo()
	{
		
		if (this.estaVazia())
		{
			return null;
		} 
		
		return this.elementos[tamanho-1];
	}
	
	public T desempilha()
	{
		
		if (this.estaVazia())
		{
			return null;
		}
		
		return this.elementos[--tamanho];
	}

	public void empilha(String string) {
		// TODO Auto-generated method stub
		
	}
	
}