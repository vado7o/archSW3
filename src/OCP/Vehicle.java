package OCP;

/**
 * Принцип открытости-закрытости. Программные сущности (классы, модули, функции) должны быть открыты для расширения, но не для модификации.
 * Класс "Транспортное средство" содрежит в себе на основе родителя общие параметры для всех видов транспорта, а также геттеры и сеттеры.
 */
public class Vehicle {
    int maxSpeed;       // параметр максимальной скорости
    String type;        // тип транспортного средства

    public Vehicle(int maxSpeed, String type) { // конструктор по умолчанию
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }   // геттер для получения максимальной скорости

    public String getType() {
        return this.type;
    }    // геттер для получения типа транспорта

    public double calcAllowedSpeed() {
        return maxSpeed;
    }   // функция расчёта разрешённой скорости
}
