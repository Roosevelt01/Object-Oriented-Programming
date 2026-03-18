package OOP.Interfaz.SistemaDispositivosReproducibles;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Reproducible radio = new Radio("Sangean", "WR-16");
        Reproducible telefono = new Telefono("Samsung", "Galaxy S24 Ultra");
        Reproducible computadora = new Computadora("Apple", "MacBook Air (M3)");

        List<Reproducible> equipos = List.of(radio,telefono,computadora);

        for(Reproducible equipo : equipos) {
            equipo.reproducir();
        }
    }
}
