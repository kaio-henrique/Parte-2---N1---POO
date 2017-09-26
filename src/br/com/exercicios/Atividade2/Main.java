package br.com.exercicios.Atividade2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		double custoFab, custoCons;
		
		System.out.print("Digite o Custo de Fábrica do carro: ");
		custoFab = in.nextDouble();
		
		custoCons = custoFab + (custoFab * 0.28 * 0.45);
		
		System.out.println("Custo de Fábrica: " + custoFab
						 + "\nPorcentagem do Distribuidor: 28%"
						 + "\nImpostos: 45%"
						 + "\nValor do Custo ao Consumidor: " + custoCons);
		

	}

}
