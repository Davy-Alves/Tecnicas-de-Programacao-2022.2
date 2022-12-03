package item02;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import classesGlobais.Botao;
import classesGlobais.PainelComTexto;

public class Botoes extends JPanel {

	public Botoes(JLabel texto) {
		setLayout(new GridLayout(2,3));
		
		Botao java = new Botao("Java" , null , null);
		java.addActionListener(new Action(texto, java.getText()));
		add(java);
		
		Botao javascript = new Botao("JavaScript" , null , null);
		javascript.addActionListener(new Action(texto, javascript.getText()));
		add(javascript);

		Botao python = new Botao("Python" , null , null);
		python.addActionListener(new Action(texto, python.getText()));
		add(python);

		Botao cmaismais = new Botao("C++" , null , null);
		cmaismais.addActionListener(new Action(texto, cmaismais.getText()));
		add(cmaismais);

		Botao cjogodavelha = new Botao("C#" , null , null);
		cjogodavelha.addActionListener(new Action(texto, cjogodavelha.getText()));
		add(cjogodavelha);

		Botao c = new Botao("C" , null , null);
		c.addActionListener(new Action(texto, c.getText()));
		add(c);

	}
}
