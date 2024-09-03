public class Exercicio_01 {

    int [] matricula = {1,2,3,4,5,6,7,8,9,10};
    String [] nome = {"Joao", "Maria", "Pedro", "Clara", "Jose", "Carla", "Fabio", "Mara", "Cesar", "Ana"};
    int [] idade = {12,18,15,16,17,14,17,13,16,17};
    double [] alturas = {1.75,1.54,1.62,1.60,2.65,1.62,1.62,1.74,1.61,1.68};

    public double calcularMediaIdade() {
    int soma_idade = 0;
    for (int age : idade) {
        soma_idade += age;}
    return (double) soma_idade / idade.length;}
    
    public void exibirAlunosMaisJovens(){
        int menorIdade = Integer.MAX_VALUE;
        int segundoMenorIdade = Integer.MAX_VALUE;
        String aluno1 = "", aluno2 = "";

        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < menorIdade) {
                segundoMenorIdade = menorIdade;
                aluno2 = aluno1;
                menorIdade = idade[i];
                aluno1 = nome[i];
            } else if (idade[i] < segundoMenorIdade) {
                segundoMenorIdade = idade[i];
                aluno2 = nome[i];
            }
        }
        System.out.println("Os dois alunos mais jovens são: " + aluno1 "com" + menorIdade "anos e" + aluno2 "com" + segundoMenorIdade "anos.");
    }

    public double calcularMais16() {
        int count = 0;
        for (int age : idade) {
            if (age > 16) {
                count++;}}
        double media = count / idade.length * 100;
        System.out.println("Percent menores 16 anos: " + media);}

    public int contarAlunosMenosDe16ComAlturaAcimaMedia() {
        double somaAlturas = 0;
        int countAltos = 0;
        for (double altura : alturas){
            somaAlturas += altura;}
        double mediaAltura = somaAlturas / alturas.length;
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < 16 && alturas[i] > mediaAltura) {
                countAltos++;}}
        return countAltos;}
        public static void main(String[] args) {
            Exercicio_01 controle = new Exercicio_01();
            System.out.println("Média de idade dos alunos: " + controle.calcularMediaIdade());
            controle.exibirAlunosMaisJovens();
            System.out.println("Percentual de alunos com mais de 16 anos: " + controle.calcularMais16() + "%");
            System.out.println("Número de alunos com menos de 16 anos e altura acima da média: " + controle.contarAlunosMenosDe16ComAlturaAcimaMedia());
        } 
}