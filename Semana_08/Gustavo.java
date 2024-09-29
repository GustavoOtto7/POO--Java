public class Gustavo extends Aluno{
    protected Carro carro = new Carro("GIO9999","Renault","Clio","1.6");
    public void executar(){
        cpf = "047.411.999.01";
        registro = "007146";
        nome = "Gustavo";
        olhos = "azuis";
        roupa = "Camisa e Jeans";
    }
    public void exibir(){
        System.out.println("CPF:"+cpf);
        System.out.println("Registro:"+registro);
        System.out.println("Nome:"+nome);
        System.out.println("Olhos:"+olhos);
        System.out.println("Roupa:"+roupa);
        System.out.println("Carro placa:"+carro.placa);
        System.out.println("Carro marca:"+carro.marca);
        System.out.println("Carro modelo:"+carro.modelo);
        System.out.println("Carro motor:"+carro.motor);
    }
}
