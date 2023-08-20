package OCP;

/**
 * Класс "Автобус" расширяет класс "Транспортного средства". При это переписывает функцию расчёта разрешённой скорости
 * с применением коэффициента 0.6
 */
public class Bus extends Vehicle {
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calcAllowedSpeed() {
        return super.maxSpeed * 0.6;
    }
}
