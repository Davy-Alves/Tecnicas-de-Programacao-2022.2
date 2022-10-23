package Main;

public class Goleiro {

	private int id;
	private String nome;
	private int velocidade;
	private int flexibilidade;
	private int agilidade;
	private int coordenacao;
	private int forca;
	private int equilibrio;
	
	public Goleiro(int id, String nome, int velocidade, int flexibilidade, int agilidade, int coordenacao, int forca,
			int equilibrio) {
		this.id = id;
		this.nome = nome;
		this.velocidade = velocidade;
		this.flexibilidade = flexibilidade;
		this.agilidade = agilidade;
		this.coordenacao = coordenacao;
		this.forca = forca;
		this.equilibrio = equilibrio;
	}

	public double CalculoAAG() {
		return ((velocidade * 3) + (flexibilidade *2) + (agilidade * 3) + (coordenacao * 2) + (forca)+ (equilibrio *2)) / 8;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getFlexibilidade() {
		return flexibilidade;
	}

	public void setFlexibilidade(int flexibilidade) {
		this.flexibilidade = flexibilidade;
	}

	public int getAgilidade() {
		return agilidade;
	}

	public void setAgilidade(int agilidade) {
		this.agilidade = agilidade;
	}

	public int getCoordenacao() {
		return coordenacao;
	}

	public void setCoordenacao(int coordenacao) {
		this.coordenacao = coordenacao;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getEquilibrio() {
		return equilibrio;
	}

	public void setEquilibrio(int equilibrio) {
		this.equilibrio = equilibrio;
	}

}
