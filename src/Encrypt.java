import java.nio.charset.StandardCharsets;

public class Encripto {
    public static void Cripto() {
        byte[] byteIn = FileInputOutput.FileIN();
        System.out.println("Введите шаг сдвига: ");
        int step = Input.input(0, 50);
        String stringData = new String(byteIn, StandardCharsets.UTF_8);
        System.out.println(stringData);
        String encryptedMessage = encrypt(stringData, step);
        System.out.println("Зашифрованное сообщение: " + encryptedMessage);
        FileInputOutput.Write(encryptedMessage);
    }

    public static String encrypt(String text, int step) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char encryptedChar = (char) (((c - 'a' + step) % 26) + 'a');
                encrypted.append(encryptedChar);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }
}
