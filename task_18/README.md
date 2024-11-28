# Задание #1

Приведите примеры класса, в котором перегружен метод с переменным числом параметров.

```java
// Метод для сложения целых чисел
public int add(int... numbers) {
    int sum = 0;
    for (int number : numbers) {
        sum += number;
    }
    return sum;
}

// Метод для сложения дробных чисел
public double add(double... numbers) {
    double sum = 0.0;
    for (double number : numbers) {
        sum += number;
    }
    return sum;
}

```