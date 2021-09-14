package br.dio.calc;

import java.util.Scanner;

public class Calculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("Digite O Primeiro Valor:");
		a = Integer.parseInt(scan.next());
		System.out.println("Digite O Segundo Valor:");
		b = Integer.parseInt(scan.next());

		int soma = soma(a, b);
		System.out.println(soma);
		int subtracao = subtracao(a, b);
		System.out.println(subtracao);
		int multiplicacao = multiplicacao(a, b);
		System.out.println(multiplicacao);
		int divisao = divisao(a, b);
		System.out.println(divisao);
	}

	public static int soma(int a, int b) {
		System.out.println("Soma: ");
		return (a + b);
	}

	public static int subtracao(int a, int b) {
		System.out.println("Subtração: ");
		return a - b;
	}

	public static int multiplicacao(int a, int b) {
		System.out.println("Multiplicação: ");
		return a * b;
	}

	public static int divisao(int a, int b) {
		System.out.println("Divisão: ");
		return a / b;
	}
}
