package LIP;

import java.util.Date;

/**
 * Принцип подстановки Барбары Лисков. Необходимо, чтобы подклассы могли бы служить заменой для своих суперклассов.
 * В нашем случае родительский класс "Транспорт" имеет метод подсчёта колёс "wheelCount", который в свою очередь
 * не расчитывает ничего, а делает это в классах-наследниках.
 * Как результат, при создании нового класса-наследника не придётся добавлять записи в данную функцию.
 */
public class Vehicle {
    String type;
    Date releaseDate;

    public Vehicle(String type, Date releaseDate) {  // конструктор по умолчанию
        this.type = type;
        this.releaseDate = releaseDate;
    }

    public void wheelCount(){}   // метод подсчёта колёс
}
