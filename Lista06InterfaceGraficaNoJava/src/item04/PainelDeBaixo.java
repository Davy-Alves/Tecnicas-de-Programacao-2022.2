package item04;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;

import classesGlobais.Botao;

public class PainelDeBaixo extends JPanel{

	public PainelDeBaixo() {
		setLayout(new FlowLayout());
		
		Textos textos = new Textos();
		add(textos);
		
		Telas telas = new Telas();
		add(telas);
		
		Botao botao = new Botao("Exibir", null, null);
		botao.setFont(new Font("arial", Font.BOLD, 15));
		add(botao);
	}
}
