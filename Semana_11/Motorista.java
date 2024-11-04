package Semana_11;

public class Motorista {
    private String nome;
    private int id;
    private int cnh;
    private NivelExperiencia nivelHabilidade; // Usando o enum como tipo

    public Motorista(String nome, int id, int cnh, NivelExperiencia nivelHabilidade) {
        this.nome = nome;
        this.id = id;
        this.cnh = cnh;
        this.nivelHabilidade = nivelHabilidade; // Define o valor usando o enum
    }

    public enum NivelExperiencia {
        INICIANTE, INTERMEDIARIO, AVANCADO;
    }    

    public NivelExperiencia getNivelHabilidade() {
        return nivelHabilidade;
    }

    public void setNivelHabilidade(NivelExperiencia nivelHabilidade) {
        this.nivelHabilidade = nivelHabilidade;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getCnh() {
        return cnh;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }
}