public class Main {
    public static void main(String[] args) {
        System.out.println("Привет! Выбери из меню что хочешь сделать.\n" +
                "1.Шифровка текста\n" +
                "2.Расшифровка текста с помощью ключа\n" +
                "3.Расшифровка текста с помощью brute force (перебор всех вариантов)\n" +
                "Введите число от 1 до 3.");
        int input = UserInput.input(0, 3);
        switch (input) {
            case 1:
                Encrypt.encrypt();
                break;
            case 2:
                Decrypt.decrypt();
                break;
            case 3:
                BrutForce.main();
                break;
        }
    }
}