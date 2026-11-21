package br.com.impacta.prateleiradigital.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

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
		
		
		public List<Filme> select() throws SQLException {
			
			String sql = "SELECT titulo,diretores,nota,duracao,ano,"
					+ "generos,numVotos,url FROM tb_filmes"
					+ " ORDER BY titulo";
			
			List<Filme> filmes = new ArrayList<Filme>();
			
			try(
					Connection con = conexao.getConnection();
					PreparedStatement ps = con.prepareStatement(sql);
					ResultSet rs = ps.executeQuery()
				){
				
				
				while (rs.next()) {
					Filme filme = new Filme(
						rs.getString("titulo"),
						rs.getString("diretores"),
						rs.getDouble("nota"),
						rs.getInt("duracao"),
						rs.getInt("ano"),
						rs.getString("generos"),
						rs.getInt("numVotos"),
						rs.getString("url")
					);
					
					filmes.add(filme);
				}
				
				return filmes;
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return null;
			
		}
		
		
		public int update(int id,Filme filme) throws SQLException {
			
			String sql = "UPDATE tb_filmes SET titulo = ?, "
					+ "diretores = ?, nota = ?, duracao = ?, ano = ?, "
					+ "generos = ?, numVotos = ?, url = ? WHERE id = ?";
			
			try(
					Connection con = conexao.getConnection();
					PreparedStatement ps = con.prepareStatement(sql)
				){
				
				ps.setString(1, filme.getTitulo());
				ps.setString(2, filme.getDiretores());
				ps.setDouble(3, filme.getNota());
				ps.setInt(4, filme.getDuracao());
				ps.setInt(5, filme.getAno());
				ps.setString(6, filme.getGeneros());
				ps.setInt(7, filme.getNumVotos());
				ps.setString(8, filme.getUrl());
				ps.setInt(9, id);
				
				return ps.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
				
			return 0;
		}
		
		public int delete(int id)throws SQLException {
			
			String sql = "DELETE FROM tb_filmes WHERE id = ?";
			
			try(
					Connection con = conexao.getConnection();
					PreparedStatement ps = con.prepareStatement(sql);
				) {
				
				ps.setInt(1, id);
				return ps.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return 0;
		}		
		
		
		
		
		
		
		
		
		
	
}
