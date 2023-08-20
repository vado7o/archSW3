package OCP;

/**
 * Класс "Автомобиль" расширяет класс "Транспортного средства". При это переписывает функцию расчёта разрешённой скорости
 * с применением коэффициента 0.8
 */
public class Car extends Vehicle {
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calcAllowedSpeed() {
        return super.maxSpeed * 0.8;
    }
}
