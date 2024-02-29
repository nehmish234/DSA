public class StringPallin {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPallindrome(str));

    }

    private static int isPallindrome(String str) {
        int n = str.length();
        if (n <= 1)
            return 1;
        if (str.charAt(0) != str.charAt(n - 1))
            return 0;
        return isPallindrome(str.substring(1, n - 1));
    }
}

