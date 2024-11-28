#  Задание 1

Приведите пример перегруженных методов.

```java
public class App {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

```

# Задание 2

Приведите пример переопределенного метода. Что будет, если у переопределенного и переопределяемого (из суперкласса) методов не будет совпадать тип возвращаемого значения?

```java
class A {
    public void metod() {
        System.out.println("metod A");
    }
}

class B extends A {
    @Override
    public void metod() {
       System.out.println("metod B");
    }
}

class B extends A {
    @Override
    public int metod() {// Ошибка компиляции
       System.out.println("metod B");
       return 1
    }
}
```

# Задание 3

Приведите пример и объясните, когда использование аннотации @Override помогает обнаружить ошибку.

```java
class A {
    public void metod() {
    }
}

class B extends A {
    @Override
    public void metodB() {// Ошибка компиляции, так как метод называется неправильно
    }
}
```