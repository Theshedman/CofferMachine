import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // handle case
        char letter = Character.toLowerCase(ch);

        for (char vowel : vowels) {
            if (letter == vowel) {
                return true;
            }
        }

        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
