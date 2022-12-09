package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import negocio.Bolao;

public class BolaoDAO {

	public void inserir(Bolao b) {
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement inserir =
					 conexao.prepareStatement("insert into dadosbolao (nome, QFS1, QFS2) values (?, ?, ?)");
			inserir.setString(1, b.getNome());
			inserir.setString(2, b.getSelecao1Quartas());
			inserir.setString(3, b.getSelecao2Quartas());
			inserir.executeUpdate();
			
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Bolao> listar() {
		ArrayList<Bolao> aux = new ArrayList<Bolao>();
		try {
			Connection conexao = new Conexao().getConexao();

			ResultSet resultado = conexao.prepareStatement("select * from dadosbolao").executeQuery();

			Bolao bolao;
			while (resultado.next()) {
				bolao = new Bolao();
				bolao.setId(resultado.getInt("id"));
				bolao.setNome(resultado.getString("nome"));
				bolao.setSelecao1Quartas("Brasil");
				bolao.setSelecao2Quartas("Argentina");
				aux.add(bolao);
			}
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return aux;
	}

}
