import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
/*
Создать метод, который выводит в консоль результат целочисленного деления числа, введенного с клавиатуры, на
значения элементов одномерного массива целых чисел, заполненный случайным образом – от -10 до 10. Длина массива случайная – от 1 до 10.
Обработать все возможные исключительные ситуации в
данном методе
 */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int lengthArray = (int) (Math.random() * 9+1) ;
        System.out.println("Array length: "+ lengthArray);
        int[] array= new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            array[i]=(int) (Math.random() * (20+1))-10;
        }
        System.out.println(Arrays.toString(array));
        try{
            for (int denominator:array) {
                System.out.println(number/denominator);
            }

        }
        catch (NullPointerException exception){
            System.out.println("Object is null");

        }
        catch (ArithmeticException exception){
            System.out.println("Can't divide by zero");
        }


    }
}