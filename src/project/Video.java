package project;

public class Video extends Riproducibile implements Luminosita {

    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("valore non compreso nel range richiesto!");
        }
    }

    @Override
    public void alzaVolume() {
        if (volume < 15) {
            volume++;
        } else {
            System.out.println("valore non compreso nel range richiesto!");
        }
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

    @Override
    public void play() {
        System.out.println(getTitolo() + " " + "!".repeat(volume) + " " + "*".repeat(luminosita));
    }
}
