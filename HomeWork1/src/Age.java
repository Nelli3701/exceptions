/*Напишите программу, которая запрашивает у пользователя его возраст.
Если введенное значение не является числом, выбросите исключение NumberFormatException с сообщением
"Некорректный ввод". Иначе выведите возраст на экран*/
public class Age {
    public static void age(String age){
        try {
            System.out.println("Ваш возраст: " + Integer.parseInt(age));
        } catch (NumberFormatException ex) {
            System.out.println("Некорректный ввод");
        }
    }
}
