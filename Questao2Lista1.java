package vetoresLista1;

import java.util.Scanner;

public class Questao2Lista1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int lista[] = new int[10];

		System.out.println("insira um número x: ");
		int x = s.nextInt();
		int posicao = 0;

		String existe = "";

		for (int i = 0; i < lista.length; i++) {
			System.out.println("Insira um número: ");
			lista[i] = s.nextInt();
			if (x == lista[i]) {
				existe = "O valor x foi encontrado na posição: " + (i + 1);
			}
		}
		if (existe == "")
			existe = "valor x nao foi encontrado";
		System.out.println(existe);
	}
}
