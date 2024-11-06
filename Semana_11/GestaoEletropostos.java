package Semana_11;

import java.util.ArrayList;
import java.util.List;

public class GestaoEletropostos {
    private List<Eletropostos> listaEletropostos;

    public GestaoEletropostos() {
        this.listaEletropostos = new ArrayList<>();
    }

    public void adicionarEletropostos(Eletropostos eletropostos) {
        listaEletropostos.add(eletropostos);
        System.out.println("Eletroposto adicionado à lista: " + eletropostos.getId() + " no local: " + eletropostos.getLocal());
    }

    public boolean removerEletropostos(int id) {
        for (Eletropostos eletropostos : listaEletropostos) {
            if (eletropostos.getId() == id) {
                listaEletropostos.remove(eletropostos);
                System.out.println("Eletroposto removido da lista: " + eletropostos.getId() + " no local: " + eletropostos.getLocal());
                return true;
            }
        }
    System.out.println("Eletroposto com o ID: " + id + " não encontrado!");
    return false;
    }

    public void listarEletropostos() {
        if (listaEletropostos.isEmpty()) {
            System.out.println("Nenhum eletroposto na lista.");
        } else {
        System.out.println("Eletropostos presentes na lista: ");
        for (Eletropostos eletropostos : listaEletropostos){
            System.out.println("ID: " + eletropostos.getId() + " - Local: " + eletropostos.getLocal());
            }
        }
    }
}