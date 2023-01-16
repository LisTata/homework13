import java.util.Scanner;

public class Task2 {
    /*
    Создать метод, принимающий на вход число. В случае,
если число отрицательное, в методе должно быть брошено
проверяемое исключение. Если число больше 100, должно
быть брошено непроверяемое исключение. Создать свои исключения для данного примера.
Протестируйте метод с помощью JUnit-тестов.
     */
    public static void main(String[] args) throws NumChecedException {
        Scanner sc = new Scanner(System.in);

        try {
          num(sc.nextInt());

        } catch (NumChecedException e) {
            throw new RuntimeException(e);
        }



    }
    public static void num (int number) throws  NumChecedException{
        if(number<0)
            throw new NumChecedException("The number must not be negative ");
        else if (number>100) {
            throw new NumUncheckedException("The number must not be greater than 100");

        } else {
            System.out.println("OK!");
        }



    }


}

