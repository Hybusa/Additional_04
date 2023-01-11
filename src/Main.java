
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //First Task
        /*
        Создайте массив из 15 случайных целых чисел из отрезка [0;99].
        Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и
        выведете это количество на экран на отдельной строке.
        */
        System.out.println("Задание 1. \n");

        int[] nums1 = createRandom(15, 0, 99);
        int a1 = 0;
        for (int j : nums1) {
            if (j % 2 == 0) {
                a1++;
            }
        }

        System.out.println("Массив: " + Arrays.toString(nums1));
        System.out.println("Количство четных элементов массива: " + a1);
        System.out.println(System.lineSeparator());


        //Second task
        /*
            Создайте массив из 8 случайных целых чисел из отрезка [1;10].
            Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
            Снова выведете массив на экран на отдельной строке.
        */

        System.out.println("Задание 2. \n");

        int[] nums2 = createRandom(8, 1, 10);

        System.out.println("Массив: " + Arrays.toString(nums2));


        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] % 2 != 0) {
                nums2[i] = 0;
            }
        }


        System.out.println("Замененный массив " + Arrays.toString(nums2));
        System.out.println(System.lineSeparator());


        //Third task
        /*
            Создайте массив из 8 случайных целых чисел из отрезка [1;10].
            Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
            Снова выведете массив на экран на отдельной строке.
        */

        System.out.println("Задание 3. \n");

        int n3 = 5;

        int[] numsA3 = createRandom(n3, 0, 5);
        System.out.println(Arrays.toString(numsA3));
        int[] numsB3 = createRandom(n3, 0, 5);
        System.out.println(Arrays.toString(numsB3));

        int numsA3_sum = 0;

        for (int j : numsA3) {
            numsA3_sum += j;
        }

        int numsB3_sum = 0;

        for (int i = 0; i < numsA3.length; i++) {
            numsB3_sum += numsB3[i];
        }

        if ((numsA3_sum / n3) > (numsB3_sum / n3)) {
            System.out.println("Массив А больше массива B");
        } else if ((numsB3_sum / n3) > (numsA3_sum / n3)) {
            System.out.println("Массив B больше массива A");
        } else {
            System.out.println("Массивы равны");
        }

        System.out.println(System.lineSeparator());

        //Fourth task
        /*
            Создайте массив из 8 случайных целых чисел из отрезка [1;10].
            Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
            Снова выведете массив на экран на отдельной строке.
        */

        System.out.println("Задание 4. \n");

        int[] nums4 = createRandom(4, 10, 99);

        System.out.println(Arrays.toString(nums4));

        boolean trigger = true;

        for (int i = 0; i < nums4.length - 1; i++) {
            if (nums4[i] > nums4[i + 1]) {
                trigger = false;
                break;
            }

        }

        if (trigger)
            System.out.println("Массив возрастающий");
        else
            System.out.println("Массив не возрастающий");

        System.out.println(System.lineSeparator());


        //Fifth task
        /*
           Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
           Напоминаем, что первый и второй члены последовательности равны 0 и 1,
           а каждый следующий — сумме двух предыдущих.
        */

        System.out.println("Задание 5. \n");

        int [] fibArray = new int[20];
        fibArray[0] = 0;
        int fibN = 1;

        for (int i = 1; i < fibArray.length; i++)
        {
            fibArray[i] = fibN;
            fibN += fibArray[i-1];
        }

        System.out.println(Arrays.toString(fibArray));
        System.out.println(System.lineSeparator());


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

        int [] firstArr = new int [10];

        for (int i=0; i < firstArr.length;i++)
        {
            firstArr[i] = (i+1)*(i+1);
        }

        System.out.println("Первая плсдедовательность: \n" + Arrays.toString(firstArr));
        System.out.println(System.lineSeparator());

        int [] secondArr = new int [10];

        boolean switcher1 = true;

        for (int i=0; i < secondArr.length;i++)
        {
            secondArr[i] = (i+1)*(i+1);

            if (!switcher1)
            {
                secondArr[i] *= -1;
            }
            switcher1 ^= true;
        }

        System.out.println("Вторая плсдедовательность: \n" + Arrays.toString(secondArr));
        System.out.println(System.lineSeparator());


        int [] thirdArr = new int [10];

        boolean switcher2 = true;

        for (int i=0; i < thirdArr.length;i++)
        {
            thirdArr[i] = 1;

            if (!switcher2)
            {
                thirdArr[i] *= -1;
            }
            switcher2 ^= true;
        }

        System.out.println("Третья плсдедовательность: \n" + Arrays.toString(thirdArr));
        System.out.println(System.lineSeparator());

        int []  forthArr = new int [10];

        int j = 1;

        for (int i=0; i < forthArr.length;i++)
        {
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