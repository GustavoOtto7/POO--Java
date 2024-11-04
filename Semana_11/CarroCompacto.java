package Semana_11;

public class CarroCompacto extends CarroEletrico{
    private static final int TEMPO_RECARGA = 4;
    private static final int MAX_AUTO = 200;

    
    public CarroCompacto(int id, String marca, String modelo, int anoFab, int capBateria) {
        super(id, marca, modelo, anoFab, capBateria, MAX_AUTO);
    }
    
    public static int getTempoRecarga() {
        return TEMPO_RECARGA;
    }   
}