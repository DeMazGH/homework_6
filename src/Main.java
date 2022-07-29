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

        int minSpending = arr[0];
        int maxSpending = arr[0];
        for (int currentSpending : arr) {
            if (minSpending > currentSpending) {
                minSpending = currentSpending;
            }
            if (maxSpending < currentSpending) {
                maxSpending = currentSpending;
            }
        }
        System.out.print("Минимальная сумма трат за день составила " + minSpending + " рублей. ");
        System.out.println("Максимальная сумма трат за день составила " + maxSpending + " рублей. ");

        //task3

        int amountOfDays = 30;
        double averageSum = (double) sumPerMonth / amountOfDays;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

        //task4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        //task5

        int[][] matrix = new int[3][3];
        int desiredNum = 1;

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (j % 2 == 0) {
                        matrix[j][i] = desiredNum;
                    }
                }
            } else {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (j % 2 != 0) {
                        matrix[j][i] = desiredNum;
                    }
                }
            }
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();

        }
        System.out.println();

        //task6

        int[] reverseIntArray = {5, 4, 3, 2, 1};
        int arraySize = reverseIntArray.length;
        int[] intArray = new int[arraySize];

        for (int j : reverseIntArray) {
            intArray[--arraySize] = j;
        }
        System.out.println(Arrays.toString(reverseIntArray));
        System.out.println(Arrays.toString(intArray));
    }


}