package br.com.impacta.cap19;

import java.sql.*;

public class ExemploStatement {

    public static void main(String[] args) {
        
        try {

        	Connection cn = DriverManager.getConnection(
        						"jdbc:mysql://localhost:3306/impacta", "root", "root");
            
        	Statement st = cn.createStatement();
            
            st.executeUpdate("UPDATE alunos SET nome = 'Antonio' where codigo = 1");
            System.out.println("Alterado com sucesso!!!.");

            st.close();
            cn.close();
            System.out.println("Conexão encerrada.");
            
        } catch (SQLException e) {
            System.out.println("Falha ao realizar a operação.");
            e.printStackTrace();
        }
    }
}