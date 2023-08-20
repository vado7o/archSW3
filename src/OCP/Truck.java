package OCP;

/**
 * Класс "Грузовик" расширяет класс "Транспортного средства". При это переписывает функцию расчёта разрешённой скорости
 * с применением коэффициента 0.4
 */
public class Truck extends Vehicle {
    public Truck(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calcAllowedSpeed() {
        return super.maxSpeed * 0.4;
    }
}

