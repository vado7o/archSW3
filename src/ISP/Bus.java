package ISP;

/**
 * Принцип разделения интерфейса. Клиенты не должны зависеть от интерфейсов, которые они не используют.
 * В данном случае класс автобуса "Bus" имплементирует интерфейс открытия задней двери и никакие
 * другие ненужные ему интерфейсы.
 */
public class Bus implements BackDoor {
    private int seatingCapacity;   // переменная хранит пассажировместимость
    public Bus(int seatingCapacity) {  // конструктор по умолчанию
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void openBackDoor() {           // имплементируем метод интерфейса "BackDoor" для открытия задней двери.
        System.out.println("Задняя дверь открыта!");
    }
}
