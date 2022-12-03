package classesGlobais;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JPanel{

	private JTextField caixaDeTexto;
	private String string;
	
	public Tela(Color corFundo, int quantidadeCaracteres) {
		setLayout(new FlowLayout());

		caixaDeTexto = new JTextField(quantidadeCaracteres);
		this.string = caixaDeTexto.getText();
		setBackground(corFundo);
		add(caixaDeTexto);
	}

	public JTextField getCaixaDeTexto() {
		return caixaDeTexto;
	}

	public String getString() {
		return string;
	}
	
	
	
}
