# Задание #1

Приведите примеры использования перегрузки и переопределения методов.

```java
public int add(int a, int b) {
    return a + b;
}

public int add(int a, int b, int c) {
    return a + b + c;
}

```

```java
class A {
    public void foo() { 
        ...
     }
}

class B extends A {
    @Override
    public void foo() { 
        ...
    }
}
```