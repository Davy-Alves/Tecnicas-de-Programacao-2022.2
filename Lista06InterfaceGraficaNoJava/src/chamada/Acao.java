package chamada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import item01.ContainerInicial;
import item02.Quadrado;
import item03.Quadradinho;
import item04.Quadro;

public class Acao implements ActionListener{

	private int numero;
	
	public Acao(int numero) {
		this.numero = numero;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(numero == 1) {
			new ContainerInicial();
		}else if(numero == 2) {
			new Quadrado();
		}else if(numero == 3) {
			new Quadradinho();
		}else if(numero == 4) {
			new Quadro();
		}
	}

}
