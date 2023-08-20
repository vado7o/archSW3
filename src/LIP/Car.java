package LIP;

import java.util.Date;

/**
 * Класс "Машина" переписывает метод подсчёта колёс родительского класса "Транспорт" (Vehicle).
 */
public class Car extends Vehicle {

    public Car(String type, Date releaseDate) {  // конструктор по умолчанию
        super(type, releaseDate);
    }
    @Override
    public void wheelCount() {                  // метод подсчёта колёс, переписывающий метод родительского класса
        System.out.println("У машины 4 колеса");
    }
}
