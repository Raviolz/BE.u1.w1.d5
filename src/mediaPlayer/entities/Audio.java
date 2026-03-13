package mediaPlayer.entities;

import mediaPlayer.interfaces.Playable;

public class Audio extends MultimediaElement implements Playable {

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

    // override per sout

    @Override
    public String toString() {
        return super.toString() + " Volume: " + volume + "Duration:" + duration;
    }

    // ovverride per interfaccia playable

    @Override
    public void play() {
        System.out.println("I'm playing audio:" + getTitle());
    }
}
