package mediaPlayer.entities;

public class Video extends MultimediaElement {

    //lista attributi

    private int volume;
    private int brightness;

    // costruttori

    public Video(String titleInput, int volumeInput, int brightnessInput) {
        super(titleInput);
        this.volume = volumeInput;
        this.brightness = brightnessInput;
    }

    // metodi


    public int getVolume() {
        return volume;
    }

    public int getBrightness() {
        return brightness;
    }

    //override

    @Override
    public String toString() {
        return super.toString() + " Volume: " + volume + " Brightness: " + brightness;
    }
}
