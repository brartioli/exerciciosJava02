package ExerciciosForWhileDoWhile;

import java.util.Scanner;

public class ExercicioDoWhile06 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int soma =0;
		float contador=0;
		float media=0;
		
		do{
			System.out.printf("Digite um número: ");
			numero = scanner.nextInt();
			
			if(numero % 3 == 0) {
				soma = soma + numero;
				contador++;
			}
		}while(numero != 0);
		
		media = soma/contador;

		System.out.println("A média de todos os números múltiplos de 3 é: " +media);
	
	scanner.close();
	}

}
