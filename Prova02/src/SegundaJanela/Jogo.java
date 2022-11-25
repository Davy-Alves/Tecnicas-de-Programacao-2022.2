package SegundaJanela;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

import ClassesAuxliares.Botao;
import ClassesAuxliares.Texto;
import PrimeiraJanela.AcaoBotao;
import PrimeiraJanela.Tela;

public class Jogo extends JFrame{

	public Jogo() {
		super("FIFA 22");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 500);
		setLocationRelativeTo(null);
		Organizador();
		setVisible(true);
		
	}
	
	public void Organizador() {
		setLayout(new BorderLayout());
		
		AreaGol areagol = new AreaGol();
		add(BorderLayout.CENTER, areagol);

		Botao primeiroBotao = new Botao("PROXIMO", Color.YELLOW, Color.BLACK);
		add(BorderLayout.NORTH, primeiroBotao);
		
		Botao segundoBotao = new Botao("FINALIZAR", Color.BLUE, Color.WHITE);
		AcaoFinalizar acao = new AcaoFinalizar();
		segundoBotao.addActionListener(acao);
		add(BorderLayout.SOUTH, segundoBotao);

	}
}
