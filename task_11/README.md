# Задание 1

Самостоятельно изучите смысл каждого спецификатор доступа и приведите пример программы, демонстрирующей это. Не забудьте про случай, когда спецификатор доступа отсутствует.


```java
class AccessModifiers {
    public String publicField = "PublicField"; 
    protected String protectedField = "ProtectedField"; 
    private String privateField = "PrivateField";   
    String packageField = "PackageField";          
}

class App {
    public static void main(String[] args) {
        AccessModifiers am = new AccessModifiers();
        System.out.println(am.publicField);      // доступно
        System.out.println(am.protectedField);    // доступно
        System.out.println(am.privateField);   // ошибка: недоступно
        System.out.println(am.packageField);      // доступно
    }
}
```

public: доступен везде.
protected: доступен в пакете и подклассах.
private: доступен только внутри класса.
по умолчанию: доступен только в пределах пакета.