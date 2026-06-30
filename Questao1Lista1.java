package vetoresLista1;
import java.util.Scanner;

public class Questao1Lista1 {
	public static void preencheVetor(int[] vetor, Scanner leitor) {
		//preenche o vetor aqui
		
		for(int i = 0; i < vetor.length; i++) {
		System.out.println("Informe valor: " + (i + 1));
		vetor[i] = leitor.nextInt();
		}
	}
	
	public static void imprimeVetor(int[] vetor) {
		//imprime o vetor aqui
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
	
	public static int somaPosicoes(int[] vetor, Scanner s) {
		System.out.println("Informe valor de um indice entre 0 e " + (vetor.length - 1 ));
		int x = s.nextInt();
		while(x < 0 || x > vetor.length - 1) {
			System.out.println("Valor inválido, Informe valor de um indice entre 0 e " + (vetor.length - 1 ));
			x = s.nextInt();
		}
		int y = s.nextInt();
		while(y < 0 || y > vetor.length - 1) {
			System.out.println("Valor inválido, Informe valor de um indice entre 0 e " + (vetor.length - 1 ));
			y = s.nextInt();
		}
		
		return vetor[x] + vetor[y];
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] lista = new int[5]; //5 é a quantidade de "casinhas", ou arrays
		
		preencheVetor(lista, s);
		imprimeVetor(lista);
		System.out.println("Soma: " + somaPosicoes(lista, s));
	}

}
