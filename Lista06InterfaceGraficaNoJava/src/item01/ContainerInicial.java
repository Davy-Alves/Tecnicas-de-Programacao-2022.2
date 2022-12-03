package item01;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class ContainerInicial extends JFrame {

	public ContainerInicial() {
		super("ITEM 01");
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(400, 550);
		setLocationRelativeTo(null);
		Organizador();
		setVisible(true);
	}
	
	public void Organizador() {
		setLayout(new BorderLayout());
		
		PainelTrocaDeCor paineltrocardecor = new PainelTrocaDeCor();
		add(BorderLayout.CENTER, paineltrocardecor);
		
		PainelBotoes painelbotoes = new PainelBotoes(paineltrocardecor);
		add(BorderLayout.NORTH, painelbotoes);
	}
}
