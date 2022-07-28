import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        homework_6();

    }

    public static int[] generateRandomArray() {
        int amountOfDays = 30;
        java.util.Random random = new java.util.Random();
        int[] arr = new int[amountOfDays];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void homework_6() {
        int[] arr = generateRandomArray();

        //task1

        int sumPerMonth = 0;

        for (int sumPerDay : arr) {
            sumPerMonth += sumPerDay;
        }
        System.out.println("Сумма трат за месяц составила " + sumPerMonth + " рублей");

        //task2

        Arrays.sort(arr);
        int minSpending = arr[0];
        int maxSpending = arr[arr.length - 1];
        System.out.print("Минимальная сумма трат за день составила " + minSpending + " рублей. ");
        System.out.println("Максимальная сумма трат за день составила " + maxSpending + " рублей. ");

        //task3

        int amountOfDays = 30;
        double averageSum = (double) sumPerMonth / amountOfDays;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

        //task4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


}