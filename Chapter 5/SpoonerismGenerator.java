import java.util.Scanner;

public class SpoonerismGenerator {
    
    public static void main(String[] args) {
        SpoonerismGenerator generator = new SpoonerismGenerator();
        generator.run();
    }

    private String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private int vowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return i;
            }
        }
        return -1;
    }

    private void run() {
        String word1 = getWord("Enter the 1st word: ");
        String word2 = getWord("Enter the 2nd word: ");

        int a1 = vowelIndex(word1);
        int a2 = vowelIndex(word2);

        if (a1 > 0 && a2 > 0) {
           
            String initialConsonant1 = word1.substring(0, a1);
            String initialConsonant2 = word2.substring(0, a2);
            String spoonerizedWord1 = initialConsonant2 + word1.substring(a1);
            String spoonerizedWord2 = initialConsonant1 + word2.substring(a2);

            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        } else {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        }
    }
}