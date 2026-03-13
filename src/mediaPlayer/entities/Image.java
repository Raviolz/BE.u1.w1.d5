package mediaPlayer.entities;

import mediaPlayer.interfaces.HasBrightness;

public class Image extends MultimediaElement implements HasBrightness {

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

    public void show() {
        System.out.print(getTitle());
        for (int i = 0; i < brightness; i++) {
            System.out.print("*");
        }

    }


    // override per sout

    @Override
    public String toString() {
        return super.toString() + " Brightness: " + brightness;
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

