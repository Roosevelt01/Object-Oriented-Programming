package OOP.Interfaz.Projectbrief;

public class Main {
    public static void main(String[] args) {
        Playable playable1 = new Guitar();
        Playable playable2 = new Piano();

        playable1.play();
        playable2.play();
    }
}
