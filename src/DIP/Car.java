package DIP;

/**
 * Принцип инверсии зависимостей. Класс "Машина" содержит в себе ссылку на интерфейс "Двигатель", который в свою
 * очередь может заводить двигатель любого типа - Дизельный, Бензиновый, Электрический и т.д.
 */
public class Car {
    private Engine engine;
    public Car(Engine engine) {       // конструктор по умолчанию
        this.engine = engine;
    }
    public void start()  {           // функция запуска двигателя, которая взаимодействует через интерфейс Двигатель
        this.engine.start();
    }
}