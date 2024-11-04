package Semana_09 (Revisão).Exercicio_01;

public class Cliente {
    private String nome;
    private String cpf;
    private Carrinho carrinho;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.carrinho = new Carrinho();
        this.status();
    }

    public void status() {
        System.out.println("Cliente Cadastrado!");
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("CPF do cliente: " + this.cpf);
    } 

    public adicionarProduto(){
        carrinho.adicionar(Produto);
    }

    public removerProduto(){
        carrinho.remover(Produto);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }
}