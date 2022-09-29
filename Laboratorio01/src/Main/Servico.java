package Main;

public class Servico {
	
	private int id;
	private String nome;
	private double valor;
	private String descricao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id > 0) {
			this.id = id;
		}else {
			System.out.println("Id menor igual a zero");
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		int aux = 0;
		for(int i = 0; i < nome.length(); i++) {
			aux++; 
		}
		if(aux >= 5) {
			this.nome = nome;
		}else {
			System.out.println("Nome menor que 5 caracteres");
		}
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if(id >= 0) {
			this.valor = valor;
		}else {
			System.out.println("Id menor que zero");
		}
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		int aux = 0;
		for(int i = 0; i < descricao.length(); i++) {
			aux++; 
		}
		if(aux >= 10) {
			this.descricao = descricao;
		}else {
			System.out.println("Descricao menor que 10 caracteres");
		}
	}
}
