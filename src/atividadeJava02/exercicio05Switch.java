package atividadeJava02;

import java.util.Scanner;

public class exercicio05Switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigo, quantidade;
		String produto = "";
		double preco = 0, valorTotal = 0;
		
		System.out.printf("Código do produto: ");
		codigo = leia.nextInt();
		System.out.printf("Quantidade: ");
		quantidade = leia.nextInt();
		
		switch (codigo) {
		case 1: produto = "Cachorro-quente";
				preco = 10.0;
				break;
				
		case 2: produto = "X-Salada";
				preco= 15.00;
				break;
				
		case 3: produto = "X-Bacon";
				preco = 18.00;
				break;
				
		case 4: produto = "Bauru";
		        preco = 12.00;
		        break;
		        
		case 5: produto = "Refrigerante";
				preco = 8.00;
				break;
				
		case 6: produto = "Suco de laranja";
				preco = 13.00;
				break;
				
		default: 
			System.out.println("Opção inválida!! por favor, escolha uma opção válida.");
		}
		valorTotal = quantidade * preco;
		
		System.out.println("Produto: " + produto);
		 System.out.printf("Valor Total: R$ %.2f\n", valorTotal);
		
		
		leia.close();
	}

}
