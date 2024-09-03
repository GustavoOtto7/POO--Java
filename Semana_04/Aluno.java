public class Aluno {
    private int matricula;
    private String nome;
    private int idade;
    private double altura;

    public Aluno(int matricula, String nome, int idade, double altura) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;}
    public int getMatricula() {
        return matricula;}
    public String getNome() {
        return nome;}
    public int getIdade() {
        return idade;}
    public double getAltura() {
        return altura;}
}