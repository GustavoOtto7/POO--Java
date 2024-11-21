package Semana_11;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestaoCarregamento {
    // Classe para representar um evento de recarga
    public static class EventoRecarga {
        protected Date data;
        protected  Eletropostos eletropostos;
        
        public EventoRecarga(Date data, Eletropostos eletropostos) {
            this.data = new Date();
            this.eletropostos = eletropostos;
        }
    }

    protected List<EventoRecarga> historicoRecargas;  // Lista de eventos de recarga

    public GestaoCarregamento() {
        this.historicoRecargas = new ArrayList<>();
    }

    // Método para registrar recarga
    public void recarregar(CarroEletrico carro, Eletropostos eletropostos) {
        carro.setAutonomiaRestante(carro.getMaxAuto(), 0);
        EventoRecarga recarga = new EventoRecarga(new Date(), eletropostos);
        historicoRecargas.add(recarga);

        System.out.println("Recarga registrada: " + recarga + "Data: " + recarga.data + ", Eletroposto: " + eletropostos.getId() + ", Energia recarregada: " + carro.getCapBateria() + " kWh");
    }

    // Método para listar o histórico de recargas de um carro específico
    public void listarHistoricoRecargas() {
        if (historicoRecargas.isEmpty()) {
            System.out.println("Nenhuma recarga registrada.");
        } else {
            System.out.println("Histórico de recargas:");
            for (EventoRecarga recarga : historicoRecargas) {
                System.out.println(recarga);
            }
        }
    }
}