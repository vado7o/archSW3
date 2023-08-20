package LIP;

import java.util.Date;

/**
 * Класс "Грузовик" переписывает метод подсчёта колёс родительского класса "Транспорт" (Vehicle).
 */
public class Truck extends Vehicle {
    public Truck(String type, Date releaseDate) {  // конструктор по умолчанию
        super(type, releaseDate);
    }
    @Override
    public void wheelCount() {                      // метод подсчёта колёс, переписывающий метод родительского класса
        System.out.println("У грузовика 8 колёс");
    }
}
