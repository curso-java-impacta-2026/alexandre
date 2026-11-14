package br.com.impacta.prateleiradigital.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private Connection con = null;
	
	public Conexao() {}
	
	public Connection getConnection() throws SQLException{
		
		String url 		= "jdbc:mysql://localhost:3306/imdb";
		String usuario 	= "root";
		String senha	= "impacta1";
		
		try {
			con = DriverManager.getConnection(url,usuario,senha);
			return con;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		 return con;
	
	}

}
