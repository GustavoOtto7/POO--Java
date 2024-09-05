public class Principal {
    // Método principal (main)
    public static void main(String[] args) {
        
        FolhaPagamento folha = new FolhaPagamento();

        folha.gerarFuncionariosRandomicos();

        //folha.inserirDados();

        // Exibindo os funcionários antes da ordenação
        System.out.println("Funcionários antes da ordenação:");
        folha.exibir();

        // Ordenando por salário
        folha.ordenar();

        // Exibindo os funcionários após a ordenação
        System.out.println("Funcionários após a ordenação por salário:");
        folha.exibir();       
    }    
}