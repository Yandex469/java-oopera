package show;

import person.Actor;
import person.Director;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public Show() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void getListOfActors() {
        System.out.println("Актеры спектакля:");
        for (Actor actor: listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void setlistOfActors(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Данный актер уже есть!");
                return;
            }
        }
        listOfActors.add(newActor);
    }

    public void changelistOfActors(Actor newActor, String pastSurname) {
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(pastSurname)) {
                listOfActors.remove(actor);
                System.out.printf("Актер: %s удален!%n", actor.getSurname());
                listOfActors.add(newActor);
                System.out.printf("Актер: %s добавлен!%n", newActor.getSurname());
                return;
            }
        }
        System.out.printf("Актер с фамилией '%s' не найден!%n",
                pastSurname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return duration == show.duration &&
                Objects.equals(title, show.title) &&
                Objects.equals(director, show.director) &&
                Objects.equals(listOfActors, show.listOfActors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, duration, director);
        result = 31 * result + listOfActors.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director='" + director + '\'' +
                ", listOfActors=" + Arrays.toString(listOfActors.toArray()) +
                '}';
    }
}
