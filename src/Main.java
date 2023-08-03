import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("            Задача 1");
        System.out.println("Целочисленный массив");
        int[] oneMassive = new int[3];
        oneMassive[0] = 1;
        oneMassive[1] = 2;
        oneMassive[2] = 3;
        for (int i : oneMassive) {
            System.out.println(i);
        }
        System.out.println("Дробный массив");
        double[] twoMassive = {1.57, 7.654, 9.986};
        for (double j : twoMassive) {
            System.out.println(j);
        }
        System.out.println("Произвольный массив");
        int[] threeMassive = new int[6];
        for (int index = 0; index < threeMassive.length; index++) {
            threeMassive[index] = index * 4;
            System.out.println(threeMassive[index]);
        }
    }

    public static void task2() {
        System.out.println("            Задача 2");
        System.out.println("Целочисленный массив");
        int[] oneMassive = new int[3];
        oneMassive[0] = 1;
        oneMassive[1] = 2;
        oneMassive[2] = 3;
        for (int index = 0; index < oneMassive.length; index++) {
            if (index == oneMassive.length - 1) {
                System.out.println(oneMassive[index]);
                break;
            }
            System.out.print(oneMassive[index] + ", ");
        }
        System.out.println("Дробный массив");
        double[] twoMassive = {1.57, 7.654, 9.986};
        for (int index1 = 0; index1 < twoMassive.length; index1++) {
            if (index1 == twoMassive.length - 1) {
                System.out.println(twoMassive[index1]);
                break;
            }
            System.out.print(twoMassive[index1] + ", ");
        }
        System.out.println("Произвольный массив");
        int[] threeMassive = new int[6];
        for (int index2 = 0; index2 < threeMassive.length; index2++) {
            threeMassive[index2] = index2 * 4;
            if (index2 == threeMassive.length - 1) {
                System.out.println(threeMassive[index2]);
                break;
            }
            System.out.print(threeMassive[index2] + ", ");
        }
    }

    public static void task3() {
        System.out.println("            Задача 3");
        System.out.println("Целочисленный массив");
        int[] oneMassive = new int[3];
        oneMassive[0] = 1;
        oneMassive[1] = 2;
        oneMassive[2] = 3;
        for (int index = oneMassive.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(oneMassive[index]);
                break;
            }
            System.out.print(oneMassive[index] + ", ");
        }
        System.out.println("Дробный массив");
        double[] twoMassive = {1.57, 7.654, 9.986};
        for (int index1 = twoMassive.length - 1; index1 >= 0; index1--) {
            if (index1 == 0) {
                System.out.println(twoMassive[index1]);
                break;
            }
            System.out.print(twoMassive[index1] + ", ");
        }
        System.out.println("Произвольный массив");
        int[] threeMassive = new int[6];
        for (int index2 = threeMassive.length - 1; index2 >= 0; index2--) {
            threeMassive[index2] = index2 * 4;
            if (index2 == 0) {
                System.out.println(threeMassive[index2]);
                break;
            }
            System.out.print(threeMassive[index2] + ", ");
        }
    }

    public static void task4() {
        System.out.println("            Задача 4");
        int[] oneMassive = new int[3];
        oneMassive[0] = 1;
        oneMassive[1] = 2;
        oneMassive[2] = 3;
        for (int index = 0; index < oneMassive.length; index++) {
            if (oneMassive[index] % 2 != 0) {
                oneMassive[index] += 1;
            }
        }
        System.out.println(Arrays.toString(oneMassive));
    }
}