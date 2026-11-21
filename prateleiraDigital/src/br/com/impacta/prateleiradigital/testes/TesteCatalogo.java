package br.com.impacta.prateleiradigital.testes; 
  
import java.sql.SQLException;
import java.util.List;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme; 
  
public class TesteCatalogo { 
    public static void main(String[] args) { 
        // A ordem dos argumentos acompanha o construtor da apostila. 
//        Filme filme = new Filme("Matrix-Reloaded", "Wachowski Brothers", 
//           9, 300, 2001, "Ficção", 5000, "http://www.enterthematrix.com"); 
//        System.out.println(filme.getTitulo() + " (" + filme.getAno() + ")"); 
//        
        FilmeController fc = new FilmeController();
        
        
        try {
        	
//        	fc.atualizaFilme(2, filme);
        	
//			fc.cadastroDeFilme(filme);
        	
        	
        	fc.excluirFilme(2);
        	
        	List<Filme> filmes =  fc.listaDeFilmes();
        	
        	for(Filme f : filmes) {
        		System.out.println(f.getTitulo() + " (" + f.getAno() + ")");
        	}
        	
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        
        
        
        
        
        
    } 
} 