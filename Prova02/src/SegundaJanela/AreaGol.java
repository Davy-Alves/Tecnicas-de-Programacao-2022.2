package SegundaJanela;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import ClassesAuxliares.Botao;

public class AreaGol extends JPanel{

	public AreaGol() {
		setLayout(new GridLayout(9,17));
				
		AcaoFinalizar acao = new AcaoFinalizar();
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 17; j++ ) {
				if(i == 1 && j > 0 && j < 16) {
					add(new Botao(null, Color.WHITE, null));
				}else if(i == 2 && j == 1 || i == 2 && j == 15){
					add(new Botao(null, Color.WHITE, null));
				}else if(i == 3 && j == 1 || i == 3 && j == 15){
					add(new Botao(null, Color.WHITE, null));
				}else if(i == 4 && j == 1 || i == 4 && j == 15){
					add(new Botao(null, Color.WHITE, null));
				}else if(i == 5 && j == 1 || i == 5 && j == 15){
					add(new Botao(null, Color.WHITE, null));
				}else if(i == 6 && j == 1 || i == 6 && j == 15){
					add(new Botao(null, Color.WHITE, null));
				}else if(i == 7 && j == 1 || i == 7 && j == 15){
					add(new Botao(null, Color.WHITE, null));
				}else if(i == 8 && j == 1 || i == 8 && j == 15){
					add(new Botao(null, Color.WHITE, null));
				}else if(i == 0 || j == 0 || j == 16){
					add(new Botao(null, Color.cyan, null));
				}else {
					add(new Botao(null, Color.GREEN, null));
				}
			}
		}
		
	
	}
}
