package PrimeiraJanela;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import ClassesAuxliares.Botao;
import ClassesAuxliares.Texto;

public class Menu extends JFrame{

	public Menu() {
		super("FIFA 22");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 350);
		setLocationRelativeTo(null);
		Organizador();
		setVisible(true);
		
	}
	
	public void Organizador() {
		setLayout(new BorderLayout());

		Texto texto = new Texto("INSIRA SEU NOME", Color.YELLOW);
		add(BorderLayout.NORTH, texto);
		
		Tela tela = new Tela(Color.GREEN, 20);
		add(BorderLayout.CENTER, tela);
		
		Botao botao = new Botao("INICIAR", Color.BLUE, Color.WHITE);
		AcaoBotao acaobotao = new AcaoBotao(tela.getCaixaDeTexto());
		botao.addActionListener(acaobotao);
		add(BorderLayout.SOUTH, botao);
		
	}
}
