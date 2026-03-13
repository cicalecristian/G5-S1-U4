package project;

public abstract class Riproducibile extends ElementoMultimediale {
    protected int durata;
    protected int volume;

    public Riproducibile(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public abstract void play();

    public abstract void abbassaVolume();

    public abstract void alzaVoume();
}
