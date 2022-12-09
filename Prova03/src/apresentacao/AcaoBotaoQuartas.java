package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Duelo;

public class AcaoBotaoQuartas implements ActionListener{

	private JTextField selecao;
	private JTextField jtxfplacar;
	private int placar;

	public AcaoBotaoQuartas(JTextField selecao, JTextField jtxfplacar) {
		this.selecao = selecao;
		this.jtxfplacar = jtxfplacar;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println(selecao.getText());
		placar = Integer.parseInt(jtxfplacar.getText());
		new Duelo(jtxfplacar);
	}

}
