package chamada;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import classesGlobais.PainelComTexto;
import item01.PainelBotoes;
import item01.PainelTrocaDeCor;

public class ContainerEscolha extends JFrame {

	public ContainerEscolha() {
		super("LISTA 06");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(450, 200);
		setLocationRelativeTo(null);
		Organizador();
		setVisible(true);
	}
	
	public void Organizador() {
		setLayout(new BorderLayout());
		
		PainelComTexto texto = new PainelComTexto("SELECIONE O ITEM QUE DESEJA ABRIR", null);
		add(BorderLayout.NORTH, texto);
		
		PainelBotoesEscolhaDeItem escolha = new PainelBotoesEscolhaDeItem();
		add(BorderLayout.CENTER, escolha);
		
		
	}
}
