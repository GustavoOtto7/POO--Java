// Classe Funcionario
public class Funcionario {
    int codigo;
    float quantidadeHoras;
    float valorHora;
    float valorSalario;
    float quantidadeHorasExtras;

    // Construtor
    public Funcionario(int codigo, float quantidadeHoras, float valorHora) {
        this.codigo = codigo;
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
    }

    // Método para calcular o valor das horas extras (50% a mais sobre o valor da hora normal)
    public float calcularHoraExtra() {
        return quantidadeHorasExtras * (valorHora * 1.5f);
    }

    // Método para calcular o salário total do funcionário
    public void calcularSalario() {
        this.valorSalario = (quantidadeHoras * valorHora) + calcularHoraExtra();
    }

    // Método para exibir os dados do funcionário
    public void exibir() {
        System.out.println("Código: " + codigo);
        System.out.println("Horas trabalhadas: " + quantidadeHoras);
        System.out.println("Salário: R$ " + valorSalario);
        System.out.println();
    }
}