import java.util.ArrayList;


public class Pilha {
	private ArrayList<String> dados = new ArrayList<>();
 
	public void push(String s) {
		dados.add(s);
	}
	public void pop() throws Exception {
		if(dados.isEmpty())
			throw new Exception("erro no pop() - pilha vazia");
		dados.remove(dados.size() - 1);
		

	}
	public String top() throws Exception {
		if(dados.isEmpty())
			throw new Exception("erro no top() - pilha vazia");
		
		return dados.get(dados.size() - 1);
	}
	
}
