import java.nio.charset.StandardCharsets;

public class Decripto {
    public static void Cripto() {
        byte[] byteIn = FileInputOutput.FileIN();
        System.out.println("Введите шаг сдвига: ");
        int step = Input.input(0, 50);
        String stringData = new String(byteIn, StandardCharsets.UTF_8);
        System.out.println(stringData);
        String decryptedText = decrypt(stringData.toLowerCase(), step);
        System.out.println("Расшифрованный текст: " + decryptedText);
    }

    public static String decrypt(String text, int step) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char decryptedChar = (char) (((c - 'a' - step + 26) % 26) + 'a');
                decrypted.append(decryptedChar);
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}
