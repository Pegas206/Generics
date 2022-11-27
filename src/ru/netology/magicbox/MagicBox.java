package ru.netology.magicbox;

import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    protected String name;
    protected T[] items;

    public MagicBox(String name, int maxAccount) {
        this.name = name;
        items = (T[]) new Object[maxAccount];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                System.out.println("Добавлено ячейка " + i + " с значением " + item);
                items[i] = item;
                return true;
            }
        }
        System.out.println("Место в волшебном ящике закончилось! :(");
        System.out.println();
        return false;
    }

    public T Random() {
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        System.out.println(items[randomInt]);
        return null;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Есть свободное место");
            }
        }
        System.out.print("Случайное значение: ");
        Random();

        return null;
    }
}
