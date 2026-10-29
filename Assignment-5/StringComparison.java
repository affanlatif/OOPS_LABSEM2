public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println("Comparing str1 and str2:");
        System.out.println("Using == : " + (str1 == str2));
        System.out.println("Using equals(): " + str1.equals(str2));

        System.out.println("\nComparing str1 and str3:");
        System.out.println("Using == : " + (str1 == str3));
        System.out.println("Using equals(): " + str1.equals(str3));

        System.out.println("\nComparing str3 and str4:");
        System.out.println("Using == : " + (str3 == str4));
        System.out.println("Using equals(): " + str3.equals(str4));
    }
}