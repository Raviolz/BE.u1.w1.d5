package mediaPlayer.entities;

import mediaPlayer.interfaces.HasVolume;
import mediaPlayer.interfaces.Playable;

public class Audio extends MultimediaElement implements Playable, HasVolume {

    //lista attributi

    private int duration;
    private int volume;

    // lista costruttori

    public Audio(String titleInput, int durationInput, int volumeInput) {
        super(titleInput);
        this.duration = durationInput;
        this.volume = volumeInput;
    }

    // METODI

    public int getVolume() {
        return volume;
    }

    public int getDuration() {
        return duration;
    }

    // override per SOUT

    @Override
    public String toString() {
        return super.toString() + " Volume: " + volume + " Duration:" + duration;
    }

    // ovverride per interfaccia PLAYABLE

    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {

            System.out.print(getTitle());

            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            // nota per me: solo print non va a capo
            System.out.println();  // aggiunta per estetica per gestire ordine e a capo
        }
    }
    // override per HASVOLUME

    public void increaseVolume(int howMuch) {
        this.volume += howMuch;
    }

    @Override
    public void decreaseVolume(int howMuch) {
        this.volume -= howMuch;
    }
}
