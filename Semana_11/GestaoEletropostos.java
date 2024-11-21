package Semana_11;

import java.util.ArrayList;
import java.util.List;

// Classe que faz a gestão dos eletropostos 
public class GestaoEletropostos {
    protected List<Eletropostos> listaEletropostos;

    public GestaoEletropostos() {
        this.listaEletropostos = new ArrayList<>();
    }

    // Método para adicionar um eletroposto à lista
    public void adicionarEletropostos(Eletropostos eletropostos) {
        listaEletropostos.add(eletropostos);
        System.out.println("Eletroposto adicionado à lista: " + eletropostos.getId() + " no local: " + eletropostos.getLocal() + " no KM: " + eletropostos.getPosicaoKm());
    }

    // Método para remover  um eletroposto da lista
    public boolean removerEletropostos(int id) {
        for (Eletropostos eletropostos : listaEletropostos) {
            if (eletropostos.getId() == id) {
                listaEletropostos.remove(eletropostos);
                System.out.println("Eletroposto removido da lista: " + eletropostos.getId() + " no local: " + eletropostos.getLocal() + " no KM: " + eletropostos.getPosicaoKm());
                return true;
            }
        }
    System.out.println("Eletroposto com o ID: " + id + " não encontrado!");
    return false;
    }

    // Método para listar os eletropostos da lista
    public void listarEletropostos() {
        if (listaEletropostos.isEmpty()) {
            System.out.println("Nenhum eletroposto na lista.");
        } else {
        System.out.println("Eletropostos presentes na lista: ");
        for (Eletropostos eletropostos : listaEletropostos){
            System.out.println("ID: " + eletropostos.getId() + " - Local: " + eletropostos.getLocal() + " no KM: " + eletropostos.getPosicaoKm());
            }
        }
    }
}