package TerceiraJanela;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import ClassesAuxliares.Texto;

public class Relatorio extends JFrame {

	public Relatorio() {
		super("FIFA 22");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200, 700);
		setLocationRelativeTo(null);
		Organizador();
		setVisible(true);
	}
	
	public void Organizador() {
		setLayout(new GridLayout(4, 1));
		
		Texto relatorio = new Texto("RELATORIO", Color.GREEN);
		add(relatorio);
		
		Texto gol = new Texto("Chutes dentro: 0", Color.BLUE);
		add(gol);
		
		Texto trave = new Texto("Chutes trave: 0", Color.YELLOW);
		add(trave);
		
		Texto fora = new Texto("Chutes fora: 0", Color.GREEN);
		add(fora);
	}
}
