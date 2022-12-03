package item04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

import classesGlobais.Botao;
import classesGlobais.PainelComTexto;
import classesGlobais.Tela;

public class Quadro extends JFrame {

	public Quadro() {
		super("Item03");
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(450, 300);
		setLocationRelativeTo(null);
		Organizador();
		setVisible(true);
		
	}
	
	public void Organizador() {
		setLayout(new GridLayout(2, 1));
				
		PainelDeCima paineldecima = new PainelDeCima();
		add(paineldecima);
	
		
		PainelDeBaixo paineldebaixo = new PainelDeBaixo();
		add(paineldebaixo);


	}
}
