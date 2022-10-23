package Main;

import java.util.ArrayList;

public class Gol {

	private ArrayList<Posicao> listaPosicao;

	public void incializarPosicao() {
		for(int x = 0; x > 16; x++) {
			for(int y = 0; y > 8; y++) {
				Posicao p = new Posicao(x, y);
				listaPosicao.add(p);
			}
		}
	}
	public ArrayList<Posicao> getListaPosicao() {
		return listaPosicao;
	}

	public void setListaPosicao(ArrayList<Posicao> listaPosicao) {
		this.listaPosicao = listaPosicao;
	}
	
	
	
}
