package show;

import person.Actor;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String musicAuthorName, String musicAuthorSurname, int choirSize) {
        super(musicAuthorName, musicAuthorSurname);
        this.choirSize = choirSize;
    }

    public Opera(MusicalShow musicalAuthor, int choirSize, String librettoText) {
        super(musicalAuthor.getMusicAuthorName(),
                musicalAuthor.musicAuthorSurname);
        this.choirSize = choirSize;
        this.librettoText = librettoText;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }

    @Override
    public void getListOfActors() {
        System.out.println("Оперные певцы:");
        for (Actor actor: listOfActors) {
            System.out.println(actor.toString());
        }
    }
}
