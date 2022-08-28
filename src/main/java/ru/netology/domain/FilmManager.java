package ru.netology.domain;

public class FilmManager {
    FilmItem newName;
    int limit = 7;

    private FilmManager repo;

    public FilmManager(FilmManager repo) {
        this.repo = repo;
    }

    public void add(FilmItem item) {
        repo.save(item);
    }


    private FilmItem[] items = new FilmItem[0];

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public FilmManager() {
        this.limit = limit;
    }

    public void save(FilmItem item) {
        FilmItem[] tmp = new FilmItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public void addNewFilm(FilmItem item) {
        FilmItem[] tmp = new FilmItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public FilmItem[] getItems() {
        return items;
    }

    public void findAll() {
        String[] items = {
                "Бладшот",
                "Вперед",
                "Отель «Белград»",
                "Джентельмены",
                "Человек-невидимка",
                "Тролли. Мировой тур",
                "Номер один"
        };
        for (int i = 0; i < limit; i++) {
            System.out.println(items[i]);
        }
    }

    public FilmItem[] findLast() {
        int resultLength;
        if (limit == 5) {
            resultLength = 5;
        } else {
            resultLength = 7;
        }
        String[] items = {
                "Бладшот",
                "Вперед",
                "Отель «Белград»",
                "Джентельмены",
                "Человек-невидимка",
                "Тролли. Мировой тур",
                "Номер один"
        };
        FilmItem[] all = getItems();
        FilmItem[] reversed = new FilmItem[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - resultLength];
        }
        return reversed;
    }
}
