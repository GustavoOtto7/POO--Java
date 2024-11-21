package Semana_11; 

// Classe filha: CarroSuv, tendo herança da classe mãe CarroEletrico
public class CarroSuv extends CarroEletrico {
    private static final int TEMPO_RECARGA = 8;
    private static final int MIN_AUTO = 401;   

    // Construtor
    public CarroSuv(int id, String marca, String modelo, int anoFab, int quilometragem, int capBateria, int maxAuto) {
        super(id, marca, modelo, anoFab, quilometragem, capBateria, maxAuto > MIN_AUTO ? maxAuto : MIN_AUTO);
        // Se maxAuto for menor que MIN_AUTO, define o mínimo para um CarroSuv.
        // Verificação para sempre o Suv ter + de 400 KMs de autonomia
    }

    // Método para pegar o tempo de recarga específico dessa categoria
    public static int getTempoRecarga() {
        return TEMPO_RECARGA;
    }
}
