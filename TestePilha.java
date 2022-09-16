
public class TestePilha {
	public static void main(String[] args) {
		try{
			Pilha p1 = new Pilha();
			p1.push("joao");
			p1.push("maria");
			p1.push("jose");
			System.out.println(p1.top());
			String topo;
			topo = p1.top(); //jose
			p1.pop();
			System.out.println(p1.top());
			p1.pop();
			topo = p1.top(); //joao
			System.out.println(topo);
			p1.pop();
			p1.top();
			}
			catch(Exception e){
			System.out.println(e.getMessage());
			}
			}
	}