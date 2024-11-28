public class App {
    public static void main(String[] args) {
        practice1();
        practice2();
    }

    /**
     * Метод practice1 демонстрирует использование арифметических операторов,
     * операторов инкремента и декремента, операторов сравнения,
     * логических операторов и операторов для работы со строками.
     */
    private static void practice1() {
        int a = 5;
        int b = 10;

        // Арифметические операторы
        System.out.println("a + b = " + (a + b)); 
        System.out.println("a - b = " + (a - b)); 
        System.out.println("a * b = " + (a * b)); 
        System.out.println("b / a = " + (b / a)); 
        System.out.println("b % a = " + (b % a)); 

        // Операторы инкремента и декремента
        System.out.println("++a: " + (++a)); // Увеличивает a на 1 и выводит новое значение
        System.out.println("b++: " + (b++)); // Выводит текущее значение b, затем увеличивает b на 1
        System.out.println("b = " + b); // Выводит новое значение b

        // Операторы сравнения
        System.out.println("a == b: " + (a == b)); 
        System.out.println("a != b: " + (a != b)); 
        System.out.println("a > b: " + (a > b)); 
        System.out.println("a < b: " + (a < b)); 

        // Операторы логического && и ||
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Логическое И
        System.out.println("x || y: " + (x || y)); // Логическое ИЛИ

        // Операторы типа String
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("str1 + str2 = " + (str1 + " " + str2)); // Конкатенация строк
    }

    /**
     * Метод practice2 демонстрирует использование оператора instanceof
     * для проверки типа объекта.
     */
    private static void practice2() {
        Object obj1 = "Hello, World!";
        Object obj2 = null;

        System.out.println("obj1 instanceof String: " + (obj1 instanceof String)); // true
        System.out.println("obj2 instanceof String: " + (obj2 instanceof String)); // false
        System.out.println("obj2 instanceof Object: " + (obj2 instanceof Object)); // false
    }
}
