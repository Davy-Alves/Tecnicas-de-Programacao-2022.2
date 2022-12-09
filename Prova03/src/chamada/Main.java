package chamada;

import apresentacao.FrameFuncionalidades;
import negocio.Aluno;
import negocio.Bolao;
import persistencia.BolaoDAO;

public class Main {

	public static void main(String[] args) {
		
//		FrameFuncionalidades funcionalidades = new FrameFuncionalidades();
		
		BolaoDAO bolao = new BolaoDAO();
	
		Bolao bo = new Bolao();
		bo.setNome("Davy");
		bo.setSelecao1Quartas("Brasil");
		bo.setSelecao2Quartas("Argentina");

		
		bolao.inserir(bo);
		
		
		for (Bolao b : bolao.listar()) {
			System.out.println(b.getId() + " -  "+ b.getNome() + " - "+ b.getSelecao1Quartas()
			 + " - "+ b.getSelecao2Quartas());
			
		}
		 
		
	}

}
