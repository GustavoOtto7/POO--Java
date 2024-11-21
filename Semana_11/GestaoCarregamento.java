package Semana_11;
import Semana_11.GestaoCarregamento.EventoRecarga;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Classe para gerenciar o carregamento dos veículos
public class GestaoCarregamento {
    public static class EventoRecarga {
        protected Date data;
        protected Eletropostos eletropostos;
        // Construtor
        public EventoRecarga(Date data, Eletropostos eletropostos) {
            this.data = new Date();
            this.eletropostos = eletropostos;
        }
    }
    
    protected List<EventoRecarga> historicoRecargas;

    public GestaoCarregamento() {
        this.historicoRecargas = new ArrayList<>();
    }

    // Método que recarrega os veículos e adiciona ao histórico
    public void recarregar(CarroEletrico carro, Eletropostos eletropostos) {
        carro.setAutonomiaRestante(carro.getMaxAuto());
        EventoRecarga recarga = new EventoRecarga(new Date(), eletropostos);
        historicoRecargas.add(recarga);
        System.out.println("Recarga registrada: Data: " + recarga.data + ", Eletroposto: " + eletropostos.getId() + ", Energia recarregada: " + carro.getCapBateria() + " kWh");
    }

    // Método que lista os veículos que estão com baixa autonomia
    public void listarVeiculosComBaixaAutonomia(List<CarroEletrico> carros) {
        System.out.println("Veículos com autonomia inferior a 20%:");
        for (CarroEletrico carro : carros) {
            if (carro.getAutonomiaRestante() < 0.2 * carro.getMaxAuto()) {
                System.out.println("Carro: " + carro.getId() + " | Modelo: " + carro.getModelo() + " | Autonomia Restante: " + carro.getAutonomiaRestante() + " km");
            }
        }
    }

    // Método que lista os carros que necessitam de manutenção, nesse caso coloquei após 1000 KMs
    public void listarCarrosParaManutencao(List<CarroEletrico> carros) {
        System.out.println("Carros que precisam de manutenção:");
        for (CarroEletrico carro : carros) {
            if (carro.getQuilometragem() > 1000 || carro.getAutonomiaRestante() < 0.1 * carro.getMaxAuto()) {
                System.out.println("Carro: " + carro.getId() + " | Modelo: " + carro.getModelo() + " | Quilometragem: " + carro.getQuilometragem() + " km");
            }
        }
    }

    // Método que gera o histórico de recargas
    public void listarHistoricoRecargas() {
        if (historicoRecargas.isEmpty()) {
            System.out.println("Nenhuma recarga registrada.");
        } else {
            System.out.println("Histórico de recargas:");
            for (EventoRecarga recarga : historicoRecargas) {
                System.out.println("Data: " + recarga.data + ", Eletroposto: " + recarga.eletropostos.getId());
            }
        }
    }
}