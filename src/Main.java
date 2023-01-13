
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {

        //First Task
        /*
        Создайте массив из 15 случайных целых чисел из отрезка [0;99].
        Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и
        выведете это количество на экран на отдельной строке.
        */
        System.out.println("Задание 1. \n");

        int[] nums = createRandom(15, 0, 99);
        int a = 0;
        for (int j : nums) {
            if (j % 2 == 0) {
                a++;
            }
        }

        System.out.println("Массив: " + Arrays.toString(nums));
        System.out.println("Количство четных элементов массива: " + a);
        System.out.println(System.lineSeparator());

    }

    public static void task2() {
        //Second task
        /*
            Создайте массив из 8 случайных целых чисел из отрезка [1;10].
            Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
            Снова выведете массив на экран на отдельной строке.
        */

        System.out.println("Задание 2. \n");

        int[] nums = createRandom(8, 1, 10);

        System.out.println("Массив: " + Arrays.toString(nums));


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                nums[i] = 0;
            }
        }


        System.out.println("Замененный массив " + Arrays.toString(nums));
        System.out.println(System.lineSeparator());

    }

    public static void task3() {
        //Third task
        /*
            Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
            выведите массивы в консоль в двух отдельных строках.
            Посчитайте среднее арифметическое элементов каждого массива и сообщите,
            для какого из массивов это значение оказалось больше
            (либо сообщите, что их средние арифметические равны).
        */

        System.out.println("Задание 3. \n");

        int n = 5;

        int[] numsA = createRandom(n, 0, 5);
        System.out.println(Arrays.toString(numsA));
        int[] numsB = createRandom(n, 0, 5);
        System.out.println(Arrays.toString(numsB));

        int numsA_sum = 0;

        for (int j : numsA) {
            numsA_sum += j;
        }

        int numsB_sum = 0;

        for (int i = 0; i < numsA.length; i++) {
            numsB_sum += numsB[i];
        }

        if ((numsA_sum / n) > (numsB_sum / n)) {
            System.out.println("Массив А больше массива B");
        } else if ((numsB_sum / n) > (numsA_sum / n)) {
            System.out.println("Массив B больше массива A");
        } else {
            System.out.println("Массивы равны");
        }

        System.out.println(System.lineSeparator());

    }
    public static void task4() {

        //Fourth task
        /*
            Создайте массив из 8 случайных целых чисел из отрезка [1;10].
            Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
            Снова выведете массив на экран на отдельной строке.
        */

        System.out.println("Задание 4. \n");

        int[] nums = createRandom(4, 10, 99);

        System.out.println(Arrays.toString(nums));

        boolean trigger = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                trigger = false;
                break;
            }

        }

        if (trigger)
            System.out.println("Массив возрастающий");
        else
            System.out.println("Массив не возрастающий");

        System.out.println(System.lineSeparator());

    }

    public static void task5() {
        //Fifth task
        /*
           Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
           Напоминаем, что первый и второй члены последовательности равны 0 и 1,
           а каждый следующий — сумме двух предыдущих.
        */

        System.out.println("Задание 5. \n");

        int[] fibArray = new int[20];
        fibArray[0] = 0;
        int fibN = 1;

        for (int i = 1; i < fibArray.length; i++) {
            fibArray[i] = fibN;
            fibN += fibArray[i - 1];
        }

        System.out.println(Arrays.toString(fibArray));
        System.out.println(System.lineSeparator());

    }

    public static void task6() {
        //Sixth task
        /*
          Определите закономерность данных ниже последовательностей чисел
          1, 4, 9, 16, 25...
          1, -4, 9, -16, 25...
          1, -1, 1, -1, 1, -1...
          1, 0, 2, 0, 3, 0, 4...
          Напишите код, который продолжит эти последовательности чисел до 10 элементов.
        */

        System.out.println("Задание 6. \n");

        int[] firstArr = new int[10];

        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = (i + 1) * (i + 1);
        }

        System.out.println("Первая плсдедовательность: \n" + Arrays.toString(firstArr));
        System.out.println(System.lineSeparator());

        int[] secondArr = new int[10];

        boolean switcher1 = true;

        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = (i + 1) * (i + 1);

            if (!switcher1) {
                secondArr[i] *= -1;
            }
            switcher1 ^= true;
        }

        System.out.println("Вторая плсдедовательность: \n" + Arrays.toString(secondArr));
        System.out.println(System.lineSeparator());


        int[] thirdArr = new int[10];

        boolean switcher2 = true;

        for (int i = 0; i < thirdArr.length; i++) {
            thirdArr[i] = 1;

            if (!switcher2) {
                thirdArr[i] *= -1;
            }
            switcher2 ^= true;
        }

        System.out.println("Третья плсдедовательность: \n" + Arrays.toString(thirdArr));
        System.out.println(System.lineSeparator());

        int[] forthArr = new int[10];

        int j = 1;

        for (int i = 0; i < forthArr.length; i++) {
            forthArr[i] = j;
            i++;
            j++;
        }

        System.out.println("Четвертая плсдедовательность: \n" + Arrays.toString(forthArr));
        System.out.println(System.lineSeparator());


    }

    public static int[] createRandom(int n, int min, int max) {
        Random rd = new Random();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(max - min + 1) + min;
            // System.out.print(array[i] +" ");
        }
        return array;
    }
}