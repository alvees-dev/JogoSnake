package br.com.magna.service.users;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.magna.service.jogo.Jogo;

public class InterfaceUsuario {

	public static Integer opcoes;
	Scanner scan = new Scanner(System.in);

	public void boasVindas() {

		System.out.println("Seja bem vindo ao Snake Game");
		System.out.println("----------------------------\n");
		System.out.println("Digite a opção desejada");
		System.out.println("1. Jogar");
		System.out.println("2. Sair");

		opcoes = scan.nextInt();

		try {
			if (opcoes == 1) {

			} else if (opcoes == 2) {
				System.out.println("Até logo!");
				System.exit(0);
			} else if (opcoes <= 0 || opcoes >= 3) {
				System.out.println("Opção digitada não existe");
			}
		} catch (InputMismatchException e) {
			scan.next();
			System.out.println("Digito inválido");
		}
	}

	public void tutorial() {

		System.out.println("------ Tutorial ------");
		System.out.println("----------------------\n");
		System.out.println("O jogo consiste em um caractere que se move pelo tabuleiro");
		System.out.println("Você pode mover o caractere pelas setas do teclado");
		System.out.println("Caso o caractere bata na margem ou em alguma letra, o jogo será encerrado.\n");

		System.out.println(
				"Obs: Ao iniciar o jogo será iniciado uma tela branca. clique nela para conseguir movimentar o caractere.");

	}

	public void opcaoJogar() {

		System.out.println("Digite a opção desejada");
		System.out.println("1. Jogar");
		System.out.println("2. Sair");

		opcoes = scan.nextInt();

		try {
			if (opcoes == 1) {

			} else if (opcoes == 2) {
				System.out.println("Até logo!");
				System.exit(0);
			} else if (opcoes <= 0 || opcoes >= 3) {
				System.out.println("Opção digitada não existe");
			}
		} catch (InputMismatchException e) {
			scan.next();
			System.out.println("Digito inválido");
		}
	}
	
	public void contagemParaJogar() {
		
		try {
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void jogar() {
		
		boasVindas();
		tutorial();
		opcaoJogar();
		contagemParaJogar();
		Jogo jogo = new Jogo();
        jogo.iniciar();

	}
}
