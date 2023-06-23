import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число ");
        int y = scanner.nextInt();
        Calc.calc(x,y);
        System.out.print("Введите ваш возраст ");
        Age.age(scanner.next());
        scanner.close();
    }
}