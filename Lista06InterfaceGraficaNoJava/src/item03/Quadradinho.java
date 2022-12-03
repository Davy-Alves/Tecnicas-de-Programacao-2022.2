package item03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

import classesGlobais.Botao;
import classesGlobais.PainelComTexto;
import classesGlobais.Tela;

public class Quadradinho extends JFrame {

	public Quadradinho() {
		super("Item03");
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(450, 125);
		setLocationRelativeTo(null);
		Organizador();
		setVisible(true);
		
	}
	
	public void Organizador() {
		setLayout(new FlowLayout());
		
		Tela tela = new Tela(null, 15);
		add(tela);
		
		Botao botao = new Botao("ENVIAR", null, null);
		AcaoBo acaobotao = new AcaoBo(tela.getCaixaDeTexto());
		botao.addActionListener(acaobotao);
		add(botao);

		
	}
}
