public class Theatre {
    public static void main(String[] args) {

        Actor actorIvan = new Actor("Иван","Иванов", Gender.MALE, 182);
        Actor actorAnna = new Actor("Анна","Смирнова", Gender.FEMALE, 168);
        Actor actorPetr = new Actor("Пётр","Сидоров", Gender.MALE, 175);

        Director directorConstantin = new Director(
                "Константин", "Станиславский", Gender.MALE, 45);
        Director directorGalina = new Director(
                "Галина", "Волчек", Gender.FEMALE, 38);

        MusicalShow musicalAuthorTchaikovsky = new MusicalShow(
                "Пётр", "Чайковский");

        Ballet choreographerLev = new Ballet("Лев", "Иванов");

        Show show = new Show("Снегурочка",140, directorConstantin);
        Ballet ballet = new Ballet(musicalAuthorTchaikovsky, choreographerLev,
                "Действие происходит в старинном замке. \n"
                        + "Принц Зигфрид празднует совершеннолетие и \n"
                        + "отправляется на охоту к лесному озеру, где встречает \n"
                        + "заколдованную девушку-лебедя Одетту...\n");
        Opera opera = new Opera(musicalAuthorTchaikovsky, 120,
                "Юная Татьяна Ларина влюбляется в столичного \n" +
                        "дворянина Евгения Онегина и пишет ему \n"
                        + "трогательное письмо, но получает холодный отказ. \n" +
                        "Спустя годы Онегин встречает \n"
                        + "Татьяну в Петербурге уже замужней светской дамой, \n" +
                        "осознаёт свою ошибку, \n"
                        + "но теперь уже она отвергает его ради верности долгу...\n");

        System.out.println("Поехали!");

        show.setlistOfActors(actorIvan);
        show.setlistOfActors(actorAnna);
        show.getListOfActors();

        ballet.setlistOfActors(actorPetr);
        ballet.setlistOfActors(actorAnna);
        ballet.getListOfActors();

        opera.setlistOfActors(actorIvan);
        opera.getListOfActors();

        System.out.println("-".repeat(25));

        System.out.printf("Замена актера спектакля %s на %s!%n",
                actorAnna.getSurname(), actorPetr.getName());
        show.changelistOfActors(actorPetr, "Смирнова");
        show.getListOfActors();

        System.out.printf("Замена 'несуществующего' актера балета %s на %s!%n",
                actorIvan.getName(), actorPetr.getName());
        ballet.changelistOfActors(actorIvan, "Сидоров");
        ballet.getListOfActors();

        System.out.println("-".repeat(25));

        System.out.println("Вывод либретто оперы:");
        System.out.println(opera.getLibrettoText());

        System.out.println("Вывод либретто балета:");
        System.out.println(ballet.getLibrettoText());

    }
}
