package exerciciosCollection02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01Fila {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int menu;

		do {
			System.out.println("**************************************************");
			System.out.println("\n1 - Adicionar Cliente na fila");
			System.out.println("2 - listar todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - Sair");
			System.out.println();
			System.out.println("**************************************************");
			System.out.printf("Entre com a opção desejada: ");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.printf("Digite o nome: ");
				fila.add(scanner.next());
				for (String nome : fila) {
					System.out.println(nome);
				}
				System.out.println("\nCliente adicionado!");
				break;

			case 2:
				System.out.println("\nLista de clientes na fila: ");
				for (String nome : fila) {
					System.out.println(nome);
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("\nCliente removido: " + fila.remove());
				}
				for (String nome : fila) {
					System.out.println(nome);
				}
				break;

			case 0:
				System.out.println("\nO cliente foi chamado!");
				System.out.println("Programa finalizado!");
				break;

			default:
				System.out.println("\nOpção inválida! Tente novamente.");
				break;
			}
		} while (menu != 0);

		scanner.close();
	}

}
