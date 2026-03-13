package mediaPlayer.entities;

public class Image extends MultimediaElement {

    // lista attributi

    private int brightness;

    // costruttore

    public Image(String titleInput, int brightnessInput) {
        super(titleInput);
        this.brightness = brightnessInput;
    }

    // METODI


    public int getBrightness() {
        return brightness;
    }


    // override per sout

    @Override
    public String toString() {
        return super.toString() + " Brightness: " + brightness;
    }
}
