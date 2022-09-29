package Main;

public class Cliente {

	private int id;
	private String nome;
	private String cpf;
	
	public Cliente(String cpf) {

		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id > 0) {
			this.id = id;
		}else {
			System.out.println("Id menor que zero");
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
		if(aux >= 3) {
			this.nome = nome;
		}else {
			System.out.println("Nome menor que 3 caracteres");
		}
	}

	public String getCpf() {
		return cpf;
	}	
	
	public void status() {
		
	 this.getId();
	}
}