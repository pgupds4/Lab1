import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    // Scanner для ввода данных с клавиатуры
    public static Scanner in = new Scanner(System.in);
    // PrintStream для вывода сообщений на экран
    public static PrintStream out = System.out;

    public static void main(String[] args) {

        // Запрашиваем у пользователя ввод переменной a
        out.print("Введите a: ");
        double a = in.nextDouble();

        // Запрашиваем у пользователя ввод переменной b
        out.print("Введите b: ");
        double b = in.nextDouble();

        // Решение неравенства (x - a) / (b * x) >= 0
        // Начинаем с проверки значения b, так как деление на ноль невозможно
        if (b == 0) {
            // Если b = 0, то (x - a) / 0 не определено
            out.println("Решений нет, так как b = 0 и (x - a) / 0 не определено");
        } else { // Если b не равно 0, то продолжаем решение
            if (a < 0) { // Рассматриваем случай, когда a < 0
                if (b < 0) {
                    // Если b < 0, то решение x ∈ [a, 0)
                    out.println("Решение: x ∈ [" + a + ", 0)");
                } else if (b > 0) {
                    // Если b > 0, то решение: x ∈ (-∞, a] ∪ (0, +∞)
                    out.println("Решение: x ∈ (-∞, " + a + "] ∪ (0, +∞)");
                }
            } else if (a == 0) { // Рассматриваем случай, когда a = 0
                if (b < 0) {
                    // Если b < 0, то решений нет, так как выражение будет всегда меньше 0
                    out.println("Решений нет, так как x / (b * x) всегда < 0");
                } else if (b > 0) {
                    // Если b > 0, то решение: x ∈ R \\ {0}, то есть все числа, кроме 0
                    out.println("Решение: x ∈ R \\ {0}");
                }
            } else { // Рассматриваем случай, когда a > 0
                if (b < 0) {
                    // Если b < 0, то решение: x ∈ (0, a]
                    out.println("Решение: x ∈ (0, " + a + "]");
                } else if (b > 0) {
                    // Если b > 0, то решение: x ∈ (-∞, 0) ∪ [a, +∞)
                    out.println("Решение: x ∈ (-∞, 0) ∪ [" + a + ", +∞)");
                }
            }
        }
    }
}
