public class App {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.metod(); 

        FinalClass finalClass = new FinalClass();
        SubClassFinal subFinalClass = new SubClassFinal();
    }
}

class SuperClass {
    // Метод помечен как final
    public final void metod() {
        System.out.println("Это метод SuperClass.");
    }
}

class SubClass extends SuperClass {
    // Попытка переопределить final-метод вызовет ошибку компиляции
    @Override
    public void metod() {
        System.out.println("Это метод SubClass.");
    }
}

// Класс, который объявлен как final
final class FinalClass {
}

// Попытка создать производный класс приведет к ошибке компиляции
class SubClassFinal extends FinalClass {
}

