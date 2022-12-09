package apresentacao;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

import negocio.Bolao;

public class PainelFuncionalidades extends JPanel {
	
	public PainelFuncionalidades() {
		setLayout(new FlowLayout());

		JButton cadastrarNovoBolao = new JButton();
		cadastrarNovoBolao.setText("Cadastrar novo Bolao");
		cadastrarNovoBolao.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		cadastrarNovoBolao.setPreferredSize(new Dimension(250, 28));
		cadastrarNovoBolao.addActionListener(new AcaoBotaoFuncionalidades(1));
		add(cadastrarNovoBolao);
		
		JButton mostrarboloescadastrados = new JButton();
		mostrarboloescadastrados.setText("Mostrar Boloes Cadastrados");
		mostrarboloescadastrados.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		mostrarboloescadastrados.setPreferredSize(new Dimension(250, 28));
		add(mostrarboloescadastrados);

		JButton importarboloes = new JButton();
		importarboloes.setText("Importar Boloes");
		importarboloes.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		importarboloes.setPreferredSize(new Dimension(250, 28));
		add(importarboloes);

		JButton exportarboloes = new JButton();
		exportarboloes.setText("Exportar Boloes");
		exportarboloes.setFont(new Font("arial", Font.ROMAN_BASELINE, 16));
		exportarboloes.setPreferredSize(new Dimension(250, 28));
		add(exportarboloes);
	}
}
