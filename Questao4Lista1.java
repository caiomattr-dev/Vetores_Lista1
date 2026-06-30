package vetoresLista1;

import java.util.Scanner;

public class Questao4Lista1 {
	public static void preencherV(int vetor[], Scanner s) {
		System.out.println("Insira um valor x aleatório: ");
		// valorX = s.nextInt();
		int posicao = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Insira um valor: ");
			vetor[i] = s.nextInt();
			/*
			 * if(valorX == vetor[i]) { posicao += i; }
			 */
		}
		System.out.println("Foi encontrado na posição: " + (posicao + 1));
	}

	public static void acharX(int vetor[], int valorX, Scanner s) {
		System.out.println("Insira um valor para x: ");
		valorX = s.nextInt();

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int lista[] = new int[5];
		int x = 0;
		preencherV(lista, s);
		acharX(lista, x, s);
		// int valorX
	}

}
