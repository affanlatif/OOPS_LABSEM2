import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine();
        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        char[] a = first.toCharArray();
        char[] b = second.toCharArray();
        boolean[] used = new boolean[b.length];
        boolean anagram = true;
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != ' ' && a[i] != '\t') {
                countA++;
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (b[i] != ' ' && b[i] != '\t') {
                countB++;
            }
        }

        if (countA != countB) {
            anagram = false;
        } else {
            for (int i = 0; i < a.length && anagram; i++) {
                char chA = a[i];

                if (chA == ' ' || chA == '\t') {
                    continue;
                }

                if (chA >= 'A' && chA <= 'Z') {
                    chA = (char) (chA + 32);
                }

                boolean found = false;

                for (int j = 0; j < b.length; j++) {
                    char chB = b[j];

                    if (chB == ' ' || chB == '\t' || used[j]) {
                        continue;
                    }

                    if (chB >= 'A' && chB <= 'Z') {
                        chB = (char) (chB + 32);
                    }

                    if (chA == chB) {
                        used[j] = true;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    anagram = false;
                }
            }
        }

        if (anagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        sc.close();
    }
}