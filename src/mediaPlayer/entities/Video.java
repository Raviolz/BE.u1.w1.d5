package mediaPlayer.entities;

import mediaPlayer.interfaces.HasBrightness;
import mediaPlayer.interfaces.HasVolume;
import mediaPlayer.interfaces.Playable;

public class Video extends MultimediaElement implements Playable, HasVolume, HasBrightness {

    //lista attributi

    private int duration;
    private int volume;
    private int brightness;

    // costruttori

    public Video(String titleInput, int durationInput, int volumeInput, int brightnessInput) {
        super(titleInput);
        this.duration = durationInput;
        this.volume = volumeInput;
        this.brightness = brightnessInput;
    }

    // METODI


    public int getVolume() {
        return volume;
    }

    public int getBrightness() {
        return brightness;
    }

    public int getDuration() {
        return duration;
    }

    //override per sout

    @Override
    public String toString() {
        return super.toString() + " Volume: " + volume + " Brightness: " + brightness + " Duration:" + duration;
    }


    // ovverride per interfaccia playable

    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {

            System.out.print(getTitle());

            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }

            for (int x = 0; x < brightness; x++) {
                System.out.print("*");
            }
            // nota per me: solo print non va a capo
            System.out.println();  // aggiunta per estetica per gestire ordine e a capo
        }
    }

    // override per interfaccia HasVolume

    @Override
    public void increaseVolume(int howMuchInput) {
        this.volume += howMuchInput;
    }

    @Override
    public void decreaseVolume(int howMuchInput) {
        this.volume -= howMuchInput;
    }

    // override per HASBRIGHTNESS

    @Override
    public void increaseBrightness(int howMuch) {
        this.brightness += howMuch;
    }

    @Override
    public void decreaseBrightness(int howMuch) {
        this.brightness -= howMuch;
    }
}

