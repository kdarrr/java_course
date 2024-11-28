# Задание 1

Приведите примеры использования оператора instanceof с объектами параметризованных классов.

```java
class A<T> {
    private T item;
    public A(T item) { this.item = item; }
}

public class App {
    public static void main(String[] args) {
        A<String> stringA = new A<>("Hello");
        if (stringA instanceof A) {
            ...
        }
    }
}
```

# Задание 2

Приведите примеры использования конструкций <? extends T> и <? super T>. Объясните, зачем они нужны?


```java
import java.util.List;
import java.util.ArrayList;

class A {}
class B extends A {}

public class App {
    public static void printAList(List<? extends A> AList) {
        for (A a : AList) {
            System.out.println(a);
        }
    }

    public static void addB(List<? super B> AList) {
        AistL.add(new B()); 
    }

    public static void main(String[] args) {
        List<B> BList = List.of(new B());
        printAList(BList); 

        List<A> AL = new ArrayList<>();
        addB(AL); 
    }
}
```


1. `<? extends T>`: Позволяет методам принимать списки объектов, которые являются подтипами `T`. Например, метод `printAList` может принимать список объектов типа `B`, так как `B` является подклассом `A`:

2. `<? super T>`: Позволяет методам добавлять объекты типа `T` в списки, которые могут содержать `T` или его суперклассы. Например, метод `addB` может добавлять объекты типа `B` в список объектов типа `A`:


