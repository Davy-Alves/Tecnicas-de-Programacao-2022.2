package SegundaJanela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import TerceiraJanela.Relatorio;

public class AcaoFinalizar implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		new Relatorio();
	}

}
