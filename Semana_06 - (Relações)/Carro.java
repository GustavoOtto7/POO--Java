public class Carro {
    private String nome;
    private Motor motor;
    Public Carro(int potencia, String combustivel, String nome){
        this.motor = new Motor(potencia, combustivel);
        this.nome = nome;

    public void exibir(){
        System.out.println("Potência: " + potencia);
        System.err.println("Combustível: " + combustivel);
        System.err.println("Nome: " + nome);}

    public static void main(String[] args) {
        Carro clio = new Carro(int potencia = 115; String combustivel = "Flex"; String nome = "Clio");
        //clio.potencia = 115;
        //clio.combustivel = "Flex";
        //clio.nome = "Clio";
        clio.exibir();}  
    }
}