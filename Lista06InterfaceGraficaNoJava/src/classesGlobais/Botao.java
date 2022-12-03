package classesGlobais;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Botao extends JButton{
	
	public Botao(String text, Color corFundo, Color corSimbolo) {
		setText(text);
		setBackground(corFundo);
		setForeground(corSimbolo);
		setFont(new Font("arial", Font.BOLD, 20));
	}
	
}
