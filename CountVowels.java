import java.util.Scanner;

public class CountVowels {
    public static void main (String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a word: ");
            String word = scan.nextLine();

            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    count++;
                }
            }
            System.out.println("The word: " + word);
            System.out.println("Total number of vowels: " + count);
        }
    }
}