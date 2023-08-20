package ISP;

/**
 * Принцип разделения интерфейса. Клиенты не должны зависеть от интерфейсов, которые они не используют.
 * В данном случае класс грузовика "Truck" имплементирует интерфейс поднятия кузова и никакие
 * другие ненужные ему интерфейсы.
 */
public class Truck implements TruckBody {
    private int loadCapacity;   // переменная хранит грузоподъемность грузовика

    public Truck(int loadCapacity) {  // конструктор по умолчанию
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void liftBody() {           // имплементируем метод интерфейса "TruckBody" для поднятия кузова грузовика.
        System.out.println("Кузов поднят!");
    }
}
