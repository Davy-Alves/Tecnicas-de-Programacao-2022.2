package ClassesAuxliares;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Texto extends JPanel {

	private JLabel texto;
	
	public Texto(String text, Color corFundo) {
		
		texto = new JLabel();
		texto.setFont(new Font("arial", Font.BOLD, 20));
		texto.setText(text);
		setBackground(corFundo);
		add(texto);
		
	}
}
