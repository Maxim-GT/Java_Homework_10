package ru.netology.domain;
public class FilmItem {
    private String name;
    public FilmItem (String name) {
        this.name = name;
    }


    public String getItems() {
        return name;
    }

    public void setItems(String name) {
        this.name = name;
    }
}
