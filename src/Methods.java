public class Methods { // Задание 1. Методы

    // 2. Сумма знаков
    public  int sumLastNums (int x) {
        int lastNum = x % 10;
        int secondLastNum = (x / 10) % 10;
        return lastNum + secondLastNum; // возврат суммы 2 последних знаков числа x
    }

    // 4. Есть ли позитив
    public boolean isPositive (int x) {
        return x > 0; // число  положительное
    }

    // 6. Большая буква
//    public bool isUpperCase (char x) {
//
//    }

    // 8. Делитель
//    public bool isDivisor (int x, int b) {
//
//    }

    // 10. Многократный вызов
//    public int lastNumSum (int a, int b) {
//
//    }
}
