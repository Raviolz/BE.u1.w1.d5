package mediaPlayer;

import mediaPlayer.entities.Audio;
import mediaPlayer.entities.Image;
import mediaPlayer.entities.Video;

public class Main {
    static void main(String[] args) {

        // test creazione e visualizzazione

        Audio a1 = new Audio("Rebellion (lies) ", 5, 8);
        Video v1 = new Video("Thailand-2025", 7, 6, 5);
        Image i1 = new Image("Grigio con zampe incrociate ", 8);

        System.out.println(a1);
        System.out.println(v1);
        System.out.println(i1);

        // test creazione con scanner
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il titolo del brano:");
        String title = scanner.nextLine();

        System.out.println("Inserisci volume a cui riprodurlo:");
        int volume = Integer.parseInt(scanner.nextLine());

        System.out.println("Inserisci la sua lunghezza:");
        int duration = Integer.parseInt(scanner.nextLine());

        Audio a2 = new Audio(title, volume, duration);
        System.out.println(a2);
*/

        // test per interfaccia playable

        //  a2.play();
        v1.play();
        a1.play();

        // test per incr/decr Volume

        v1.decreaseVolume(5);
        System.out.println(v1);
        v1.increaseVolume(1);
        System.out.println(v1);

        a1.decreaseVolume(6);
        System.out.println(a1);
        a1.increaseVolume(1);
        System.out.println(a1);

        // test play() post incr/decr Volume

        v1.play();
        a1.play();


        // test per incr/decr Brightness
        System.out.println(i1);
        i1.decreaseBrightness(3);
        System.out.println(i1);
        i1.increaseBrightness(2);
        System.out.println(i1);

        System.out.println(v1);
        v1.decreaseBrightness(2);
        System.out.println(v1);
        v1.increaseBrightness(4);
        System.out.println(v1);


        // test play() post incr/decr Brightness

        v1.play();


        // test per show()
        
        System.out.println(i1);
        i1.show();
    }


}
