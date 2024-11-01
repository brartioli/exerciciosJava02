package exerciciosVetores;

import java.util.Scanner;

public class ExercicioVetor01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vetorNumeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero;

		System.out.printf("Digite o número que você deseja encontrar: ");
		numero = scanner.nextInt();

		for (int i = 0; i < vetorNumeros.length; i++) {
			if (vetorNumeros[i] == numero) {
				System.out.println("O número " + numero + " está localizado na posição: " + i);
			}
			
		}
		if(numero > vetorNumeros.length) {
			System.out.println("O número " + numero + " não foi encontrado.");
		}
		

		scanner.close();
	}

}