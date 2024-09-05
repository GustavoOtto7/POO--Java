public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float preco;

        public Carro(String marca, String modelo, int ano, float preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        }

        public void exibir(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: " + preco);
        }

        public void inserirDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a marca:");
        String marca = scanner.nextString();
        System.out.println("Digite o modelo:");
        String modelo = scanner.nextString();
        System.out.println("Digite o ano:");
        int ano = scanner.nextInt();
        System.out.println("Digite o preço:");
        float preco = scanner.nextFloat();
        Carro car = new Carro(marca, modelo, ano, preco);
        scanner.close();   
        }
        }


        //criar get e set cada atributo
        //setPreco() não pode negativo