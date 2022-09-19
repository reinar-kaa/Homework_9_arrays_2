import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] payments = generateRandomArray();  // генерация массива случайных цифр. payments - выплаты
        System.out.println(Arrays.toString(payments));
        System.out.println("Task_1");
//        Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
//        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
//        в формате «Сумма трат за месяц составила … рублей».
        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            int payment = payments[i];
            sum += payment;
        }
//        Ниже приведёт способ for each, он заменяет 13,14,15,16 строки (заменяет for)
        for (int payment : payments) {
            sum += payment;
        }
        System.out.println("Сумма трат за месяц составила "  + sum + " рублей");

        System.out.println("Task_2");
//        Следующая задача — найти минимальную и максимальную трату за день.
//                Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
//        в формате «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        int max = Integer.MIN_VALUE;   //Задаём константу исходя из ограничений, которые генерируются до 200_000
        int min = Integer.MAX_VALUE;
        for (int payment : payments) {
            if (payment > max) {
                max = payment;
            }
            if (payment < min) {
                min = payment;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + max + " рублей");

        System.out.println("Task_3");
//        А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
//        Нужно написать программу, которая посчитает среднее значение трат за месяц
//        (то есть сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат в формате
//        «Средняя сумма трат за месяц составила … рублей».
//        Важно помнить подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
        double averageExpense = (double) sum / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей");

        System.out.println("Task_4");
//        Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
//        В качестве данных для массива используйте
//        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//        В результате в консоль должно быть выведено Ivanov Ivan.
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
