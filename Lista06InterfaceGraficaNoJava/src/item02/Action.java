package item02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import classesGlobais.PainelComTexto;

public class Action implements ActionListener{

	private JLabel texto;
	private String textoBotao;
	
	public Action(JLabel texto, String textoBotao) {
		this.texto = texto;
		this.textoBotao = textoBotao;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		texto.setText(textoBotao);
		
	}

}
