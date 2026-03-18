package OOP.Interfaz.SistemaDispositivosReproducibles;

public class Radio extends Dispositivo implements Reproducible {

    public Radio(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void reproducir() {
        System.out.println("La radio " + marca + " modelo " + modelo + " Reproduciendo emisora de radio");
    }
}
