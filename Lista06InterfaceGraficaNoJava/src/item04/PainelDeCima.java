package item04;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;

import classesGlobais.Botao;
import classesGlobais.PainelComTexto;
import classesGlobais.Tela;

public class PainelDeCima extends JPanel {

	public PainelDeCima() {
		setLayout(new FlowLayout());
		
		PainelComTexto painelcomtexto = new PainelComTexto("Digite o seu numero: ", null);
		painelcomtexto.setFont(new Font("arial", Font.BOLD, 10));
		add(painelcomtexto);
		
		Tela tela = new Tela(null, 30);
		add(tela);

		ArrayList<Integer> arrayDeNumeros = new ArrayList<Integer>();
	
		
		Botao botao = new Botao("OK", null, null);
		botao.setFont(new Font("arial", Font.BOLD, 15));
		ActionOK actionok = new ActionOK(arrayDeNumeros, tela.getCaixaDeTexto());
		botao.addActionListener(actionok);
		actionok.getArrayDeNumeros();
		add(botao);

		
	}
}
