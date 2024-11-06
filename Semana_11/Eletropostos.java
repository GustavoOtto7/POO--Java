package Semana_11;


/*
 *  Cadastro e Gerenciamento de Eletropostos:
   •    Cada eletroposto deve ter uma identificação única, local (cidade e/ou estrada), número de vagas disponíveis para carregamento simultâneo e tempo médio de carregamento por veículo.

   •    Implementar métodos para registrar novos eletropostos e consultar os postos de recarga disponíveis ao longo das rotas das viagens.
 */
public class Eletropostos {
    private int id;
    private LocalPosto local;
    private int numVagas;
    private int tempoCarregamento;

    public Eletropostos( int id, LocalPosto local, int numVagas, int tempoCarregamento) {
      this.id = id;
      this.local = local;
      this.numVagas = numVagas;
      this.tempoCarregamento = tempoCarregamento;
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
}