import java.util.Scanner;
/*Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет,
является ли оно положительным. Если число отрицательное или равно нулю,
программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
В противном случае, программа должна выводить сообщение "Число корректно".

Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException
с сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.

Обратите внимание, что в обоих задачах используются собственные исключения,
которые наследуются от класса Exception.
Это позволяет нам определить специфическую причину ошибки и передать информацию об ошибке
для последующей обработки.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Введите число: ");
//        int num = scanner.nextInt();
//
//        try {
//            check(num);
//        } catch (InvalidNumberException ex){
//            System.out.println("Ошибка: " + ex.getMessage());
//        }
        System.out.print("Введите первое число ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число ");
        int y = scanner.nextInt();
        try {
            calc(x,y);
        } catch (DivisionByZeroException ex){
            System.out.println("Ошибка: " + ex.getMessage());
        }
    }
    public static void check(int value) throws InvalidNumberException{
        if (value <= 0){
            throw new InvalidNumberException("Некорректное число");
        } else {
            System.out.println("Число корректно");
        }
    }

    public static void calc(int x, int y) throws DivisionByZeroException {
        if (y == 0){
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        } else {
            System.out.println(x / y);
        }
    }
}
class InvalidNumberException extends Exception{
    public InvalidNumberException(String mes){
        super(mes);
    }
}
class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String mes){
        super(mes);
    }
}