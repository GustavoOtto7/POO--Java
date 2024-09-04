public class Exercicio_01_POO {

    private Aluno[] alunos;

    public Exercicio_01_POO() {
        alunos = new Aluno[]{
            new Aluno(1, "Joao", 14, 1.75),
            new Aluno(2, "Maria", 18, 1.54),
            new Aluno(3, "Pedro", 15, 1.62),
            new Aluno(4, "Clara", 16, 1.60),
            new Aluno(5, "Jose", 17, 1.65),
            new Aluno(6, "Carla", 14, 1.62),
            new Aluno(7, "Fabio", 17, 1.62),
            new Aluno(8, "Mara", 13, 1.74),
            new Aluno(9, "Cesar", 16, 1.61),
            new Aluno(10, "Ana", 17, 1.68)
        };
    }

    public double calcularMediaIdade() {
        int soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.getIdade();
        }
        return (double) soma / alunos.length;
    }

    public void exibirAlunosMaisJovens() {
        int menorIdade = Integer.MAX_VALUE;
        int segundoMenorIdade = Integer.MAX_VALUE;
        String aluno1 = "", aluno2 = "";

        for (Aluno aluno : alunos) {
            if (aluno.getIdade() < menorIdade) {
                segundoMenorIdade = menorIdade;
                aluno2 = aluno1;
                menorIdade = aluno.getIdade();
                aluno1 = aluno.getNome();
            } else if (aluno.getIdade() < segundoMenorIdade) {
                segundoMenorIdade = aluno.getIdade();
                aluno2 = aluno.getNome();
            }
        }

        System.out.println("Os dois alunos mais jovens são: " + aluno1 + " e " + aluno2);
    }

    public double calcularPercentualMaisDe16Anos() {
        int count = 0;
        for (Aluno aluno : alunos) {
            if (aluno.getIdade() > 16) {
                count++;
            }
        }
        return (double) count / alunos.length * 100;
    }

    public int contarAlunosMenosDe16ComAlturaAcimaMedia() {
        double somaAlturas = 0;
        int countAltos = 0;
        for (Aluno aluno : alunos) {
            somaAlturas += aluno.getAltura();}
        double mediaAltura = somaAlturas / alunos.length;
        for (int i = 0;i< alunos.length;i++) {
            if (alunos[i].getIdade() < 16 && alunos[i].getAltura() > mediaAltura) {
                countAltos++;
            }
        }
        return countAltos;
    }

    public static void main(String[] args) {
        Exercicio_01_POO controle = new Exercicio_01_POO();
        System.out.println("Média de idade dos alunos: " + controle.calcularMediaIdade());
        controle.exibirAlunosMaisJovens();
        System.out.println("Percentual de alunos com mais de 16 anos: " + controle.calcularPercentualMaisDe16Anos() + "%");
        System.out.println("Número de alunos com menos de 16 anos e altura acima da média: " + controle.contarAlunosMenosDe16ComAlturaAcimaMedia());
    }
}