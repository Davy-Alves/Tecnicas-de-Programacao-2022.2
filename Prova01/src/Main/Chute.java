package Main;

public class Chute {

	private int id;
	private int forca;
	private int quadrante;
	private Posicao posicao;
	
	public Chute(int id, int forca, int quadrante, Posicao posicao) {

		this.id = id;
		this.forca = forca;
		this.quadrante = quadrante;
		this.posicao = posicao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getQuadrante() {
		return quadrante;
	}

	public void setQuadrante(int quadrante) {
		this.quadrante = quadrante;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
	
}
