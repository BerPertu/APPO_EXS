package Ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Digite seu nome: ");
			String nome = sc.nextLine();
			System.out.print("Digite sua idade:");
			int idade = sc.nextInt();
			System.out.println(nome);
			System.out.println(idade);
			sc.close();
		}
	}


