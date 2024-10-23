import java.util.Scanner;

public class Input {
    public static int input(int start, int end) {
        int input;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Введите число от "+start+" до "+end+".");
            } else {
                input = scanner.nextInt();
                if (!(input > start && input <= end)) {
                    System.out.println("Число за пределами заданного диапазона.");
                } else {

                    return input;
                    }
                }
            }
        }
}
