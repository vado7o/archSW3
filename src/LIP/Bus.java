package LIP;

import java.util.Date;

/**
 * Класс "Автобус" переписывает метод подсчёта колёс родительского класса "Транспорт" (Vehicle).
 */
public class Bus extends Vehicle {
    public Bus(String type, Date releaseDate) {  // конструктор по умолчанию
        super(type, releaseDate);
    }
    @Override
    public void wheelCount() {                  // метод подсчёта колёс, переписывающий метод родительского класса
        System.out.println("У автобуса 6 колёс");
    }
}
