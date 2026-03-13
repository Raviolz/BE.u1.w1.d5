package mediaPlayer.entities;

public abstract class MultimediaElement {
    // lista attributi
    private String title;


    // lista costruttore da ereditare non da usare perche'astratto
    public MultimediaElement(String titleInput) {
        this.title = titleInput;
    }

    // lista metodi

    public String getTitle() {
        return title;
    }

    @Override  // override per lettura migliore
    public String toString() {
        return "Title: " + title;
    }
}
