package Semana_11;

public class Eletropostos {
    private int id;
    private LocalPosto local;
    private int numVagas;
    private int tempoCarregamento;
    private int posicaoKm;

    public Eletropostos( int id, LocalPosto local, int numVagas, int tempoCarregamento, int posicaoKm) {
      this.id = id;
      this.local = local;
      this.numVagas = numVagas;
      this.tempoCarregamento = tempoCarregamento;
      this.posicaoKm = posicaoKm;
    }

    public enum LocalPosto {
      CIDADE, ESTRADA;
    }

    public int getId() {
        return id;
    }

    public LocalPosto getLocal() {
        return local;
    }

    public int getNumVagas() {
        return numVagas;
    }

    public int getTempoCarregamento() {
        return tempoCarregamento;
    }

    public int getPosicaoKm() {
      return posicaoKm;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setLocal(LocalPosto local) {
        this.local = local;
    }

    public void setNumVagas(int numVagas) {
        this.numVagas = numVagas;
    }

    public void setTempoCarregamento(int tempoCarregamento) {
        this.tempoCarregamento = tempoCarregamento;
    }

    public void setPosicaoKm(int posicaoKm) {
        this.posicaoKm = posicaoKm;
    }
}