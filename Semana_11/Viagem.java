package Semana_11;

import java.util.ArrayList;
import java.util.List;

public class Viagem {
    private Motorista motorista;
    private CarroEletrico carro;
    private List<Eletropostos> paradas;    
    private String destino;
    private int quilometragemTotal;
    private int distanciaPercorrida;
    private int autonomiaRestante;

    public Viagem(Motorista motorista, CarroEletrico carro, String destino, int quilometragemTotal) {
        this.motorista = motorista;
        this.carro = carro;
        this.destino = destino;
        this.quilometragemTotal = quilometragemTotal;
        this.autonomiaRestante = carro.getAutonomiaRestante(); 
        this.paradas = new ArrayList<>(); 
    }

    public void iniciarViagem(int distanciaDestino, List<Eletropostos> eletropostos) {
        System.out.println("Iniciando viagem para o destino de " + distanciaDestino + " km.");    
        if (carro.getAutonomiaRestante() < distanciaDestino) {
            System.out.println("Autonomia insuficiente para a viagem, paradas para recarga serão necessárias.");            
            planejarParadas(eletropostos, distanciaDestino);
        } else {
            System.out.println("A autonomia é suficiente para a viagem. Nenhuma parada necessária.");
        }
    }

    public void planejarParadas(List<Eletropostos> listaEletropostos, int distanciaDestino) {
        int posicaoAtual = 0;
    
        for (Eletropostos eletroposto : listaEletropostos) {
            int distanciaParaProximoEletroposto = eletroposto.getPosicaoKm() - posicaoAtual;
            if (carro.getAutonomiaRestante() < distanciaParaProximoEletroposto) {
                System.out.println("Parada para recarga no Eletroposto " + eletroposto.getId() + " na posição " + eletroposto.getPosicaoKm() + " km.");
                if (eletroposto.getNumVagas() > 0) {
                    carro.recarregar();
                    //carro.setAutonomiaRestante(carro.getMaxAuto(), 0);
                    eletroposto.setNumVagas(eletroposto.getNumVagas() - 1);
                    System.out.println("Recarga realizada com sucesso. Vagas restantes: " + eletroposto.getNumVagas());
                } else {
                    System.out.println("Eletroposto " + eletroposto.getId() + " sem vagas disponíveis. Continuando a jornada.");
                    continue;
                }
            }
            posicaoAtual = eletroposto.getPosicaoKm();
            carro.setAutonomiaRestante(carro.getAutonomiaRestante(), distanciaParaProximoEletroposto);
        }
        int distanciaParaDestino = distanciaDestino - posicaoAtual;
        if (carro.getAutonomiaRestante() < distanciaParaDestino) {
            System.out.println("Parada final para recarga antes de chegar ao destino.");
            carro.recarregar();
        } else {
            System.out.println("Viagem concluída sem necessidade de recarga adicional.");
        }
    }

    public void registrarParadas(List<Eletropostos> listaEletropostos) {
        for (Eletropostos eletropostos : listaEletropostos) {
            if (carro.getAutonomiaRestante() < eletropostos.getPosicaoKm()) {
                paradas.add(eletropostos);
                System.out.println("Parada registrada no Eletroposto " + eletropostos.getId() + " na posição " + eletropostos.getPosicaoKm() + " km.");
                carro.recarregar();  
                //carro.setAutonomiaRestante(carro.getMaxAuto(), 0);  // Atualiza a autonomia após a recarga
            }
        }
    }
    
    public void finalizarViagem(GestaoViagem historicoViagens, Viagem viagem, CarroEletrico carro) {
        carro.setAutonomiaRestante(getAutonomiaRestante(), distanciaPercorrida);
        carro.setQuilometragem(carro.getQuilometragem() + viagem.getQuilometragemTotal());
        historicoViagens.registrarViagem(this);  // Registra a viagem no histórico
        System.out.println("Viagem finalizada com sucesso! Distância total: " + viagem.getQuilometragemTotal() + " km.");
    }
    
    public void listaHistoricoViagem() {
        System.out.println("Histórico da viagem:");
        System.out.println("Motorista: " + motorista.getNome() + " | Carro: " + carro.getModelo() + " - " + carro.getId() + " | Distância percorrida: " + distanciaPercorrida + " km | Paradas: " + paradas.size());
    }

    public Motorista getMotorista() {
        return motorista;
    }
    
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    
    public CarroEletrico getCarro() {
        return carro;
    }
    
    public void setCarro(CarroEletrico carro) {
        this.carro = carro;
    }

    public List<Eletropostos> getParadas() {
        return paradas;
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

    public void setParadas(List<Eletropostos> paradas) {
        this.paradas = paradas;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setQuilometragemTotal(int quilometragemTotal) {
        this.quilometragemTotal = quilometragemTotal;
    }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public void setAutonomiaRestante(int autonomiaRestante) {
        this.autonomiaRestante = autonomiaRestante;
    }    
}