package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import negocio.Passagem;


public class AcaoBotaoCompromissos implements ActionListener{

	private JTextField CQED1;
	private JTextField CQED2;
	private JTextField CQED3;
	private JTextField CQED4;
	private JTextField CQED5;
	private JTextField CQED6;
	private JTextField CQED7;
	private JTextField CQED8;
	private JTextField CQED9;
	private JTextField CQED10;
	private JTextField CQED11;
	private JTextField CQED12;
	
	private String data;
	private String compromisso;

	public AcaoBotaoCompromissos(String data, JTextField CQED1, JTextField CQED2, 
			JTextField CQED3, JTextField CQED4, JTextField CQED5, JTextField CQED6,
			JTextField CQED7, JTextField CQED8, JTextField CQED9, JTextField CQED10,
			JTextField CQED11, JTextField CQED12) {
		this.data = data;
		this.CQED1 = CQED1;
		this.CQED2 = CQED2;
		this.CQED3 = CQED3;
		this.CQED4 = CQED4;
		this.CQED5 = CQED5;
		this.CQED6 = CQED6;
		this.CQED7 = CQED7;
		this.CQED8 = CQED8;
		this.CQED9 = CQED9;
		this.CQED10 = CQED10;
		this.CQED11 = CQED11;
		this.CQED12 = CQED12;

	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		new Passagem(data, CQED1.getText(),  CQED2.getText(),  CQED3.getText(), CQED4.getText(),
				CQED5.getText(), CQED6.getText(), CQED7.getText(), CQED8.getText(), CQED9.getText(),
				CQED10.getText(), CQED11.getText(), CQED12.getText());
	}

}
