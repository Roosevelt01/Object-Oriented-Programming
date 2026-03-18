package OOP.Interfaz.SistemaDispositivosReproducibles;

public class Computadora extends Dispositivo implements Reproducible{

    public Computadora(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo audio en la computadora");
    }
}
