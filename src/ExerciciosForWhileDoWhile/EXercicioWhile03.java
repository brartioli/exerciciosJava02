package ExerciciosForWhileDoWhile;

import java.util.Scanner;

public class EXercicioWhile03 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int idade;
		int contMenor =0, contMaior=0;
		
		System.out.printf("Digite uma idade: ");
		idade = sc.nextInt();
		
		while(idade >= 0)
		{
			if(idade < 21) {
				contMenor++;
			}else if(idade >50) {
				contMaior++;
			}
			System.out.printf("Digite uma idade: ");
			idade = sc.nextInt();
			
		}
		System.out.println("Total de pessoas menores de 21 anos: " + contMenor);
		System.out.println("Total de pessoas maiores de 50 anos: " + contMaior);
		
						
		sc.close();
	}

}
