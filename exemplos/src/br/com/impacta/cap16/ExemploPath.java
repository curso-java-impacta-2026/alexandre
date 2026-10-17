package br.com.impacta.cap16;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploPath {

    public static void main(String[] args) {
        
        Path poema = Paths.get("resources\\poema.txt");
        Path arquivo = Paths.get("resources\\poema.txt");
        Path novaPasta = Paths.get("resources\\textos\\rascunhos\\vazio");
        Path pasta = Paths.get("C:\\Meus Documentos\\Mp3");

        /* Exibe o caminho especificado pelo path. */
        System.out.println(poema);

        /* Exibe o caminho completo do path a partir da raiz. */
        System.out.println(poema.toAbsolutePath());

        /* Exibe apenas o nome do arquivo. */
        System.out.println(poema.getFileName());               

        /* Exibe o caminho completo do diretório pai. */
        System.out.println(poema.getParent().toAbsolutePath());
    }
}