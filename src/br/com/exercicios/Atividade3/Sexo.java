package br.com.exercicios.Atividade3;

public enum Sexo{
	M("Masculino"),
	F("Feminino");
	
	private String descricao;
	
	private Sexo(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}