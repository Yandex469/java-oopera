package show;

import person.Actor;

public class Ballet extends MusicalShow {
    private String choreographerName;
    private String choreographerSurname;

    public Ballet(String musicAuthorName, String musicAuthorSurname,
                  String choreographerName, String choreographerSurname) {
        super(musicAuthorName, musicAuthorSurname);
        this.choreographerName = choreographerName;
        this.choreographerSurname = choreographerSurname;
    }

    public Ballet(String musicAuthorName, String musicAuthorSurname) {
        this.musicAuthorName = musicAuthorName;
        this.musicAuthorSurname = musicAuthorSurname;
    }

    public Ballet(MusicalShow musicalAuthor, Ballet ballet, String librettoText) {
        super(musicalAuthor.getMusicAuthorName(),
                musicalAuthor.getMusicAuthorSurname());
        this.choreographerName = ballet.choreographerName;
        this.choreographerSurname = ballet.choreographerSurname;
        this.librettoText = librettoText;
    }

    @Override
    public void getListOfActors() {
        System.out.println("Артисты балета:");
        for (Actor actor: listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public String getChoreographerName() {
        return choreographerName;
    }

    public void setChoreographer(String choreographerName) {
        this.choreographerName = choreographerName;
    }

    public String getChoreographerSurname() {
        return choreographerSurname;
    }

    public void setChoreographerSurname(String choreographerSurname) {
        this.choreographerSurname = choreographerSurname;
    }
}
