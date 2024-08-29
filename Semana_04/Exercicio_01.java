public class Exercicio_01 {

    int [] matricula = {1,2,3,4,5,6,7,8,9,10};
    String [] nome = {"Joao", "Maria", "Pedro", "Clara", "Jose", "Carla", "Fabio", "Mara", "Cesar", "Ana"};
    int [] idade = {12,18,15,16,17,14,17,13,16,17};
    double [] altura = {1.75,1.54,1.62,1.60,2.65,1.62,1.62,1.74,1.61,1.68};

    public double calcular_media_idade() {
    int soma_idade = 0;
    for (int age : idade) {
        soma_idade += age;}
    return (double) soma_idade / idade.length;}
    
    public void exibir_alunos_mais_jovens(){
        int menorIdade = Integer.MAX_VALUE;

    }
    }


    public double calcular_mais_16() {
        int count = 0;
        for (int age : idade) {
            if (age > 16) {
                count++;}}
        double media = count / idade.length * 100;
        System.out.println("Percent menores 16 anos: " + media);
    }
}
