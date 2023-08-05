import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1.1");
        int [] meaning = new int [3];
        meaning [0] = 1;
        meaning [1] = 2;
        meaning [2] = 3;
        System.out.println(Arrays.toString(meaning));
    }

    public static void task2 () {
        System.out.println("Задача 1.2");
        double [] meaning = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(meaning));
    }

    public static void task3 () {
        System.out.println("Задача 2");
        int [] meaningFirst = new int [3];
        meaningFirst [0] = 1;
        meaningFirst [1] = 2;
        meaningFirst [2] = 3;
        double [] meaningSecond = {1.57, 7.654, 9.986};
        System.out.println("Способ вывода в консоль, используя цикл:");
        for (int i = 0; i < meaningFirst.length; i++) {
            System.out.print(meaningFirst[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < meaningSecond.length; i++) {
            System.out.print(meaningSecond[i] + ", ");
        }
        System.out.println();
        System.out.println("Способ вывода в консоль, используя метод Arrays:");
        System.out.println(Arrays.toString(meaningFirst));
        System.out.println(Arrays.toString(meaningSecond));
    }

    public static void task4() {
        System.out.println("Задача 3");
        int [] meaningFirst = new int [3];
        meaningFirst[0] = 1;
        meaningFirst[1] = 2;
        meaningFirst[2] = 3;
        for (int i = 2; i < meaningFirst.length && i >= 0; i--) {
            System.out.print(meaningFirst[i] + ", ");
        }
        System.out.println();
        double [] meaningSecond = {1.57, 7.654, 9.986};
        for (int i = 2; (i < meaningSecond.length && i >= 0); i--) {
            System.out.print(meaningSecond[i] + ", ");
            System.out.println();
        }
    }

    public static void task5 () {
        System.out.println("Задача 4");
        int [] meaningFirst = {1, 2, 3};
        for (int i = 0; i < meaningFirst.length; i++) {
            if (meaningFirst[i] % 2 > 0) {
                meaningFirst[i] = meaningFirst[i] + 1;
            }
        }
        System.out.println(Arrays.toString(meaningFirst));
    }
}
