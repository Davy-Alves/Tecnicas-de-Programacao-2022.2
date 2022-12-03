package chamada;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

import classesGlobais.Botao;
import item01.AcaoBotao;
import item01.ContainerInicial;

public class PainelBotoesEscolhaDeItem extends JPanel {

	public  PainelBotoesEscolhaDeItem() {
		setLayout(new FlowLayout());
		
		Botao item01 = new Botao("ITEM 01", null, null);
		item01.addActionListener(new Acao(1));
		add(item01);
		
		Botao item02 = new Botao("ITEM 02", null, null);
		item02.addActionListener(new Acao(2));
		add(item02);
		
		Botao item03 = new Botao("ITEM 03", null, null);
		item03.addActionListener(new Acao(3));
		add(item03);
		
		Botao item04 = new Botao("ITEM 04", null, null);
		item04.addActionListener(new Acao(4));
		add(item04);
		
		Botao item05 = new Botao("ITEM 05", null, null);
		add(item05);
	
		Botao item06 = new Botao("ITEM 06", null, null);
		add(item06);
		
	}
}
