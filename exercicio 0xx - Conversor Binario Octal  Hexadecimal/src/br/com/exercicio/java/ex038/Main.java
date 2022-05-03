package br.com.exercicio.java.ex038;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escreva um programa em que leia um número inteiro qualquer e peça para o usuário escolher qual será a base de conversão: 1 para binário, 2 para octal e 3 para hexadecimal.");

		byte escolha;
		int numero, binario;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor digite um número para a conversão: ");
		numero = entrada.nextInt();
		
		System.out.println("Por favor escolha uma opção para a conversão:");
		System.out.println("1 - BINÁRIO");
		System.out.println("1 - OCTAL");
		System.out.println("1 - HEXADECIMAL");
		escolha = entrada.nextByte();
		
		if (escolha == 1) {
			binario = toBinaryString(numero);
			System.out.println(numero+" em binario é "+binario);
		} else if (escolha == 2) {
			
		} else if (escolha == 3) {
			
		} else {
			System.out.println("Por favor escolha uma opção valida.");
		}
		
	}



}
