package project;

public class RegistrazioneAudio extends Riproducibile {

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata, volume);
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
}
