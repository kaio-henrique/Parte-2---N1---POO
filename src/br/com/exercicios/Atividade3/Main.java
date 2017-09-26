package br.com.exercicios.Atividade3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int idade = 0, maiorIdade = 0, opc = 0, countPorcentagem = 0, countPessoas = 0, porcentagemFeminina;
		String sexo = null, cabelo = null, olho = null;

		do{
			countPessoas++;
			
			System.out.println("Anos de Idade: ");
			idade = in.nextInt();
			
			System.out.println("Sexo: \n1- Masculino\n2- Feminino");
			opc = in.nextInt();
			switch(opc){
				case 1:
					sexo = Sexo.M.getDescricao();
					break;
				case 2:
					sexo = Sexo.F.getDescricao();
					break;
				default:
					System.out.println("Digite um valor válido!");
					break;
			}
			
			System.out.println("Cor do Cabelo: \n1- Loiro\n2- Castanho\n3- Preto");
			opc = in.nextInt();
			switch (opc) {
				case 1:
					cabelo = Cor.Cabelo.LOIRO.getDescricao();
					break;
				case 2:
					cabelo = Cor.Cabelo.CASTANHO.getDescricao();
					break;
				case 3:
					cabelo = Cor.Cabelo.PRETO.getDescricao();
					break;
				default:
					System.out.println("Digite um valor válido!");
					break;
			}
			
			System.out.println("Cor dos Olhos: \n1- Azul\n 2- Verde\n3- Castanho");
			opc = in.nextInt();
			switch (opc) {
				case 1:
					olho = Cor.Olho.AZUL.getDescricao();
					break;
				case 2:
					olho = Cor.Olho.VERDE.getDescricao();
					break;
				case 3:
					olho = Cor.Olho.CASTANHO.getDescricao();
					break;
				default:
					System.out.println("Digite um valor válido!");
					break;
			}
			
			if(idade > maiorIdade){
				maiorIdade = idade;
			}
			
			if(sexo.equals(Sexo.F.getDescricao()) && ((idade >= 18) && (idade <= 35)) && (olho.equals(Cor.Olho.VERDE.getDescricao())) && (cabelo.equals(Cor.Cabelo.LOIRO.getDescricao())) ){
				countPorcentagem++;
			}
			
		}while(idade != -1);
		
		porcentagemFeminina = (100*countPorcentagem)/countPessoas;
		System.out.println("Maior Idade: " + maiorIdade);
		System.out.println("Porcentagem de Mulheres com olhos verdes e cabelos loiros: " + porcentagemFeminina + "%");
	}

}
