package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    FilmManager manager = new FilmManager();
    FilmItem item1 = new FilmItem("Бладшот");
    FilmItem item2 = new FilmItem("Вперед");
    FilmItem item3 = new FilmItem("Отель «Белград»");
    FilmItem item4 = new FilmItem("Джентельмены");
    FilmItem item5 = new FilmItem("Человек-невидимка");
    FilmItem item6 = new FilmItem("Тролли.Мировой тур");
    FilmItem item7 = new FilmItem("Номер один");
    FilmItem item8 = new FilmItem("Звездные войны");
    FilmItem item9 = new FilmItem("Гладиатор");
    FilmItem item10 = new FilmItem("Мадагаскар");

    @BeforeEach
    public void setup() {
        manager.addNewFilm(item1);
        manager.addNewFilm(item2);
        manager.addNewFilm(item3);
        manager.addNewFilm(item4);
        manager.addNewFilm(item5);
        manager.addNewFilm(item6);
        manager.addNewFilm(item7);
        manager.addNewFilm(item8);
        manager.addNewFilm(item9);
        manager.addNewFilm(item10);
    }

    @Test
    public void shouldAddNewFilm() {
        FilmManager manager = new FilmManager();
        manager.addNewFilm(item1);
        manager.addNewFilm(item2);
        manager.addNewFilm(item3);
        manager.addNewFilm(item4);
        manager.addNewFilm(item5);
        manager.addNewFilm(item6);
        manager.addNewFilm(item7);
        manager.addNewFilm(item8);
        FilmItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8};
        FilmItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowInOrder() {
        FilmManager manager = new FilmManager();
        manager.addNewFilm(item1);
        manager.addNewFilm(item2);
        manager.addNewFilm(item3);
        manager.addNewFilm(item4);
        manager.addNewFilm(item5);
        manager.addNewFilm(item6);
        manager.addNewFilm(item7);
        manager.addNewFilm(item8);
        manager.findAll();

        FilmItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8};
        FilmItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowInLimitedOrder() {
        FilmManager manager = new FilmManager(5);
        manager.addNewFilm(item1);
        manager.addNewFilm(item2);
        manager.addNewFilm(item3);
        manager.addNewFilm(item4);
        manager.addNewFilm(item5);
        manager.findAll();
        FilmItem[] expected = {item1, item2, item3, item4, item5};
        FilmItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldReverseItems() {
        FilmManager manager = new FilmManager();
        manager.addNewFilm(item1);
        manager.addNewFilm(item2);
        manager.addNewFilm(item3);
        manager.addNewFilm(item4);
        manager.addNewFilm(item5);
        manager.addNewFilm(item6);
        manager.addNewFilm(item7);
        manager.addNewFilm(item8);
        manager.findLast();

        FilmItem[] expected = {item8, item7, item6, item5, item4, item3, item2, item1};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseLimitedItems() {
        FilmManager manager = new FilmManager(5);
        manager.findLast();
        manager.addNewFilm(item1);
        manager.addNewFilm(item2);
        manager.addNewFilm(item3);

        FilmItem[] expected = {item3, item2, item1};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
