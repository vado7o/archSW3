package SRP;

/**
 * В принципе "Единственной обязанности" подсчёт общего потребления топлива выносим отдельно от самого класса Машины
 */
public class CalcFuelConsumption {
    private int distance;          // переменная хранит общее расстояние в км
    private int averageCosumption; // переменная хранит среднее потребления топлива в л/км

    public CalcFuelConsumption(int distance, int averageCosumption) {  // создаём конструктор по умолчанию
        this.distance = distance;
        this.averageCosumption = averageCosumption;
    }
    public int calcTotalFuel() {                    // функция подсчёта возвращает суммарный расход топлива за пройденное расстояние
        return distance * averageCosumption;
    }
}
