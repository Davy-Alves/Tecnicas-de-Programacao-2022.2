package item04;

import java.awt.GridLayout;

import javax.swing.JPanel;

import classesGlobais.Tela;

public class Telas extends JPanel {

	public Telas() {
		setLayout(new GridLayout(3, 1));
		
		Tela tela1 = new Tela(null, 15);
		add(tela1);
		
		Tela tela2 = new Tela(null, 15);
		add(tela2);
		
		Tela tela3 = new Tela(null, 15);
		add(tela3);
		
	}
}
