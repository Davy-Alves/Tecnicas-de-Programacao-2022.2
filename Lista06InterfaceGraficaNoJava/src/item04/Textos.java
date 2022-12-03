package item04;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;

import classesGlobais.PainelComTexto;

public class Textos extends JPanel{

	public Textos() {
		setLayout(new GridLayout(3, 1));
		
		PainelComTexto maior = new PainelComTexto("Maior >>>", null);
		maior.setFont(new Font("arial", Font.BOLD, 10));
		add(maior);
		
		PainelComTexto menor = new PainelComTexto("Menor >>>", null);
		menor.setFont(new Font("arial", Font.BOLD, 10));
		add(menor);
		
		PainelComTexto media = new PainelComTexto("Media >>>", null);
		media.setFont(new Font("arial", Font.BOLD, 10));
		add(media);
		
	}
}
