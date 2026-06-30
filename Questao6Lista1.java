package vetoresLista1;

import java.util.Scanner;

public class Questao6Lista1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int lista[] = new int[10];

		for (int i = 0; i < lista.length; i++) {
			System.out.println("Insira um número: ");
			lista[i] = s.nextInt();

			if (lista[i] < 0) {
				lista[i] = 0;
			}
		}
		System.out.println("Voce deseja ver uma casa? ");
		String verCasa = s.next();

		while (verCasa.equalsIgnoreCase("S")) {
			System.out.println("escolha uma casa para ler entre 0 e 4");
			int x = s.nextInt();
			System.out.println(lista[x]);
			System.out.println("Deseja ver de novo? ");
			verCasa = s.next();
		}
		System.out.println("Fim do programa");
	}
}
