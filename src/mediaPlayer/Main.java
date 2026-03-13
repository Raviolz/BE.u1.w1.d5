package mediaPlayer;

import mediaPlayer.entities.Audio;
import mediaPlayer.entities.Image;
import mediaPlayer.entities.Video;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        // test creazione e visualizzazione

        Audio a1 = new Audio("Rebellion (lies) ", 93);
        Video v1 = new Video("Thailand-2025", 28, 89);
        Image i1 = new Image("Grigio con zampe incrociate ", 91);

        System.out.println(a1);
        System.out.println(v1);
        System.out.println(i1);

        // test creazione con scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il titolo del brano:");
        String title = scanner.nextLine();

        System.out.println("Inserisci volume a cui riprodurlo:");
        int volume = Integer.parseInt(scanner.nextLine());

        Audio a2 = new Audio(title, volume);
        System.out.println(a2);
    }
}
