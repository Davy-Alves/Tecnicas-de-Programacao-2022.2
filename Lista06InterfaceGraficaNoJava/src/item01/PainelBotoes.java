package item01;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import classesGlobais.Botao;

public class PainelBotoes extends JPanel {

	private PainelTrocaDeCor paineltrocardecor;
	
	public PainelBotoes(PainelTrocaDeCor paineltrocadecor) {
		setLayout(new FlowLayout());
		
		this.paineltrocardecor = paineltrocadecor;
		
		Botao amarelo = new Botao("Amarelo", Color.YELLOW, Color.WHITE);
		amarelo.addActionListener(new AcaoBotao(amarelo.getBackground(), paineltrocardecor));
		add(amarelo);
		
		Botao verde = new Botao("Verde", Color.GREEN, Color.WHITE);
		verde.addActionListener(new AcaoBotao(verde.getBackground(), paineltrocardecor));
		add(verde);
		
		Botao azul = new Botao("Azul", Color.BLUE, Color.WHITE);
		azul.addActionListener(new AcaoBotao(azul.getBackground(), paineltrocardecor));
		add(azul);
		
	}
	
}
