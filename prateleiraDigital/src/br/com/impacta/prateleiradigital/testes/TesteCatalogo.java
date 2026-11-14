package br.com.impacta.prateleiradigital.testes; 
  
import java.sql.SQLException;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme; 
  
public class TesteCatalogo { 
    public static void main(String[] args) { 
        // A ordem dos argumentos acompanha o construtor da apostila. 
        Filme filme = new Filme("Matrix", "Wachowski Brothers", 
                9, 200, 1999, "Ficção", 3000, "http://www.enterthematrix.com"); 
        System.out.println(filme.getTitulo() + " (" + filme.getAno() + ")"); 
        
        FilmeController fc = new FilmeController();
        
        try {
			fc.cadastroDeFilme(filme);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        
        
        
        
        
        
    } 
} 