package org.example.core.massive;

import java.util.Arrays;

/**
 * для каждой задачи создавать новые массивы, результат вывести в консоль.
 */
public class TaskArray {
    public static void main(String[] args) {
        //Создайте массив из 10 элементов и заполните его числами от 1 до 10.
        //твой код здесь

        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(arr[9]);


        // Найдите максимальный элемент в массиве. (создать любой массив с рандомными числами)
        //твой код здесь

        int[] arr0 = {12, 23, 31, 472, 58, 65, 73};
        int max = arr0[0];
        for(int i = 0; i<arr0.length; i++) {
            if (arr0[i] > max)
            max = arr0[i];
        }
            System.out.println("Max Element: " + max);



            //Создайте программу, которая обращает массив (меняет элементы местами с начала до конца).
            // твой код здесь

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1.length - 1 - i + 1;
        }
        System.out.println(Arrays.toString(arr1));


        //Вычислите среднее значение всех элементов массива.
        //твой код здесь


        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 4, 3, 2};
        double res = 0;
        for(int i = 0; i< arr2.length ; i++) {
            res += arr2[i];
        }
        res /= arr2.length;
        System.out.println("Среднее значение: " + res);

    }
}

