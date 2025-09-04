import java.util.Scanner;

// Classe base
abstract class Pessoa {
    private String nome;
    private int idade;
    private String status;

    public Pessoa(String nome, int idade, String status) {
        this.nome = nome;
        this.idade = idade;
        this.status = status;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public abstract void estudar();
    public abstract void trabalhar();

    public void mostrarStatus() {
        System.out.println("\n--- Ano " + getIdade() + " ---");
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Status: " + getStatus());
    }
}

// Subclasse Bebê
class Bebe extends Pessoa {
    public Bebe(String nome, int idade) {
        super(nome, idade, "Nascimento, crescimento e primeiras descobertas.");
    }

    @Override
    public void estudar() {
        System.out.println("Estudo: Ainda não estuda.");
    }

    @Override
    public void trabalhar() {
        System.out.println("Trabalho: Ainda não trabalha.");
    }
}

// Subclasse Criança
class Crianca extends Pessoa {
    public Crianca(String nome, int idade) {
        super(nome, idade, "Estudando no fundamental, brincando com amigos e aprendendo.");
    }

    @Override
    public void estudar() {
        System.out.println("Estudo: Aprendendo matérias do ensino fundamental.");
    }

    @Override
    public void trabalhar() {
        System.out.println("Trabalho: Não trabalha, apenas ajuda em tarefas da casa.");
    }
}

// Subclasse Adolescente
class Adolescente extends Pessoa {
    public Adolescente(String nome, int idade) {
        super(nome, idade, "No ensino médio, estudando e ganhando maturidade.");
    }

    @Override
    public void estudar() {
        System.out.println("Estudo: Estudando matérias do ensino médio e curso técnico em agronegócio.");
    }

    @Override
    public void trabalhar() {
        System.out.println("Trabalho: Ajudando em casa e fazendo estágio no terceiro ano do EM.");
    }
}

// Subclasse Adulto
class Adulto extends Pessoa {
    public Adulto(String nome, int idade) {
        super(nome, idade, "Na faculdade, estudando e crescendo profissionalmente.");
    }

    @Override
    public void estudar() {
        System.out.println("Estudo: Estudando na faculdade, começando a entender sobre Tecnologia e programação.");
    }

    @Override
    public void trabalhar() {
        if (getIdade() == 17) {
            System.out.println("Trabalho: Trabalhando nas Termas Romanas.");
        } else {
            System.out.println("Trabalho: Passei a trabalhar na Meta.");
        }
    }
}

// Classe principal
public class MinhaVida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        Pessoa eu = new Bebe(nome, 0);

        for (int ano = 0; ano <= 20; ano++) {
            // Troca de fase
            if (ano == 0) eu = new Bebe(nome, ano);
            else if (ano == 5) eu = new Crianca(nome, ano);
            else if (ano == 14) eu = new Adolescente(nome, ano);
            else if (ano == 17) eu = new Adulto(nome, ano);

            eu.setIdade(ano);
            // Mostrar fase
            eu.mostrarStatus();
            eu.estudar();
            eu.trabalhar();

            // Conquistas/acontecimentos por idade
            switch (ano) {
                case 0:  System.out.println("Lembrança/Conquista: Nasci no dia 25/08/2005!"); break;
                case 1:  System.out.println("Lembrança/Conquista: Dei meus primeiros passos."); break;
                case 2:  System.out.println("Lembrança/Conquista: Comecei a falar ou pelo menos tentar."); break;
                case 3:  System.out.println("Lembrança/Conquista: Fiz minhas primeiras descobertas."); break;
                case 4:  System.out.println("Lembrança/Conquista: Pintava os desenhos que minha mãe trazia da escola."); break;
                case 5:  System.out.println("Lembrança/Conquista: Entrei no ensino fundamental, aprendi a ler e escrever."); break;
                case 6:  System.out.println("Lembrança/Conquista: Passava grande parte do dia, junto com meus avós."); break;
                case 7:  System.out.println("Lembrança/Conquista: Aprendi matemática."); break;
                case 8:  System.out.println("Lembrança/Conquista: Participei de gincanas na escola."); break;
                case 9:  System.out.println("Lembrança/Conquista: Jogava bastante videogame."); break;
                case 10: System.out.println("Lembrança/Conquista: Andava bastante de bicicleta."); break;
                case 11: System.out.println("Lembrança/Conquista: Ganhei confiança nos estudos e no xadrez."); break;
                case 12: System.out.println("Lembrança/Conquista: Ganhei um torneio de futsal e dois campeonatos de xadrez."); break;
                case 13: System.out.println("Lembrança/Conquista: Me formei no fundamental."); break;
                case 14: System.out.println("Lembrança/Conquista: Entrei no ensino médio técnico, com bastante receios."); break;
                case 15: System.out.println("Lembrança/Conquista: Comecei a me interessar pelo curso técnico e me tornei um aluno melhor."); break;
                case 16: System.out.println("Lembrança/Conquista: Fiz o estágio obrigatório e ao final do ano me formei."); break;
                case 17: System.out.println("Lembrança/Conquista: Entrei na faculdade e comecei a trabalhar como jovem aprendiz."); break;
                case 18: System.out.println("Lembrança/Conquista: Entrei na Meta, que era um grande objetivo que eu tinha!."); break;
                case 19: System.out.println("Lembrança/Conquista: Cresci dentro da Meta, passei no ProUni, me mudei com minha namorada pra um apartamento no Recanto, compramos nossos móveis e carro!"); break;
                case 20: System.out.println("Lembrança/Conquista: Entrei como estagiário SAP, e agora busco crescer e me desenvolver nessa área e aprender bastante na faculdade para o meu trabalho."); break;
            }

            System.out.println("\nPressione ENTER para avançar para o próximo ano...");
            sc.nextLine();
        }
        System.out.println("\nFim!");
        sc.close();
    }
}
