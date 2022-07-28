import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        homework_6();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void homework_6() {
        int[] arr = generateRandomArray();

        //task1

        int sumPerMonth = 0;

        for (int sumPerDay: arr) {
            sumPerMonth += sumPerDay;
        }
        System.out.println("Сумма трат за месяц составила " + sumPerMonth + " рублей");

        //task2

        Arrays.sort(arr);
        int minSpending = arr[0];
        int maxSpending = arr[arr.length - 1];
        System.out.print("Минимальная сумма трат за день составила " + minSpending + " рублей. ");
        System.out.println("Максимальная сумма трат за день составила " + maxSpending + " рублей. ");
    }



}