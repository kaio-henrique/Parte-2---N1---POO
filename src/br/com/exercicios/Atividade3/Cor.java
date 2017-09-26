package br.com.exercicios.Atividade3;

public class Cor {
		
	public enum Olho{
		AZUL("Azuis"),
		VERDE("Verdes"),
		CASTANHO("Castanhos");
		
		private String descricao;
		
		private Olho(String descricao){
			this.descricao = descricao;
		}

		public String getDescricao() {
			return descricao;
		}
	}
	
	public enum Cabelo{	
		LOIRO("Loiros"),
		CASTANHO("Castanhos"),
		PRETO("Pretos");
		
		private String descricao;
		
		private Cabelo(String descricao){
			this.descricao = descricao;
		}

		public String getDescricao() {
			return descricao;
		}
	}
	
	
}
