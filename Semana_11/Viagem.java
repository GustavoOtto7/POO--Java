package Semana_11;

import java.util.List;

public class Viagem {
    private Motorista motorista;
    private CarroEletrico carro;
    private List<Eletropostos> paradas;    

    private String destino;
    private int quilometragemTotal;
    private int autonomiaRestante;

    public Viagem (Motorista motorista, CarroEletrico carro, String destino, int quilometragemTotal) {
        this.motorista = motorista;
        this.carro = carro;
        this.destino = destino;
        this.quilometragemTotal = quilometragemTotal;
        this.paradas = planejarParadas();  // Método para planejar paradas baseado na quilometragem
        this.autonomiaRestante = calcularAutonomiaRestante(); 
    }

    public void iniciarViagem(){}
        
        if (carro.getAutonomiaRestante() > quilometragemTotal) {
            finalizarViagem();
        } else {
            planejarParadas();
        }


    public void planejarParadas() {}

    public void registrarParadas() {}

    public void atualizarAutonomia() {}

    public void finalizarViagem() {}

    public void listaHistoricoViagem() {}



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

    public void setAutonomiaRestante(int autonomiaRestante) {
        this.autonomiaRestante = autonomiaRestante;
    } 

    

}
