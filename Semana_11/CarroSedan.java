package Semana_11;

public class CarroSedan extends CarroEletrico{
    private static final int TEMPO_RECARGA = 6;
    private static final int MAX_AUTO = 400;
    
    public CarroSedan(int id, String marca, String modelo, int anoFab, int quilometragem, int capBateria) {
        super(id, marca, modelo, anoFab, quilometragem, capBateria, MAX_AUTO);
    }
    
    public static int getTempoRecarga() {
        return TEMPO_RECARGA;
    }   
}