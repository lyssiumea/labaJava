import java.util.Scanner; // для считывание ввода данных пользователя

public class Main {
    public static void main(String[] args) {

        Methods methods = new Methods(); // Задание 1. Методы
        Scanner scanner = new Scanner(System.in);

        // 2. Сумма знаков
//        System.out.print("Введите число (не менее 2х знаков): ");
//        int number;
//        while (true) { // проверка на дурака
//            if (scanner.hasNextInt()){
//                number = scanner.nextInt();
//                if (Math.abs(number) >= 10 ){
//                    break;
//                } else {
//                    System.out.print("Число должно содержать минимум 2 цифры! Попробуйте снова: ");
//                }
//            } else {
//                System.out.print("Некорректный ввод. Введите целое число: ");
//                scanner.next();
//            }
//        }
//        int result = methods.sumLastNums(number);
//        System.out.println("Сумма двух последних цифр: " + result);

        // 4. Есть ли позитив
        System.out.print("Введите число для проверки является ли оно положительным: ");
        int number = scanner.nextInt();
        boolean isPositiveResult = methods.isPositive(number);
        System.out.println("Итог: " + isPositiveResult);

        scanner.close();
    }
}