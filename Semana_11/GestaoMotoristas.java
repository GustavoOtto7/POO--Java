package Semana_11;

import java.util.ArrayList;
import java.util.List;

// Classe que faz a gestão dos motoristas
public class GestaoMotoristas {
    protected List<Motorista> listaMotoristas;

    public GestaoMotoristas() {
        this.listaMotoristas = new ArrayList<>();
    }

    // Método para adicionar um motorista à lista
    public void adicionarMotorista(Motorista motorista) {
        listaMotoristas.add(motorista);
        System.out.println("Motorista adicionado à lista: " + motorista.getNome() + " com o ID: " + motorista.getId());
    }

    // Método para remover um motorista da lista
    public boolean removerMotorista(int id) {
        for (Motorista motorista : listaMotoristas) {
            if (motorista.getId() == id) {
                listaMotoristas.remove(motorista);
                System.out.println("Motorista removido da lista: " + motorista.getNome() + " com o ID: " + motorista.getId());
                return true;
            }
        }
        System.out.println("Motorista com o ID: " + id + " não encontrado.");
        return false;
    }

    // Método para listar os motoristas da lista
    public void listarMotoristas() {
        if (listaMotoristas.isEmpty()) {
            System.out.println("Nenhum motorista na lista.");
        } else {
            System.out.println("Motoristas presentes na lista: ");
            for (Motorista motorista : listaMotoristas) {
                System.out.println("ID: " + motorista.getId() + " - Nome: " + motorista.getNome());
            }
        }
    }
}