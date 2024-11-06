package Semana_11; 

public class CarroSuv extends CarroEletrico {
    private static final int TEMPO_RECARGA = 8; // Em horas
    private static final int MIN_AUTO = 401;    // Autonomia mínima para ser um CarroSuv

    public CarroSuv(int id, String marca, String modelo, int anoFab, int quilometragem, int capBateria, int maxAuto) {
        super(id, marca, modelo, anoFab, quilometragem, capBateria, maxAuto > MIN_AUTO ? maxAuto : MIN_AUTO);
        // Se maxAuto for menor que MIN_AUTO, define o mínimo para um CarroSuv.
    }

    public static int getTempoRecarga() {
        return TEMPO_RECARGA;
    }
}
