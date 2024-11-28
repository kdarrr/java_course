public class App {    
    public static void main(String[] args) {
        practice1();
        practice2();
    }
    // Метод practice1 демонстрирует использование бесконечных циклов.
    private static void practice1() {
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
        }

        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (true);
    }

    // Метод practice2 демонстрирует использование циклов for с операциями break и continue.
        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                break;
            }
            System.out.println(k);
        }

        for (int l = 0; l < 10; l++) {
            if (l % 2 == 0) {
                continue;
            }
            System.out.println(l);
        }
    }
}
