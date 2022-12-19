package apresentacao;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;


public class PainelFuncionalidades extends JPanel {
	
	public PainelFuncionalidades() {
		setLayout(new FlowLayout());

		JButton cadastrarnovocompromisso = new JButton();
		cadastrarnovocompromisso.setText("Cadastrar Novo Compromisso");
		cadastrarnovocompromisso.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		cadastrarnovocompromisso.setPreferredSize(new Dimension(250, 28));
		cadastrarnovocompromisso.addActionListener(new AcaoBotaoFuncionalidades(1));
		add(cadastrarnovocompromisso);
		
		JButton compromissoscadastrados = new JButton();
		compromissoscadastrados.setText("Compromissos Cadastrados");
		compromissoscadastrados.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		compromissoscadastrados.setPreferredSize(new Dimension(250, 28));
		compromissoscadastrados.addActionListener(new AcaoBotaoFuncionalidades(2));
		add(compromissoscadastrados);
		
		JButton compromissospordata = new JButton();
		compromissospordata.setText("Compromissos por Data");
		compromissospordata.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		compromissospordata.setPreferredSize(new Dimension(250, 28));
		add(compromissospordata);

		JButton importarcompromissos = new JButton();
		importarcompromissos.setText("Importar Compromissos");
		importarcompromissos.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		importarcompromissos.setPreferredSize(new Dimension(250, 28));
		add(importarcompromissos);

		JButton exportarcompromissos = new JButton();
		exportarcompromissos.setText("Exportar Compromissos");
		exportarcompromissos.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		exportarcompromissos.setPreferredSize(new Dimension(250, 28));
		add(exportarcompromissos);
	}
}
