package mediaPlayer;

import mediaPlayer.entities.Audio;
import mediaPlayer.entities.Image;
import mediaPlayer.entities.MultimediaElement;
import mediaPlayer.entities.Video;
import mediaPlayer.interfaces.Playable;

import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);
   /*     System.out.println("Inserisci il titolo del brano:");
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


        // CREAZIONE ARRAY

        Video v2 = new Video("Islanda-2024", 5, 2, 5);
        Image i2 = new Image("Cactus nuovo acquisto", 7);

//        MultimediaElement[] mixMediaArr = new MultimediaElement[5];
//        mixMediaArr[0] = i1;
//        mixMediaArr[1] = v1;
//        mixMediaArr[2] = a1;
//        mixMediaArr[3] = new Video("Islanda-2024", 5, 2, 5);
//        mixMediaArr[4] = i2;


        MultimediaElement[] mixMediaArr = {
                i1,
                v1,
                a1,
                new Video("Islanda-2024", 5, 2, 5),
                i2
        };


        int chosenNumber;

        do {
            System.out.println("Scegli un file da 1 a 5, 0 per terminare: ");
            chosenNumber = Integer.parseInt(scanner.nextLine());

            if (chosenNumber >= 1 && chosenNumber <= 5) {

                MultimediaElement selected = mixMediaArr[chosenNumber - 1];

                // casting se no non capisce classe e non fa usare metodo

                if (selected instanceof Playable) {
                    Playable playableElement = (Playable) selected;
                    playableElement.play();
                } else {
                    Image imageElement = (Image) selected;
                    imageElement.show();
                }

            }

        } while (chosenNumber != 0);


    }

}

