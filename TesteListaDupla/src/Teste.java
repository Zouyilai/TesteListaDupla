import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Lista lista = new Lista();
		
		Scanner teclado = new Scanner(System.in);
		
		lista.inserir("zou", 178066);
		lista.inserir("selmini", 178067);
		
		lista.imprimir();
		
	}

}
