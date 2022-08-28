package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    FilmManager repo = new FilmManager();
    FilmManager manager = new FilmManager(repo);
    FilmItem item1 = new FilmItem("Бладшот");
    FilmItem item2 = new FilmItem("Вперед");
    FilmItem item3 = new FilmItem("Отель «Белград»");
    FilmItem item4 = new FilmItem("Джентельмены");
    FilmItem item5 = new FilmItem("Человек-невидимка");
    FilmItem item6 = new FilmItem("Тролли.Мировой тур");
    FilmItem item7 = new FilmItem("Номер один");
    FilmItem item8 = new FilmItem("Звездные войны");

    @Test
    public void test() {
        FilmManager manager = new FilmManager(10);
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);

        FilmItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        FilmItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNewFilm() {
        FilmManager manager = new FilmManager(10);
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.addNewFilm(item8);

        FilmItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8};
        FilmItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowInOrder() {
        FilmManager manager = new FilmManager();
        manager.findAll();
        FilmItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        FilmItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowInLimitedOrder() {
        FilmManager manager = new FilmManager(5);
        manager.findAll();
        FilmItem[] expected = {item1, item2, item3, item4, item5};
        FilmItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);

    }

    @BeforeEach
    public void setup() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
    }

    @Test
    public void shouldReverseItems() {
        FilmManager manager = new FilmManager();
        manager.findLast();
        FilmItem[] expected = {item3,item2,item1};
        FilmItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
}
