package aula2402;

import java.util.Scanner; //importa a biblioteca

public class App4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); //recebe input do teclado
		
		System.out.println("Digite seu nome:");
		String nome = sc.next();
		
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		
		System.out.println("Digite sua nota:");
		double nota = sc.nextDouble();
		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(nota);
	}

}
