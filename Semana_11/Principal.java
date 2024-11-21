package Semana_11;

// Classe Principal onde o Sistema irá funcionar
public class Principal {
    public static void main(String[] args) {
        // Criando motoristas
        Motorista motorista1 = new Motorista("João", 1, 111, Motorista.NivelExperiencia.INICIANTE);
        Motorista motorista2 = new Motorista("Maria", 2, 222, Motorista.NivelExperiencia.INTERMEDIARIO);
        Motorista motorista3 = new Motorista("Carlos", 3, 333, Motorista.NivelExperiencia.AVANCADO);
        
        // Criando eletropostos
        Eletropostos eletroposto1 = new Eletropostos(1, "Rua Alpha", 2, 4, 170);
        Eletropostos eletroposto2 = new Eletropostos(2, "Avenida Beta", 3, 4, 210);
        Eletropostos eletroposto3 = new Eletropostos(3, "Praça Gama", 2, 4, 320);
        Eletropostos eletroposto4 = new Eletropostos(4, "Rua Delta", 3, 4, 450);
        Eletropostos eletroposto5 = new Eletropostos(5, "Estrada Elipsum", 3, 4, 570);

        // Criando carros
        CarroCompacto carro1 = new CarroCompacto(11, "Chevrolet", "Bolt EV", 2020, 0, 40);
        CarroCompacto carro2 = new CarroCompacto(12, "Fiat ", "500e", 2020, 0, 40);
        CarroCompacto carro3 = new CarroCompacto(13, "Mini Cooper", "Mini SE", 2020, 0, 40);
        
        CarroSedan carro4 = new CarroSedan(14, "Tesla",  "Model 3", 2020, 0, 50);
        CarroSedan carro5 = new CarroSedan(15, "Hyundai ",  "Ioniq 6", 2020, 0, 50);
        CarroSedan carro6 = new CarroSedan(16, "BMW ", "i4", 2020, 0, 50);

        CarroSuv carro7 = new CarroSuv(17, "Tesla", "Model Y", 2020, 0, 60, 350); ///
        CarroSuv carro8 = new CarroSuv(18, "Kia", "EV6", 2020, 0, 60, 450);
        CarroSuv carro9 = new CarroSuv(19, "Ford", "Mustang Mach-E", 2020, 0, 60, 500);

        GestaoMotoristas gestaomotoristas = new GestaoMotoristas();
        GestaoEletropostos gestaoeletropostos = new GestaoEletropostos();
        GestaoFrota gestaofrota = new GestaoFrota();
        GestaoCarregamento gestaocarregamento = new GestaoCarregamento();
        
        // Criando a lista de motoristas
        System.out.println("ADICIONANDO MOTORISTAS:");
        gestaomotoristas.adicionarMotorista(motorista1);
        gestaomotoristas.adicionarMotorista(motorista2);
        gestaomotoristas.adicionarMotorista(motorista3);
        gestaomotoristas.removerMotorista(3);
        gestaomotoristas.adicionarMotorista(motorista3);
        System.out.println("-------------------");
        gestaomotoristas.listarMotoristas();
        System.out.println("-------------------\n");

        // Criando a lista de eletropostos
        System.out.println("ADICIONANDO ELETROPOSTOS:");        
        gestaoeletropostos.adicionarEletropostos(eletroposto1);
        gestaoeletropostos.adicionarEletropostos(eletroposto2);
        gestaoeletropostos.adicionarEletropostos(eletroposto3);
        gestaoeletropostos.adicionarEletropostos(eletroposto4);
        gestaoeletropostos.adicionarEletropostos(eletroposto5);
        gestaoeletropostos.removerEletropostos(5);
        gestaoeletropostos.adicionarEletropostos(eletroposto5);
        System.out.println("-------------------");
        gestaoeletropostos.listarEletropostos();
        System.out.println("-------------------\n");

        // Criando a lista de carros
        System.out.println("ADICIONANDO VEÍCULOS:");
        gestaofrota.adicionarCarro(carro1);
        gestaofrota.adicionarCarro(carro2);
        gestaofrota.adicionarCarro(carro3);
        gestaofrota.adicionarCarro(carro4);
        gestaofrota.adicionarCarro(carro5);
        gestaofrota.adicionarCarro(carro6);
        gestaofrota.adicionarCarro(carro7);
        gestaofrota.adicionarCarro(carro8);
        gestaofrota.adicionarCarro(carro9);
        gestaofrota.removerCarro(19);
        gestaofrota.adicionarCarro(carro9);
        System.out.println("-------------------");
        gestaofrota.listarCarros();
        System.out.println("-------------------\n");

        // Criando viagens
        Viagem viagem1 = new Viagem(motorista1, carro1, "Porto Alegre", 300);
        Viagem viagem2 = new Viagem(motorista2, carro3, "Alegrete", 350);
        Viagem viagem3 = new Viagem(motorista3, carro4, "Uruguaiana", 400);
        Viagem viagem4 = new Viagem(motorista1, carro6, "Panambi", 450);
        Viagem viagem5 = new Viagem(motorista2, carro7, "Pelotas", 500);
        Viagem viagem6 = new Viagem(motorista2, carro9, "Capão da Canoa", 700);

        // Iniciando as viagens
        System.out.println("INICIANDO VIAGENS");
        viagem1.iniciarViagem(gestaoeletropostos.listaEletropostos, gestaocarregamento);
        System.out.println("-------------------");
        viagem2.iniciarViagem(gestaoeletropostos.listaEletropostos, gestaocarregamento);
        System.out.println("-------------------");
        viagem3.iniciarViagem(gestaoeletropostos.listaEletropostos, gestaocarregamento);
        System.out.println("-------------------");
        viagem4.iniciarViagem(gestaoeletropostos.listaEletropostos, gestaocarregamento);
        System.out.println("-------------------");
        viagem5.iniciarViagem(gestaoeletropostos.listaEletropostos, gestaocarregamento);
        System.out.println("-------------------");
        viagem6.iniciarViagem(gestaoeletropostos.listaEletropostos, gestaocarregamento);
        System.out.println("-------------------");

        // Exibindo Histórico de Viagem
        System.out.println("\nHistórico de Viagens:");
        viagem1.listaHistoricoViagem();
        viagem2.listaHistoricoViagem();
        viagem3.listaHistoricoViagem();
        viagem4.listaHistoricoViagem();
        viagem5.listaHistoricoViagem();
        viagem6.listaHistoricoViagem();
        System.out.println("-------------------\n");

        // Métodos adicionais
        System.out.println("-------------------");
        gestaocarregamento.listarVeiculosComBaixaAutonomia(gestaofrota.frota);
        System.out.println("-------------------");
        gestaocarregamento.listarCarrosParaManutencao(gestaofrota.frota);
        System.out.println("-------------------");
        gestaocarregamento.listarHistoricoRecargas();
    }
}