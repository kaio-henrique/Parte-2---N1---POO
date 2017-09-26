package br.com.exercicios.Atividade1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		for(int i=0; i < 3; i++){
			Pessoa pessoa = new Pessoa();
			
			System.out.println("Nome: ");
			pessoa.setNome(in.next());
			
			System.out.println("Idade: ");
			pessoa.setIdade(in.nextInt());
			
			in.nextLine();
			
			listaPessoa.add(pessoa);
		}
		
		Pessoa nova, velha;
		nova = velha = listaPessoa.get(0);
		
		for(Pessoa pessoa:listaPessoa){
			if(pessoa.getIdade() > velha.getIdade()){
				velha = pessoa;
			}else if(pessoa.getIdade() < nova.getIdade()){
				nova = pessoa;
			}
		}
		
		System.out.print("Pessoa mais Velha: " + velha.getNome() + " - " + velha.getIdade() + "\n");
		System.out.print("Pessoa mais Nova: " + nova.getNome() + " - " + nova.getIdade());
		

	}

}
