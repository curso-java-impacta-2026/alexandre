package laboratorios.impacta.cap16;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Cap16_Lab2 {
	
	private static final String PASTA_ORIGEM = "C:\\projetos\\IMPACTA\\JavaProgrammer\\Laboratórios\\Cap_16\\documentos";
	private static final String PASTA_BACKUP = "C:\\projetos\\IMPACTA\\JavaProgrammer\\Laboratórios\\Cap_16\\backup";

	public static void main(String[] args) {
		
		try {
			Path origem = Paths.get(PASTA_ORIGEM);
			Path backup = Paths.get(PASTA_BACKUP);
				
			
			if(Files.notExists(backup)) {
				Files.createDirectories(backup);
			}
			
			try (Stream<Path> streamOrigem = Files.list(origem)) {
				streamOrigem.forEach(p -> {
					try {
						Files.copy(p, backup.resolve(p.getFileName()));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		
		
		
		
	}
}
