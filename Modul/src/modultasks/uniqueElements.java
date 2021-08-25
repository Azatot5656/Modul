package modultasks;

import java.util.Random;
import java.util.Scanner;

public class uniqueElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите величину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
            System.out.println("Введите следующий элемент:");
        }
        System.out.println ("Введенные элементы:");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);
        }
            System.out.println("Количество уникальных элементов: "+uniqueCount(array));
    }

    static int uniqueCount(int[] array) {
        int result = 0;
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            countUnique++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                    break;
                }
            }
        }
        return result = countUnique - count;
    }
}
