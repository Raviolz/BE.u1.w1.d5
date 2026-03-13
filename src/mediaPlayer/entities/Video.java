package mediaPlayer.entities;

import mediaPlayer.interfaces.HasVolume;
import mediaPlayer.interfaces.Playable;

public class Video extends MultimediaElement implements Playable, HasVolume {

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
        System.out.println("I'm playing video: " + getTitle());

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
}
