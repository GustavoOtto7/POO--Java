package Semana_11;

public class CarroEletrico {
    private int id;
    private String marca;
    private String modelo;
    private int anoFab;
    private int capBateria;
    private int maxAuto;

    public CarroEletrico(int id, String marca, String modelo, int anoFab, int capBateria, int maxAuto) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.capBateria = capBateria;
        this.maxAuto = maxAuto;
    }

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

    public void setCapBateria(int capBateria) {
        this.capBateria = capBateria;
    }

    public void setMaxAuto(int maxAuto) {
        this.maxAuto = maxAuto;
    }
}