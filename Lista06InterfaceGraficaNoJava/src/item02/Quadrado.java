package item02;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

import classesGlobais.PainelComTexto;
import item01.PainelBotoes;
import item01.PainelTrocaDeCor;

public class Quadrado extends JFrame {

	public Quadrado() {
		super("ITEM 02");
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(450, 400);
		setLocationRelativeTo(null);
		Organizador();
		setVisible(true);
	}
	
	public void Organizador() {
		setLayout(new GridLayout(2, 1));
		
		PainelComTexto painelcomtexto = new PainelComTexto("Texto", null);
		add(painelcomtexto);
		
		Botoes botoes = new Botoes(painelcomtexto.getTexto());
		add(botoes);
		
	}
}
