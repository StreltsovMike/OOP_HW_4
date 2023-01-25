package org.example.lesson4.hw;

import java.util.ArrayList;
import java.util.List;

public class Box<E extends Fruit> /* <FIXME: Указать дженерик> */{

    private List<E> fruits = new ArrayList<>();

    public void add(E fruit) {
        fruits.add(fruit);
        // TODO: 24.01.2023

    }
    
    public double getWeight() { 
        int weightFruits  = 0;
        for (E e : fruits) {
            weightFruits +=  e.getWeight();
        }
        return weightFruits;
        // TODO: 24.01.2023 Просуммировать веса всех фруктов в коробке 
    }

    public void moveTo(Box<? super E>/* <FIXME: Указать дженерик> */ anotherBox) {
        for (E e : fruits) {
            anotherBox.add(e);
        }
        fruits.clear();


        // TODO: 24.01.2023
        // Пересыпать фрукты из текущей коробки в anotherBox
    }

}

    // Реализовать хранение фруктов в коробке.
    // Должны быть доступны следующие возможности
    // Добавление фрукта
    // Должен быть конструктор
    // Метод, который пересыпает фрукты из текущей коробки в другую коробку
    // Для внутреннего хранения можно использовать например List