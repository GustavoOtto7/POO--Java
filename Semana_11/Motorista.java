package Semana_11;

// Classe Motorista
public class Motorista {
    private String nome;
    private int id;
    private int cnh;
    private NivelExperiencia nivelHabilidade; // Usando o enum como tipo

    // Construtor
    public Motorista(String nome, int id, int cnh, NivelExperiencia nivelHabilidade) {
        this.nome = nome;
        this.id = id;
        this.cnh = cnh;
        this.nivelHabilidade = nivelHabilidade; // Define o valor usando o enum
    }
    
    // Utilizando o enum para adicionar o nível de experiência e o usuário não digitar outra opção
    public enum NivelExperiencia {
        INICIANTE, INTERMEDIARIO, AVANCADO;
    }    
    
    // Getters e Setters
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