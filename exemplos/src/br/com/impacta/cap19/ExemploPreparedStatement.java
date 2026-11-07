package br.com.impacta.cap19;

import java.sql.*;

public class ExemploPreparedStatement {

    public static void main(String[] args) {
        
        try {
            Connection cn = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/impacta", "root", "root");

            PreparedStatement ps = cn.prepareStatement(
            		"INSERT INTO alunos VALUES (?, ?, ?)");
            
            ps.setInt(1, 4);
            ps.setString(2, "Antonio das Alfaces");
            ps.setString(3, "(12)9 99665544");
            int retorno = ps.executeUpdate();

            if(retorno == 1) {
            	System.out.println("Aluno cadastrado com sucesso.");
            	System.out.println("Retorno do método : " + retorno);
            }
            ps.close();
            cn.close();
            System.out.println("Conexão encerrada.");
            
        } catch (SQLException e) {
            System.out.println("Falha ao realizar a operação.");
            e.printStackTrace();
        }
    }
}
