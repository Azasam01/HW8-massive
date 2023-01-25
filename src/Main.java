import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int [] k = new int [3];
        k [0] = 1;
        k [1] = 2;
        k [2] = 3;

        double [] m = {1.57, 7.654, 9.986};

        int [] marks = {85, 90, 77, 68, 79};

    }

    public static void task2() {
        System.out.println("Задача 2");
        int [] marks = {85, 90, 77, 68, 79};
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]);

        if (i != marks.length - 1){
                System.out.print(", ");}
        }
        System.out.println();
        int [] weights = {46, 47, 48, 47, 49};
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);

            if (i != weights.length - 1){
                System.out.print(", ");}
        }
        System.out.println();
        int [] salary = {50000, 55000, 68000, 70000};
        for (int i = 0; i < salary.length; i++) {
            System.out.print(salary[i]);

            if (i != salary.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }


    public static void task3() {
        System.out.println("Задача 3");
        int [] marks = {85, 90, 77, 68, 79};
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.print(marks[i]);
            if (i != 0){
                System.out.print(", ");}

        }
        System.out.println();
        int [] weights = {46, 47, 48, 47, 49};
        for (int i = weights.length - 1; i >= 0 ; i--) {
            System.out.print(weights[i]);
            if (i != 0){
                System.out.print(", ");}

        }
        System.out.println();
        int [] salary = {50000, 55000, 68000, 70000};
        for (int i = salary.length - 1; i >= 0; i--) {
            System.out.print(salary[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = {1, 2, 3};
        for (int i = 0;i < arr.length ; i++) {
            arr[i] = i;
        }
            System.out.println(Arrays.toString(arr));

            for (int i = 0; i < arr.length; i++) {
               if (arr[i] % 2 == 1){
                   arr[i] += 1;
               }
            }
            System.out.println(Arrays.toString(arr));
        }




    }

