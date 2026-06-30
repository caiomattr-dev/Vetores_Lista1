package vetoresLista1;
import java.util.Scanner;

public class Questao5Lista1 {
	public static void contaPar(int vetor[], Scanner s) {
		int par = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Diga um número: ");
			vetor[i] = s.nextInt();
			if(vetor[i] % 2 == 0)
				par++;
		}
		System.out.println("Pares: " + par);
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		int lista[] = new int[10];
		contaPar(lista, s);
	}

}
