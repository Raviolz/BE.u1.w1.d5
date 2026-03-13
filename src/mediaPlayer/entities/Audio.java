package mediaPlayer.entities;

public class Audio extends MultimediaElement {

    //lista attributi

    private int volume;

    // lista costruttori

    public Audio(String titleInput, int volumeInput) {
        super(titleInput);
        this.volume = volumeInput;
    }

    // lista metodi

    public int getVolume() {
        return volume;
    }

    // override

    @Override
    public String toString() {
        return super.toString() + " Volume: " + volume;
    }
}
