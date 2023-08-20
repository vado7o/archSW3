package SRP;
import java.util.Date;

/**
 * Класс Машина
 */
public class Car {
    private String color;       // переменная хранит цвет создаваемой машины
    private Date releaseDate;   // дата выпуска машины
    private Integer maxSpeed;   // максимальная скорость машины
    public Car(String color, Date releaseDate, Integer maxSpeed) {   // конструктор по умолчанию
        this.color = color;
        this.releaseDate = releaseDate;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Геттер для класса "Машина". Возвращает всю информацию - цвет, дату выпуска, максимальную скорость
     *
     */
    public String getCarInfo() {
        return "Цвет машины - " + color + ", дата выпуска - " + releaseDate.toString() + ", максимальная скорость - " + maxSpeed.toString();
    }
}
