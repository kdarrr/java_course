# Задание 1

Самостоятельно изучите принцип подстановки Лисков и приведите пример его использования.

Принцип подстановки Лисков (LSP) утверждает, что объекты подкласса должны быть взаимозаменяемыми с объектами суперкласса без изменения корректности программы.


Класс `Bird` и его подклассы `Sparrow` и `Penguin`:

```java
class Bird {
    public void fly() {
    }
}

class Sparrow extends Bird {
}

class Penguin extends Bird {
    @Override
    public void fly() {
        ...
    }
}
```

Чтобы исправить это, можно выделить интерфейс `Flyable`:

```java
class Bird {
}

class Flyable extends Bird {
    public void fly() {
    }
}

class Sparrow extends Flyable {
    @Override
    public void fly() {
    }
}

class Penguin extends Bird {
}
```

Теперь `Sparrow` реализует `Flyable`, а `Penguin` — нет, что соответствует принципу LSP.