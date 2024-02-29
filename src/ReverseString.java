import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        /*System.out.println(s(str));*/
        s(str);
    }

    public static String s(String str) {
        char[] ch = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;

        }
        System.out.println("Ans "+ Arrays.toString(ch));

        String str1 = String.valueOf(ch);
        System.out.println(str1);
            return str1;
    }
}
