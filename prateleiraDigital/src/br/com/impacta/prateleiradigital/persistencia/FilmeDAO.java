package br.com.impacta.prateleiradigital.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import br.com.impacta.prateleiradigital.connection.Conexao;
import br.com.impacta.prateleiradigital.negocio.Filme;

/**
 * Representa a classe que realiza o procedimento de mapeamento objeto-relacional da classe Filme 
 */
public class FilmeDAO {
		
		private final Conexao conexao;
	
		
		public FilmeDAO() {
			this.conexao = new Conexao();
		}
	
		public int insert(Filme filme) throws SQLException{
			String sql = "INSERT INTO tb_filmes (titulo, diretores,nota,duracao,ano,generos,numVotos,url)"
					+ " VALUES(?,?,?,?,?,?,?,?)";
			
			try(Connection con = conexao.getConnection(); PreparedStatement ps = con.prepareStatement(sql) ) {
				
				ps.setString(1, filme.getTitulo());
				ps.setString(2, filme.getDiretores());
				ps.setDouble(3, filme.getNota());
				ps.setInt(4, filme.getDuracao());
				ps.setInt(5, filme.getAno());
				ps.setString(6, filme.getGeneros());
				ps.setInt(7, filme.getNumVotos());
				
				if(filme.getUrl() == null) {
					ps.setNull(8, Types.VARCHAR);
				}else {
					ps.setString(8, sql);
				}
				
				return ps.executeUpdate();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			return 0;
		
		}
		
	
}
