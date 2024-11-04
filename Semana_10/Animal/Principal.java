package Semana_10.Animal;

public class Principal {
    public void emitirSom(Animal a) {
        a.som();
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        Gato g = new Gato();
        Cachorro c = new Cachorro();
        p.emitirSom(g);
        p.emitirSom(c);
    }
}
