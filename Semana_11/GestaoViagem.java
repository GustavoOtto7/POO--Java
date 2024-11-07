package Semana_11;

import java.util.ArrayList;
import java.util.List;

public class GestaoViagem {
    private List<Viagem> historicoViagens;  

    public GestaoViagem() {
        this.historicoViagens = new ArrayList<>();
    }
    
    // Registrar uma nova viagem no histórico
    public void registrarViagem(Viagem viagem) {
        historicoViagens.add(viagem);
        System.out.println("Viagem registrada com sucesso!");
    }
    
    // Listar todas as viagens realizadas
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
    
    // Consultar viagens de um motorista específico
    public void listarViagensPorMotorista(Motorista motorista) {
        System.out.println("Viagens realizadas pelo motorista " + motorista.getNome() + ":");
        for (Viagem viagem : historicoViagens) {
            if (viagem.getMotorista().equals(motorista)) {
                viagem.listaHistoricoViagem();  // Exibe o histórico de viagem do motorista específico
            }
        }
    }
}
