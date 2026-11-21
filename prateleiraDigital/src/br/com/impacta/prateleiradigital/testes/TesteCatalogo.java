package br.com.impacta.prateleiradigital.testes;

import java.util.List;
import java.util.Scanner;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class TesteCatalogo { 
    public static void main(String[] args) { 
    	
    	/*
    	 * 1 - Cadastrar Filme
    	 * 2 - Listar Filme
    	 * 3 - Atualizar Filme 
    	 * 4 - Excluir filme
    	 * 0 - Sair
    	 *
    	 */
    	
    	//Instanciar a classe Controller
    	FilmeController controller = new FilmeController();
    	
    	//try with resources para gerenciamento do Scanner 
    	try(
    		//Instanciar a classe Scanner
    		Scanner	scanner = new Scanner(System.in);
    		) {
    		
    		while(true) {
    			System.out.println("\n===PRATELEIRA DIGITAL===");
    			System.out.println("1 - Cadastrar Filme");
    			System.out.println("2 - Listar Filme");
    			System.out.println("3 - Atualizar Filme");
    			System.out.println("4 - Excluir Filme");
    			System.out.println("0 - Sair");
    			System.out.println("Escolha uma opção :");
    			
    			String opcao = scanner.nextLine().trim();
    			
    			switch (opcao) {
					case "1": {
						System.out.println("\n===CADASTRAR FILME===");
						Filme filme = new Filme();
						System.out.println("\nDigite o título do filme: ");
						filme.setTitulo(scanner.next());
						System.out.println("\nDigite os diretores do filme: ");
						filme.setDiretores(scanner.next());
						System.out.println("\nDigite a nota do filme: ");
						filme.setNota(Double.parseDouble(scanner.next()));
						System.out.println("\nDigite a duração do filme: ");
						filme.setDuracao(Integer.parseInt(scanner.next()));
						System.out.println("\nDigite o ano do filme: ");
						filme.setAno(Integer.parseInt(scanner.next()));
						System.out.println("\nDigite o genêro do filme: ");
						filme.setGeneros(scanner.next());
						System.out.println("\nDigite o número de votos do filme: ");
						filme.setNumVotos(Integer.parseInt(scanner.next()));
						System.out.println("\nDigite a URL do filme: ");
						filme.setUrl(scanner.next());
						
						if(controller.cadastroDeFilme(filme) == 1) {
							System.out.println("\n Filme cadastrado com SUCESSO!");
						}else {
							System.out.println("\n Ocorreu um erro no cadastro!");
						}
						
						break;
					}
					case "2": {
						System.out.println("\n===LISTA DE FILMES===");
						
						List<Filme> filmes = controller.listaDeFilmes();
						
						System.out.print("\n| ID | TÍTULO | DIRETORES | NOTA | DURAÇÃO | ANO | GENÊROS | Nr-VOTOS | WWW |");
						for(Filme f : filmes) {
							System.out.print(" [ "+ f.getId()		 +" ] ");
							System.out.print(f.getTitulo()	 );
							System.out.print(" | "+ f.getDiretores() );
							System.out.print(" | "+ f.getNota()		 );
							System.out.print(" | "+ f.getDuracao()	 );
							System.out.print(" | "+ f.getAno()		 );
							System.out.print(" | "+ f.getGeneros()	 );
							System.out.print(" | "+ f.getNumVotos()	 );
							System.out.print(" | "+ f.getUrl()		 +" | ");
							System.out.print("\n");
						}
						
						break;
					}
					case "3": {}
					case "4": {}
					case "0": {
						scanner.close();
						return;
					}
				default:
					
				}
    			
    		}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
        
    } 
} 