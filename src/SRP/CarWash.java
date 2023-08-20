package SRP;

/**
 * В принципе "Единственной обязанности" подсчёт общей стоимости мойки машины выносим отдельно от самого класса Машины
 * в класс "Мойка Машины"
 */
public class CarWash {
    private int duration; // продолжительность мойки в минутах
    private int minuteCost; // стоимость одной минуты мойки
    public CarWash(int duration, int minuteCost) { // создаём конструктор по умолчанию
        this.duration = duration;
        this.minuteCost = minuteCost;
    }
    public int calcTotalCost() {        // функция расчёта стоимости мойки возвращает умножение продолжительности и стоимости одной минуты
        return duration * minuteCost;
    }
}
