package br.com.impacta.cap19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexaoJDBC {
	static String url = "jdbc:mysql://localhost:3306/impacta";
	static String user = "root";
	static String password = "root";

	public static void main(String[] args) {
		openDB();
	}

	public static void openDB() {
		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("Select * from alunos");) {
			System.out.println("\nConexão estabelecida com sucesso!\n");

		} catch (SQLException e) {
			System.out.println("\nNão foi possível estabelecer conexão" + e
					+ "\n");
			System.exit(1);
		}
	}

}