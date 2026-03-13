package project;

public abstract class Riproducibile extends ElementoMultimediale {
    protected int durata;
    protected int volume;

    public Riproducibile(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int getDurata() {
        return durata;
    }

    public void play() {
        System.out.println(getTitolo() + " " + "!".repeat(volume));
    }

    public abstract void abbassaVolume();

    public abstract void alzaVolume();
}
