package provaParte2;

public class Fila<T>{
	 private No inicio;
	    private No fim;
	    private int total_objetos = 0;
		private int tamanho;
		public Object[] elementos;
		
	    
	   
	    public Fila() 
	    {
	    	
	        inicio = new No();
	        fim = inicio;
	        inicio.setProximo(null);
	       
	    }
	   
		public void enfileirar(Object elemento) 
	    {
	    	
	        fim.proximo = new No();
	        fim = fim.getProximo();
	        fim.setItem(elemento);
	        fim.proximo = null;
	        total_objetos++;
	      
	    }
	    
	    public int tamanho() {
	        return total_objetos;
	    }
	    public boolean estaVazia() {
	        return (inicio == fim);
	    	
	    }
	    
	    public Object desenfileira() throws Exception{
	        Object valor=null;
	        if (estaVazia()) {
	            throw new Exception("Erro! A Fila está vazia ");
	        }
	        inicio = inicio.getProximo();
	        valor = inicio.getItem();
	        return valor;
	    }
	    
	    public String toString() {
	    	StringBuilder s = new StringBuilder();
	        No aux;
	        aux = inicio.getProximo();
			s.append("[");
	        while (aux != null) {
	            s.append(aux.getItem().toString());
	            s.append(" ");
	            aux = aux.getProximo();
	        }
	        
	        return s.toString();
	    }
	  
}