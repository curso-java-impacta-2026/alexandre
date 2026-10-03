package laboratorios.impacta.cap14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaioresSalarios {

    public static void main(String[] args) {

        double[] salariosBrutos = { 1350.0, 4320.15, 8235.25, 2500.55, 1830.0, 850.26, 3614.29, 12500.0 };
        double[] salariosTop = DoubleArrayUtils.filtraValores(salariosBrutos, d -> d >= 3000);

        DoubleArrayUtils.processaValores(salariosTop, d -> System.out.println(d));
        
        	
        Scanner sc = new Scanner(System.in);
        
        List<String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add(1, "JavaScript");
        linguagens.add("Java");
        System.out.println(linguagens);
        System.out.println(linguagens.get(1));  
        
        linguagens.add("C#");
        System.out.println(linguagens);
        linguagens.set(1, "Ruby");
        System.out.println(linguagens);
        
        linguagens.remove(0);
        System.out.println(linguagens);
        
        System.out.println("Digite o elemento da busca!");
        int indice = linguagens.indexOf(sc.nextLine());
        linguagens.remove(indice);
        System.out.println(linguagens);
        
        
        
        
        
        
        
        
        
    }
}