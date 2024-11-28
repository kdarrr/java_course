/**
 * Класс App демонстрирует простое приложение для работы с числами.
 */
public class App {

    /**
     * Метод для сложения двух целых чисел.
     *
     * @param a первое число
     * @param b второе число
     * @return сумма двух чисел
     */
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Сложение: " + app.add(5, 3));
    }
}
