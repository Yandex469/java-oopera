import java.util.Objects;

public class MusicalShow extends Show {
    protected String musicAuthorName;
    protected String musicAuthorSurname;
    protected String librettoText;

    public MusicalShow(String musicAuthorName, String musicAuthorSurname) {
        this.musicAuthorName = musicAuthorName;
        this.musicAuthorSurname = musicAuthorSurname;
        this.librettoText = librettoText;
    }

    public MusicalShow() {}

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public String getMusicAuthorName() {
        return musicAuthorName;
    }

    public void setMusicAuthorName(String musicAuthorName) {
        this.musicAuthorName = musicAuthorName;
    }

    public String getMusicAuthorSurname() {
        return musicAuthorSurname;
    }

    public void setMusicAuthorSurname(String musicAuthorSurname) {
        this.musicAuthorSurname = musicAuthorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicalShow that = (MusicalShow) o;
        return Objects.equals(musicAuthorName, that.musicAuthorName) &&
                Objects.equals(musicAuthorSurname, that.musicAuthorSurname) &&
                Objects.equals(librettoText, that.librettoText);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(musicAuthorName, musicAuthorSurname, librettoText);
        result = 31 * result + musicAuthorName.hashCode();
        result = 33 * result + musicAuthorSurname.hashCode();
        result = 35 * result + librettoText.hashCode();
        return result;
    }

    @Override
    public String toString() {
        String result = "MusicalShow{" +
                "musicAuthorName='" + musicAuthorName + '\'' +
                ", musicAuthorSurname='" + musicAuthorSurname + '\'';
                if (librettoText != null) {
                    result += ", librettoText='" + librettoText.length();
                } else {
                    result += ", librettoText=null";
                }
        return result += '}';
    }
}
