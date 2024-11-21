package Semana_11;

import java.util.ArrayList;
import java.util.List;

// Classe que faz a gestão de viagem
public class GestaoViagem {
    protected List<Viagem> historicoViagens;
    // Construtor
    public GestaoViagem() {
        this.historicoViagens = new ArrayList<>();
    }

    // Método que registra a viagem no histórico
    public void registrarViagem(Viagem viagem) {
        historicoViagens.add(viagem);
        System.out.println("Viagem registrada com sucesso!");
    }

    // Método que lista as viagens registradas
    public void listarHistoricoViagens() {
        if (historicoViagens.isEmpty()) {
            System.out.println("Nenhuma viagem registrada.");
        } else {
            System.out.println("Histórico de Viagens:");
            for (Viagem viagem : historicoViagens) {
                viagem.listaHistoricoViagem();
            }
        }
    }
}