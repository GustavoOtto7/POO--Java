package Semana_11;

public class Principal {

    public static void main(String[] args) {
        System.out.println("FÉ");
        // Criando motoristas
        Motorista motorista1 = new Motorista("João", 1234, 111, Motorista.NivelExperiencia.INICIANTE);
        Motorista motorista2 = new Motorista("Maria", 2345, 222, Motorista.NivelExperiencia.INTERMEDIARIO);
        Motorista motorista3 = new Motorista("Carlos", 3456, 333, Motorista.NivelExperiencia.AVANCADO);

        // Criando eletropostos
        Eletropostos eletroposto1 = new Eletropostos(1, "Rua Alpha", 2, 4, 150);
        Eletropostos eletroposto2 = new Eletropostos(2, "Avenida Beta", 3, 4, 200);
        Eletropostos eletroposto3 = new Eletropostos(3, "Praça Gama", 2, 4, 300);
        Eletropostos eletroposto4 = new Eletropostos(4, "Rua Delta", 3, 4, 400);
        Eletropostos eletroposto5 = new Eletropostos(5, "Estrada Elipsum", 1, 4, 450);

        // Criando carros
        CarroCompacto carro1 = new CarroCompacto(11, "Chevrolet", "Onix", 2020, 0, 40);
        CarroCompacto carro2 = new CarroCompacto(12, "Volkswagen", "Polo", 2020, 0, 40);
        CarroCompacto carro3 = new CarroCompacto(13, "Hyundai", "HB20", 2020, 0, 40);
        
        CarroSedan carro4 = new CarroSedan(14, "Toyota",  "Corolla", 2020, 0, 50);
        CarroSedan carro5 = new CarroSedan(15, "Honda",  "Civic", 2020, 0, 50);
        CarroSedan carro6 = new CarroSedan(16, "Nissan", "Sentra", 2020, 0, 50);

        CarroSuv carro7 = new CarroSuv(17, "Jeep", "Compass", 2020, 0, 60, 350); ///
        CarroSuv carro8 = new CarroSuv(18, "Ford", "EcoSport", 2020, 0, 60, 450);
        CarroSuv carro9 = new CarroSuv(19, "Renault", "Duster", 2020, 0, 60, 500);

        GestaoFrota gestaofrota = new GestaoFrota();
        GestaoMotoristas gestaomotoristas = new GestaoMotoristas();
        GestaoEletropostos gestaoeletropostos = new GestaoEletropostos();
        //GestaoCarregamento gestaocarregamento = new GestaoCarregamento();

        // Criando a lista de carros
        gestaofrota.adicionarCarro(carro1);
        gestaofrota.adicionarCarro(carro2);
        gestaofrota.adicionarCarro(carro3);
        gestaofrota.adicionarCarro(carro4);
        gestaofrota.adicionarCarro(carro5);
        gestaofrota.adicionarCarro(carro6);
        gestaofrota.adicionarCarro(carro7);
        gestaofrota.adicionarCarro(carro8);
        gestaofrota.adicionarCarro(carro9);
        gestaofrota.listarCarros();

        // Criando a lista de motoristas
        gestaomotoristas.adicionarMotorista(motorista1);
        gestaomotoristas.adicionarMotorista(motorista2);
        gestaomotoristas.adicionarMotorista(motorista3);
        gestaomotoristas.listarMotoristas();

        gestaoeletropostos.adicionarEletropostos(eletroposto1);
        gestaoeletropostos.adicionarEletropostos(eletroposto2);
        gestaoeletropostos.adicionarEletropostos(eletroposto3);
        gestaoeletropostos.adicionarEletropostos(eletroposto4);
        gestaoeletropostos.adicionarEletropostos(eletroposto5);
        gestaoeletropostos.listarEletropostos();
    }
}
