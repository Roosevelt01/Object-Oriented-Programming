package OOP.Interfaz.SistemaDispositivosReproducibles;

public class Telefono extends Dispositivo implements Reproducible{

    public Telefono(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo música en el teléfono");
    }
}
