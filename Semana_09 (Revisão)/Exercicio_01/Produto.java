package Semana_09 (Revisão).Exercicio_01;

public class Produto {
    private String nome;
    private float valor;

    public Produto(String nome, float valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
}
