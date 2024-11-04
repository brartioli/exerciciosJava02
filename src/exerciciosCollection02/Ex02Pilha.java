package exerciciosCollection02;

import java.util.Scanner;
import java.util.Stack;

public class Ex02Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner scanner = new Scanner(System.in);
		int menu;

		do {
			System.out.println("**************************************************");
			System.out.println("\n1 - Adicionar livro na pilha");
			System.out.println("2 - listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println();
			System.out.println("**************************************************");
			System.out.printf("Entre com a opção desejada: ");
			menu = scanner.nextInt();
			scanner.nextLine();
			
			switch (menu) {

			case 1:
				System.out.println("Digite o nome: ");
				pilha.add(scanner.nextLine());
				System.out.println("\nPilha: " + pilha + " Livro adicionado!");
				break;

			case 2:
				System.out.println("\nLista de livros na pilha: " + pilha);
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("\nPilha: " + pilha.pop() + pilha + " O livro foi retirado da pilha!");
				}
				break;

			case 0:
				System.out.println("Programa finalizado!");

			default:
				System.out.println("\nOpção inválida! Tente novamente.");
				break;
			}

		} while (menu != 0);

		scanner.close();
	}

}
