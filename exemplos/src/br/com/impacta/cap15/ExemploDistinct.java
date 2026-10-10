package br.com.impacta.cap15;

import java.util.ArrayList;
import java.util.List;

public class ExemploDistinct {

    public static void main(String[] args) {

        List<Funcionario> lista = new ArrayList<>();

        lista.add(new Funcionario(3018, "Joaquim Batista", "Desenvolvedor", 5550.0));
        lista.add(new Funcionario(1045, "Maria das Dores", "Analista", 6250.0));
        lista.add(new Funcionario(1780, "João Ricardo",    "Office-Boy", 7100.0));
        lista.add(new Funcionario(5200, "Ana Maria",       "Faxineira", 4100.0));
        lista.add(new Funcionario(3999, "Robson Gusmão",   "Copeiro", 6500.0));
        lista.add(new Funcionario(2389, "Eduardo Alves",   "Desenvolvedor", 3200.0));

        lista.stream()
             .map(Funcionario::getCargo)
             .distinct()
             .forEach(System.out::println);
    }
}