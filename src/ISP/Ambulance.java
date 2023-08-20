package ISP;

/**
 * Принцип разделения интерфейса. Клиенты не должны зависеть от интерфейсов, которые они не используют.
 * В данном случае класс скорой помощи "Ambulance" имплементирует интерфейс включения проблескового маячка и никакие
 * другие ненужные ему интерфейсы.
 */
public class Ambulance implements FlashLight {

    private String sideNumber;   // переменная хранит бортовой номер автомобиля скорой помощи

    public Ambulance(String sideNumber) {  // конструктор по умолчанию
        this.sideNumber = sideNumber;
    }

    @Override
    public void turnOnFlashLight() {           // имплементируем метод интерфейса "FlashLight" для включения проблескового маячка.
        System.out.println("Проблесковый маячок включен!");
    }
}
