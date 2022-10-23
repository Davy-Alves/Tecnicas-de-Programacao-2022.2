package Main;

public class Posicao {

	private int posicaoX;
	private int posicaoY;
	private int quadrante;
	
	//construtor passa pelo metodo set para validar
	public Posicao(int posicaoX, int posicaoY) {
		this.setPosicaoX(posicaoX);
		this.setPosicaoY(posicaoY);
	}
	
	public int getPosicaoX() {
		return posicaoX;
	}
	//set PosicaoX verifica se o numero varia de 0 a 16
	public void setPosicaoX(int posicaoX) {
		if(posicaoX >= 0 && posicaoX <= 16) {
			this.posicaoX = posicaoX;
		}
	}
	public int getPosicaoY() {
		return posicaoY;
	}
	//set PosicaoY verifica se o numero varia de 0 a 8
	public void setPosicaoY(int posicaoY) {
		if(posicaoY >= 0 && posicaoY <= 8) {
			this.posicaoY = posicaoY;
		}
	}
	public int getQuadrante() {
		return quadrante;
	}
	public void setQuadrante(int quadrante) {
		this.quadrante = quadrante;
	}
	 
	
}
