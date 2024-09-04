// Classe FolhaPagamento

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FolhaPagamento {
    Funcionario[] funcionarios = new Funcionario[50];
    int totalFuncionarios = 0;

    // Adiciona um funcionário na folha de pagamento
    public void adicionarFuncionario(Funcionario funcionario) {
        if (totalFuncionarios < 50) {
            funcionarios[totalFuncionarios] = funcionario;
            totalFuncionarios++;
        }
    }

    // Método para ordenar os funcionários em ordem decrescente de salário
    public void ordenar() {
        Arrays.sort(funcionarios, 0, totalFuncionarios, (f1, f2) -> Float.compare(f2.valorSalario, f1.valorSalario));
    }

    // Método para exibir a folha de pagamento
    public void exibir() {
        for (int i = 0; i < totalFuncionarios; i++) {
            funcionarios[i].exibir();
        }
    }

    // Método para gerar 50 funcionários com dados aleatórios
    public void gerarFuncionariosRandomicos() {
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int codigo = i + 1;
            float quantidadeHoras = 160 + random.nextFloat() * 40; // Entre 160 e 200 horas
            float valorHora = 10 + random.nextFloat() * 40;        // Entre 10 e 50 R$ por hora
            float horasExtras = random.nextFloat() * 20;           // Entre 0 e 20 horas extras

            Funcionario f = new Funcionario(codigo, quantidadeHoras, valorHora);
            f.quantidadeHorasExtras = horasExtras;
            f.calcularSalario();
            adicionarFuncionario(f);
        }
    }


    public void inserirDados(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do funcionário:");
        int codigo = scanner.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas:");
        float horas = scanner.nextFloat();
        System.out.println("Digite o valor da hora:");
        float valorHora = scanner.nextFloat();
        System.out.println("Digite a quantidade de horas extras:");
        float horasExtras = scanner.nextFloat();
        Funcionario f = new Funcionario(codigo, horas, valorHora);
        f.quantidadeHorasExtras = horasExtras;
        f.calcularSalario();
        scanner.close();

        adicionarFuncionario(f);   
    }
}