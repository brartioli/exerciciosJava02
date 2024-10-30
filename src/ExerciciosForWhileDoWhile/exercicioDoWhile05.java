package ExerciciosForWhileDoWhile;

import java.util.Scanner;

public class exercicioDoWhile05 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
			int idade;
			int soma = 0;
			
			do{
				System.out.printf("Digite um número: ");
				idade = scanner.nextInt();
				
				if(idade > 0) {
					soma = soma + idade;
				}
			}while(idade != 0);
		
		System.out.println("A soma dos números positivos é: " +soma);
		
		scanner.close();
	}

}
