package DIP;

/**
 * Интерфейс "Двигатель" служит для соблюдения принципа инверсии зависимостей. Обеспечивает связь между классом
 * "Машина" и двигателем любого типа.
 */
public interface Engine {
    void start();
}