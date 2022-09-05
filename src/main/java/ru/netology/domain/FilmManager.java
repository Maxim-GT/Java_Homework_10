package ru.netology.domain;

public class FilmManager {
    private int limit;

    public FilmItem[] getItems() {
        return items;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public FilmManager() {
        limit = 10;
    }

    private FilmItem[] items = new FilmItem[0];

    public void addNewFilm(FilmItem item) {
        FilmItem[] tmp = new FilmItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public FilmItem[] findAll() {

        return items;
    }

    public FilmItem[] findLast() {
        int resultLength;
        if (limit < items.length) {
            resultLength = limit;
        } else {
            resultLength = items.length;
        }

        FilmItem[] reversed = new FilmItem[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }
}
