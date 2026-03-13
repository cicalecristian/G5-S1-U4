package project;

public class RegistrazioneAudio extends Riproducibile {

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata, volume);
    }

    @Override
    public void abbassaVolume() {
        if (volume < 15) volume--;
    }

    @Override
    public void alzaVolume() {
        if (volume > 0) volume++;
    }
}
