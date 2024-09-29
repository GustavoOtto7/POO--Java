public class Livro {
    String title = "";
    String autor = "";
    int ano = 0;

    public void exibir(){
        System.out.println("Título: " + title);
        System.err.println("Autor: " + autor);
        System.err.println("Ano: " + ano);
    }
}