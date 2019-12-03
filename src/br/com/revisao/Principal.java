package br.com.revisao;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        IntegerSet teste = new IntegerSet();
        teste.getConjuntoClasse().add(10);
        teste.getConjuntoClasse().add(20);
        teste.getConjuntoClasse().add(30);

        //teste.adicionar(30);
        //teste.remover(10);

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(2);
        numeros.add(5);

        //teste.converter(teste.intersecao(numeros));
        //teste.converter(teste.diferente(numeros));
        teste.converter(teste.uniao(numeros));

        //teste.converter(teste.getConjuntoClasse());

        //teste.adicionar(50, teste.getConjuntoClasse());
        //teste.converter(teste.getConjuntoClasse());
    }
}
