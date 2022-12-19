package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import negocio.Agenda;

public class AgendaDAO {

	public void inserir(Agenda a) {
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement inserir =
					 conexao.prepareStatement("insert into dadosagenda2 (data, h7, h8, h9, h10, h11, h12, h13,"
					 		+ "h14, h15, h16, h17, h18"
					 		+ ") "
					 		+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			inserir.setString(1, a.getData());
			inserir.setString(2, a.getH7());
			inserir.setString(3, a.getH8());
			inserir.setString(4, a.getH9());
			inserir.setString(5, a.getH10());
			inserir.setString(6, a.getH11());
			inserir.setString(7, a.getH12());
			inserir.setString(8, a.getH13());
			inserir.setString(9, a.getH14());
			inserir.setString(10, a.getH15());
			inserir.setString(11, a.getH16());
			inserir.setString(12, a.getH17());
			inserir.setString(13, a.getH18());
			inserir.executeUpdate();
			
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Agenda> listar() {
		ArrayList<Agenda> aux = new ArrayList<Agenda>();
		try {
			Connection conexao = new Conexao().getConexao();

			ResultSet resultado = conexao.prepareStatement("select * from dadosagenda2").executeQuery();

			Agenda agenda;
			while (resultado.next()) {
				agenda = new Agenda();
				agenda.setData(resultado.getString("data"));
				agenda.setH7(resultado.getString("h7"));
				agenda.setH8(resultado.getString("h8"));
				agenda.setH9(resultado.getString("h9"));
				agenda.setH10(resultado.getString("h10"));
				agenda.setH11(resultado.getString("h11"));
				agenda.setH12(resultado.getString("h12"));
				agenda.setH13(resultado.getString("h13"));
				agenda.setH14(resultado.getString("h14"));
				agenda.setH15(resultado.getString("h15"));
				agenda.setH16(resultado.getString("h16"));
				agenda.setH17(resultado.getString("h17"));
				agenda.setH18(resultado.getString("h18"));
				aux.add(agenda);
			}
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return aux;
	}

}
