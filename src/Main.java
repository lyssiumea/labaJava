import java.util.Scanner; // для считывание ввода данных пользователя

public class Main {
    public static void main(String[] args) {

        Methods methods = new Methods();
        Scanner scanner = new Scanner(System.in);

        // Сумма знаков
        System.out.print("Введите число (не менее 2х знаков): ");
        int number;
        while (true) { // проверка на дурака
            if (scanner.hasNextInt()){
                number = scanner.nextInt();
                if (Math.abs(number) >= 10 ){
                    break;
                } else {
                    System.out.print("Число должно содержать минимум 2 цифры! Попробуйте снова: ");
                }
            } else {
                System.out.print("Некорректный ввод. Введите целое число: ");
                scanner.next();
            }
        }
        int result = methods.sumLastNums(number);
        System.out.println("Сумма двух последних цифр: " + result);

        scanner.close();
    }
}