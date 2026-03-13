import project.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Che tipo di elemento vuoi creare?");
            System.out.println("1 - Video");
            System.out.println("2 - Audio");
            System.out.println("3 - Immagine");

            int scelta = Integer.parseInt(scanner.nextLine());

            System.out.print("Titolo: ");
            System.out.println();
            String titolo = scanner.nextLine();

            switch (scelta) {
                case 1 -> {
                    System.out.print("Durata (0-60 secondi): ");
                    int durata = Integer.parseInt(scanner.nextLine());
                    durata = (durata < 0) ? 0 : Math.min(durata, 60);
                    System.out.print("Volume (0-15): ");
                    int volume = Integer.parseInt(scanner.nextLine());
                    volume = (volume < 0) ? 0 : Math.min(volume, 15);
                    System.out.print("Luminosità (0-10): ");
                    int luminosita = Integer.parseInt(scanner.nextLine());
                    luminosita = (luminosita < 0) ? 0 : Math.min(luminosita, 10);
                    elementi[i] = new Video(titolo, durata, volume, luminosita);
                }
                case 2 -> {
                    System.out.print("Durata (in secondi): ");
                    int durata = Integer.parseInt(scanner.nextLine());
                    durata = (durata < 0) ? 0 : Math.min(durata, 60);
                    System.out.print("Volume (0-15): ");
                    int volume = Integer.parseInt(scanner.nextLine());
                    volume = (volume < 0) ? 0 : Math.min(volume, 15);
                    elementi[i] = new RegistrazioneAudio(titolo, durata, volume);
                }
                case 3 -> {
                    System.out.println("Luminosità (0-10): ");
                    int luminosita = Integer.parseInt(scanner.nextLine());
                    luminosita = (luminosita < 0) ? 0 : Math.min(luminosita, 10);
                    elementi[i] = new Immagine(titolo, luminosita);
                }
                default -> {
                    System.out.println("Scelta non valida, scegli uno tra i numeri richiesti!");
                    return;
                }
            }
            System.out.println();
        }

        System.out.println("Visualizzazione degli elementi:");
        for (ElementoMultimediale e : elementi) {
            if (e instanceof Riproducibile r) {
                r.play();
            } else if (e instanceof Immagine img) {
                img.show();
            }
            System.out.println();
        }

        System.out.print("Quale elemento vuoi stampare? (1-5, 0 per uscire): ");
        int indice = Integer.parseInt(scanner.nextLine());

        if (indice == 0) {
            System.out.println("Programma spento");
            scanner.close();
            return;
        }

        indice = indice - 1;

        if (indice >= 0 && indice < elementi.length) {
            ElementoMultimediale e = elementi[indice];

            if (e instanceof Riproducibile) {
                ((Riproducibile) e).play();
            } else if (e instanceof Immagine) {
                ((Immagine) e).show();
            }
        } else {
            System.out.println("Indice non valido!");
        }

        scanner.close();

        // Test Video
//        Video v = new Video("Film", 10, 3, 5);
//        v.alzaVolume();
//        System.out.println("Volume attuale: " + v.getVolume());
//        v.aumentaLuminosita();
//        v.play();
//        System.out.println("Luminosità attuale: " + v.getLuminosita());
//
//        // Test Audio
//        RegistrazioneAudio a = new RegistrazioneAudio("Canzone", 5, 2);
//        a.abbassaVolume();
//        a.play();
//        System.out.println("Luminosità attuale: " + a.getVolume());
//
//        // Test Immagine
//        Immagine img = new Immagine("Foto", 7);
//        img.aumentaLuminosita();
//        img.show();
//        System.out.println("lum attuale: " + img.getLuminosita());
    }
}