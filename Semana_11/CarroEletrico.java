package Semana_11;

// Classe mãe: CarroEletrico
public class CarroEletrico {
    private int id;
    private String marca;
    private String modelo;
    private int anoFab;
    private int quilometragem;
    private int autonomiaRestante;
    private int capBateria;
    private int maxAuto;
 
    // Construtor
    public CarroEletrico(int id, String marca, String modelo, int anoFab, int quilometragem, int capBateria, int maxAuto) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.quilometragem = quilometragem;
        this.autonomiaRestante = maxAuto;
        this.capBateria = capBateria;
        this.maxAuto = maxAuto;
    }

    // Getters e Setters 
    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public int getAutonomiaRestante() {
        return autonomiaRestante;
    }

    public int getCapBateria() {
        return capBateria;
    }

    public int getMaxAuto() {
        return maxAuto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setAutonomiaRestante(int autonomiaRestante) {
        this.autonomiaRestante = autonomiaRestante;
        if (this.autonomiaRestante < 0) {
            this.autonomiaRestante = 0;
        }
    }

    public void setCapBateria(int capBateria) {
        this.capBateria = capBateria;
    }

    public void setMaxAuto(int maxAuto) {
        this.maxAuto = maxAuto;
    }
}