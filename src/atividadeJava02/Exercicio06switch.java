package atividadeJava02;

import java.util.Scanner;

public class Exercicio06switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int codigo;
		String cargo= "";
		float salario = 0;
		double reajuste = 0;
		
		System.out.printf("Nome do colaborador: ");
		nome = leia.nextLine();
		System.out.printf("Cargo: ");
		codigo = leia.nextInt();
		System.out.printf("Salário: ");
		salario = leia.nextFloat();
		
		switch(codigo) {
		
		case 1: cargo = "Gerente";
				reajuste = 0.10;
				break;
				
		case 2: cargo = "Vendedor";
				reajuste = 0.07;
				break;
				
		case 3: cargo = "Supervisor";
		reajuste = 0.09;
				break;
		
		case 4: cargo = "Motorista";
		reajuste = 0.06;
				break;
				
		case 5: cargo = "Estoquista";
		reajuste = 0.05;
				break;
				
		case 6: cargo = "Técnico de TI";
		reajuste = 0.08;
				break;
				
		default: 
			System.out.println("Opção inválida! tente novamente.");
		}
		double novoSalario = salario +(reajuste * salario);
		
		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Cargo: " +cargo);
		System.out.println("Salário: " +novoSalario);
		
		
		leia.close();
	}

}
