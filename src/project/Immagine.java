package project;

public class Immagine extends ElementoMultimediale implements Luminosita {

    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    @Override
    public void aumentaLuminosita() {
        if (luminosita < 15) {
            luminosita++;
        } else {
            System.out.println("valore non compreso nel range richiesto!");
        }
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        } else {
            System.out.println("valore non compreso nel range richiesto!");
        }
    }

    public void show() {
        System.out.println(getTitolo() + " " + "*".repeat(luminosita));
    }
}
