package Semana_11;

import java.util.ArrayList;
import java.util.List;

// Classe Viagem
public class Viagem {
    private Motorista motorista;
    private CarroEletrico carro;
    private String destino;
    private int quilometragemTotal;
    private int distanciaPercorrida;
    private int autonomiaRestante;
    private List<Eletropostos> paradas;
    private List<String> historicoViagem;

    // Construtor
    public Viagem(Motorista motorista, CarroEletrico carro, String destino, int quilometragemTotal) {
        this.motorista = motorista;
        this.carro = carro;
        this.destino = destino;
        this.quilometragemTotal = quilometragemTotal;
        this.autonomiaRestante = carro.getAutonomiaRestante();
        this.paradas = new ArrayList<>();
        this.historicoViagem = new ArrayList<>();
    }

    // Método que inicia a viagem realizando verificação de autonomia
    public void iniciarViagem(List<Eletropostos> eletropostos, GestaoCarregamento gestaoCarregamento) {
        int distanciaDestino = this.quilometragemTotal; 
        System.out.println("Iniciando viagem para o destino de " + distanciaDestino + " km.");
        if (carro.getAutonomiaRestante() < distanciaDestino) {
            System.out.println("Autonomia insuficiente para a viagem, paradas para recarga serão necessárias.");
            planejarParadas(eletropostos, distanciaDestino, gestaoCarregamento);
        } else {
            System.out.println("A autonomia é suficiente para a viagem. Nenhuma parada necessária.");
            finalizarViagem(distanciaDestino);
        }
    }

    // Método que planeja paradas em eletropostos durante a viagem
    public void planejarParadas(List<Eletropostos> listaEletropostos, int distanciaDestino, GestaoCarregamento gestaoCarregamento) {
        int posicaoAtual = 0;
        for (Eletropostos eletroposto : listaEletropostos) {
            int distanciaParaProximoEletroposto = eletroposto.getPosicaoKm() - posicaoAtual;
            if (carro.getAutonomiaRestante() < distanciaParaProximoEletroposto) {
                System.out.println("Parada para recarga no Eletroposto " + eletroposto.getId() + " na posição " + eletroposto.getPosicaoKm() + " km.");
                if (eletroposto.getNumVagas() > 0) {
                    eletroposto.setNumVagas(eletroposto.getNumVagas() - 1); 
                    System.out.println("Vaga ocupada. Vagas restantes: " + eletroposto.getNumVagas());
                    gestaoCarregamento.recarregar(carro, eletroposto);
                    eletroposto.setNumVagas(eletroposto.getNumVagas() + 1); 
                    System.out.println("Recarga concluída. Vaga liberada. Vagas disponíveis: " + eletroposto.getNumVagas());
                } else {
                    System.out.println("Eletroposto " + eletroposto.getId() + " sem vagas disponíveis. Continuando a jornada.");
                    continue;
                }
            }
            posicaoAtual = eletroposto.getPosicaoKm();
            carro.setAutonomiaRestante(carro.getAutonomiaRestante() - distanciaParaProximoEletroposto); // Atualiza a autonomia após a viagem até o próximo eletroposto
        }
        // Verificação final se a autonomia restante é suficiente para completar o destino
        int distanciaParaDestino = distanciaDestino - posicaoAtual;
        if (carro.getAutonomiaRestante() < distanciaParaDestino) {
            System.out.println("Parada final para recarga antes de chegar ao destino.");
            Eletropostos ultimoEletroposto = listaEletropostos.get(listaEletropostos.size() - 1);
            if (ultimoEletroposto.getNumVagas() > 0) {
                ultimoEletroposto.setNumVagas(ultimoEletroposto.getNumVagas() - 1); 
                gestaoCarregamento.recarregar(carro, ultimoEletroposto); 
                ultimoEletroposto.setNumVagas(ultimoEletroposto.getNumVagas() + 1); 
                System.out.println("Recarga concluída no Eletroposto " + ultimoEletroposto.getId() + ". Vaga liberada. Vagas disponíveis: " + ultimoEletroposto.getNumVagas());
            } else {
                System.out.println("Eletroposto " + ultimoEletroposto.getId() + " sem vagas disponíveis. Viagem interrompida.");
            }
        } else {
            System.out.println("Viagem concluída sem necessidade de recarga adicional.");
            finalizarViagem(distanciaDestino);
        }
    }

    // Método que finaliza a viagem e atualiza a quilometragem
    private void finalizarViagem(int distanciaDestino) {
        this.distanciaPercorrida = distanciaDestino;
        carro.setQuilometragem(carro.getQuilometragem() + distanciaPercorrida);
        System.out.println("Viagem finalizada com sucesso! Distância total percorrida: " + distanciaPercorrida + " km.");
        historicoViagem.add("Viagem finalizada | Distância percorrida: " + distanciaPercorrida + " km.");
    }

    // Método que lista sobre como foi a viagem
    public void listaHistoricoViagem() {
        System.out.println("Histórico da Viagem:");
        for (String registro : historicoViagem) {
            System.out.println(registro);
        }
    }

    // Getters e Setters
    public Motorista getMotorista() {
        return motorista;
    }

    public CarroEletrico getCarro() {
        return carro;
    }

    public String getDestino() {
        return destino;
    }

    public int getQuilometragemTotal() {
        return quilometragemTotal;
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public int getAutonomiaRestante() {
        return autonomiaRestante;
    }

    public void setAutonomiaRestante(int autonomiaRestante) {
        this.autonomiaRestante = autonomiaRestante;
    }
}