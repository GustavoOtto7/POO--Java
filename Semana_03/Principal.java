public class Principal {
    
    public static void main(String[] args) {
        Pessoa gu = new Pessoa();
        Pessoa pri = new Pessoa();
        gu.nome = "Gustavo";
        pri.nome = "Priscila";
        gu.exibir();
        pri.exibir();
    }
}