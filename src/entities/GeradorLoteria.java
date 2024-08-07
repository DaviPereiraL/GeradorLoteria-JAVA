package entities;


import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class GeradorLoteria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de números que serão apostados: ");
		int quantidadeNumeros = scanner.nextInt();

		
		System.out.print("Digite a quantidade de números na tabela: ");
		int quantidadeTabela = scanner.nextInt();

		
		System.out.print("Digite a quantidade de apostas que você quer fazer: ");
		int quantidadeApostas = scanner.nextInt();

		for (int i = 0; i < quantidadeApostas; i++) {
			Set<Integer> aposta = gerarAposta(quantidadeNumeros, quantidadeTabela);
			System.out.println("Aposta " + (i + 1) + ": " + aposta);
		}

		scanner.close();
	}

	
	private static Set<Integer> gerarAposta(int quantidadeNumeros, int quantidadeTabela) {
		Set<Integer> aposta = new HashSet<>();
		Random random = new Random();

		
		while (aposta.size() < quantidadeNumeros) {
			int numero = random.nextInt(quantidadeTabela) + 1; 
			aposta.add(numero); 
		}

		return aposta;
	}
}
