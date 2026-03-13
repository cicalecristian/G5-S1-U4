package project;

public class Immagine extends ElementoMultimediale implements Luminosita {

    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    @Override
    public void aumentaLuminosita() {
        if (luminosita < 15) luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) luminosita--;
    }

    @Override
    public void setLuminosita() {
        System.out.println("Luminosità: " + "*".repeat(luminosita));
    }

    public void show() {
        for (int i = 0; i < luminosita; i++) {
            System.out.println(getTitolo() + "!".repeat(luminosita));
        }
    }
}
