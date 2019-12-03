package br.com.revisao;

import javax.swing.event.InternalFrameEvent;
import java.util.ArrayList;

public class IntegerSet {
    private ArrayList<Integer> conjuntoClasse =  new ArrayList<>(); //no máximo de 0 a 50

    public IntegerSet() {

    }

    public ArrayList<Integer> getConjuntoClasse() {
        return conjuntoClasse;
    }

    public void setConjuntoClasse(ArrayList<Integer> conjuntoClasse) {
        this.conjuntoClasse = conjuntoClasse;
    }

    public ArrayList<Integer> uniao (ArrayList<Integer> conjuntoParametro){
      ArrayList <Integer> adicionar = new ArrayList<>();

        adicionar.addAll(this.conjuntoClasse);
        adicionar.addAll(conjuntoParametro);

        return adicionar;

    }

    public ArrayList<Integer> intersecao (ArrayList<Integer> conjuntoParametro) {
        ArrayList <Integer> adicionar = new ArrayList<>();

        for (int i = 0; i < conjuntoParametro.size(); i++) {
            for (int i1 = 0; i1 < conjuntoClasse.size(); i1++) {
                if (conjuntoParametro.get(i).equals(this.conjuntoClasse.get(i1))){
                    adicionar.add(conjuntoParametro.get(i));
                }
            }

        }
        return adicionar;
    }


    public ArrayList<Integer> diferente (ArrayList<Integer> conjuntoParametro) {
        ArrayList <Integer> adicionar = new ArrayList<>();

        for (int i = 0; i < conjuntoParametro.size(); i++) {
            if(!conjuntoClasse.contains(conjuntoParametro.get(i)))
            adicionar.add(conjuntoParametro.get(i));
        }

//        for (int i = 0; i < conjuntoClasse.size(); i++) {
//            if(!conjuntoParametro.contains(conjuntoClasse.get(i)))
//            adicionar.add(conjuntoClasse.get(i));
//        }

       /* for (int i = 0; i < conjuntoClasse.size(); i++) {
            for (int i1 = 0; i1 < conjuntoParametro.size(); i1++) {
                if (conjuntoParametro.get(i1) != this.conjuntoClasse.get(i)){
                    adicionar.add(this.conjuntoClasse.get(i));
                }
            }

        }*/


        return adicionar;
    }

    public void adicionar (Integer valorParaAdicionar, ArrayList<Integer> conjuntoParametro){
        if (valorParaAdicionar >= 0 && valorParaAdicionar <= 50){
        conjuntoParametro.add(valorParaAdicionar);
        }

    }

    public void remover (Integer valorParaRemover, ArrayList<Integer> conjuntoParametro ){
        conjuntoParametro.remove(valorParaRemover);

    }

    public void converter (ArrayList<Integer> conjuntoParametro){
        System.out.println(conjuntoParametro.toString());
    }

}
