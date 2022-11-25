package PrimeiraJanela;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JPanel{

	private JTextField caixaDeTexto;
	
	public Tela(Color corFundo, int quantidadeCaracteres) {
		setLayout(new FlowLayout());

		caixaDeTexto = new JTextField(quantidadeCaracteres);
		setBackground(corFundo);
		add(caixaDeTexto);
	}

	public JTextField getCaixaDeTexto() {
		return caixaDeTexto;
	}
	
	
}
