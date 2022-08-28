package ru.netology.domain;
public class FilmItem {
    private String item;
    public FilmItem (String item) {
        this.item = item;
    }


    public String getItems() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
