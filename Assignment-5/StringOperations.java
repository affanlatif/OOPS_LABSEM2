import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int length = chars.length;

        System.out.println("Length: " + length);

        String upper = "";
        String lower = "";

        for (int i = 0; i < length; i++) {
            char ch = chars[i];

            if (ch >= 'a' && ch <= 'z') {
                upper += (char) (ch - 32);
            } else {
                upper += ch;
            }

            if (ch >= 'A' && ch <= 'Z') {
                lower += (char) (ch + 32);
            } else {
                lower += ch;
            }
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        System.out.print("Enter character position (1-" + length + "): ");
        int pos = sc.nextInt();

        if (pos >= 1 && pos <= length) {
            System.out.println("Character: " + chars[pos - 1]);
        } else {
            System.out.println("Invalid position.");
        }

        System.out.print("Enter substring start index: ");
        int start = sc.nextInt();
        System.out.print("Enter substring end index: ");
        int end = sc.nextInt();

        if (start >= 0 && end >= start && end <= length) {
            String sub = "";
            for (int i = start; i < end; i++) {
                sub += chars[i];
            }
            System.out.println("Substring: " + sub);
        } else {
            System.out.println("Invalid substring indices.");
        }

        sc.close();
    }
}