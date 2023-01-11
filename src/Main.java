
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

        if ((numsA3_sum / n3) > (numsB3_sum / n3))
        {
            System.out.println("Массив А больше массива B");
        }
        else if ((numsB3_sum / n3) > (numsA3_sum / n3))
        {
            System.out.println("Массив B больше массива A");
        }
        else
        {
            System.out.println("Массивы равны");
        }


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