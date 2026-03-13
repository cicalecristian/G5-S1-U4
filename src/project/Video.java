package project;

public class Video extends Riproducibile implements Luminosita {

    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }

    @Override
    public void abbassaVolume() {
        if (volume < 15) volume--;
    }

    @Override
    public void alzaVolume() {
        if (volume > 0) volume++;
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
}
