public class Funcionario {
    public int id;
    public double quantHoras;
    public double valorHora;
    public double quantHorasExtras;
    public double valorSalario;

    public Funcionario(int id, double quantHoras, double valorHora, double quantHorasExtras){
        this.id = id;
        this.quantHoras = quantHoras;
        this.valorHora = valorHora;
        this.quantHorasExtras = quantHorasExtras;
        this.calcularHoraExtra();
        this.calcularSalario();
        //this.exibir();
    }

    public double calcularHoraExtra(){
        double valor = this.quantHorasExtras * (this.valorHora / 2);
        return valor;
    }

    public void calcularSalario(){
        this.valorSalario = (this.quantHoras * this.valorHora) + calcularHoraExtra();
    }
    
    public void exibir(){
        System.out.println("Funcionário: " +  this.id);
        System.out.println("Salário: R$" +  this.valorSalario);
        System.out.println("Quantidade de horas trabalhadas: " + (this.quantHoras + this.quantHorasExtras));
    }
}