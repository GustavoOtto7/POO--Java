package Semana_11;

// Classe filha: CarroCompacto, tendo herança da classe mãe CarroEletrico
public class CarroCompacto extends CarroEletrico{
    private static final int TEMPO_RECARGA = 4;
    private static final int MAX_AUTO = 200;
    
    // Construtor
    public CarroCompacto(int id, String marca, String modelo, int anoFab, int quilometragem, int capBateria) {
        super(id, marca, modelo, anoFab, quilometragem, capBateria, MAX_AUTO);
    }
    
    // Método para pegar o tempo de recarga específico dessa categoria
    public static int getTempoRecarga() {
        return TEMPO_RECARGA;
    }   
}