import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // =================================================================
        System.out.println("Первое задание");
        int number = scanner.nextInt();
        String s_number = String.valueOf(number);
        System.out.println(s_number.charAt(s_number.length() - 1));

        // =================================================================
        System.out.println("Второе задание");
        scanner.nextLine();
        number = scanner.nextInt();
        s_number = String.valueOf(number);
        int result = 0;
        for (int i = 0; i < s_number.length(); i++) {
            result = result + Integer.parseInt(String.valueOf(s_number.charAt(i)));
        }
        System.out.println(result);

        // =================================================================
        System.out.println("Третье задание");
        number = scanner.nextInt();
        if (number > 0) number++;
        System.out.println(number);

        // =================================================================
        System.out.println("Четвёртое задание");
        number = scanner.nextInt();

        if (number > 0) number++;
        else if (number < 0) number = number - 2;
        else number = 10;
        System.out.println(number);

        // =================================================================
        System.out.println("Пятое задание ");
        int[] intArray = {
                scanner.nextInt(), // 0
                scanner.nextInt(), // 1
                scanner.nextInt()  // 2
        };

        int cache = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < cache) cache = intArray[i];
        }

        System.out.println(cache);

        // =================================================================
        System.out.println("Шестое задание ");
        number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Нулевое число.");
            return;
        }
        String s_result = "";
        boolean poloshitelnoe = number > 0;
        boolean chotnoe = number % 2 == 0;

        if(poloshitelnoe) {
            s_result += "Положительное";
        } else {
            s_result += "Отрицательное";
        }

        if(chotnoe) {
            s_result += " чётное";
        } else {
            s_result += " нечётное";
        }
        s_result += " число";
        System.out.println(s_result);

        // =================================================================
        System.out.println("Седьмое задание ");
        int code = scanner.nextInt();
        switch (code) {
            case 905:
                System.out.println("Москва. Стоимость разговора 41.5 рублей");
                break;
            case 194:
                System.out.println("Ростов. Стоимость разговора 19.8 рублей");
                break;
            case 491:
                System.out.println("Краснодар. Стоимость разговора 26.9 рублей");
                break;
            case 800:
                System.out.println("Краснодар. Стоимость разговора 50.0 рублей");
                break;
        }

        // =================================================================
        System.out.println("Восьмое задание ");
        intArray = new int[]{1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};

        int max = intArray[0];
        int sumOfPoloshitel = 0;
        int sumOfOtrChot = 0;
        int countOfPolosh = 0;

        int sumOfOtr = 0;
        int countOfOtr = 0;

        for(int i = 0; i < intArray.length; i++) {
            // Нахождение максимального
            if(intArray[i] > max) max = intArray[i];

            // Сумма положительных
            // Количество положительных
            if(intArray[i] > 0){
                sumOfPoloshitel += intArray[i];
                countOfPolosh++;
            }

            // Сумма чётных отрицательных
            if(intArray[i] < 0 && intArray[i] % 2 == 0) sumOfOtrChot += intArray[i];

            // Среднее арифметическое
            //      Сумму отрицательных
            if(intArray[i] < 0) {
                sumOfOtr += intArray[i];
                countOfOtr++;
            }
        }

        System.out.println("Максимальное: " + max);
        System.out.println("Сумма положительных: " + sumOfPoloshitel);
        System.out.println("Сумма отрицательных чётных: " + sumOfOtrChot);
        System.out.println("Кол-во положительных: " + countOfPolosh);
        System.out.println("Среднее арифметическое: " + sumOfOtr/countOfOtr);

        // =================================================================
        System.out.println("Девятое задание ");
        intArray = new int[]{15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};

        for (int i = 0; i < intArray.length / 2; i++) {
            cache = intArray[i];
            intArray[i] = intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = cache;
        }
        System.out.println(Arrays.toString(intArray));

        // =================================================================
        System.out.println("Десятое задание ");
        intArray = new int[]{15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
        int[] resultArray = new int[intArray.length];
        int countOfZero = 0;
        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 0) countOfZero++;
            else {
                resultArray[index] = intArray[i];
                index++;
            }
        }

        for (int i = 0; i < countOfZero; i++) {
            resultArray[index] = 0;
            index++;
        }
        System.out.println(Arrays.toString(resultArray));
    }
}