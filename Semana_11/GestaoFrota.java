package Semana_11;

import java.util.ArrayList;
import java.util.List;

public class GestaoFrota {
    private List<CarroEletrico> frota; // Lista que armazena todos os carros elétricos

    public GestaoFrota() {
        this.frota = new ArrayList<>();
    }

    // Método para adicionar um carro à frota
    public void adicionarCarro(CarroEletrico carro) { 
        frota.add(carro);
        System.out.println("Carro adicionado à frota: " + carro.getModelo() + "com o ID: " + carro.getId());
    }

    public boolean removerCarro(int id) {
        for (CarroEletrico carro : frota) {
            if (carro.getId() == id) {
                frota.remove(carro);
                System.out.println("Carro removido da frota: " + carro.getModelo() + "com o ID: " + carro.getId());
                return true;
            }
        }
        System.out.println("Carro com ID: " + id + " não encontrado.");
        return false;
    }

     // Método para listar todos os carros da frota
     public void listarCarros() {
        if (frota.isEmpty()) {
            System.out.println("Nenhum carro na frota.");
        } else {
            System.out.println("Carros elétricos na frota: ");
            for (CarroEletrico carro : frota) {
                System.out.println("ID: " + carro.getId() + ", Modelo: " + carro.getModelo() + ", Autonomia: " + carro.getMaxAuto() + " km");
            }
        }
    }
}