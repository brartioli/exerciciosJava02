package exerciciosVetores;

import java.util.Scanner;

public class ExercicioVetor02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vetorNumeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int soma = 0;
		float media = 0;

		System.out.println("Elementos nos índices pares: ");
		for (int i = 0; i < vetorNumeros.length; i++) {
			if (vetorNumeros[i] % 2 == 1) {
				System.out.print(vetorNumeros[i] + ",");
			}
		}

		System.out.println();
		System.out.println("Elementos nos índices pares: ");
		for (int i = 0; i < vetorNumeros.length; i++) {
			if (vetorNumeros[i] % 2 == 0) {
				System.out.print(vetorNumeros[i] + ",");
			}
		}
		System.out.println();
		for (int i = 0; i < vetorNumeros.length; i++) {
			soma = soma + vetorNumeros[i];
		}
		System.out.println("Soma: " + soma);

		media = (float) soma / vetorNumeros.length;
		System.out.printf("Média: %.2f", media);

		scanner.close();
	}

}
