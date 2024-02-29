public class CVRD {
    public static void main(String[] args) {
        String A = "aeiOUz";
        operations(A);

    }

    private static String operations(String A) {
        String B = A.concat(A);
        System.out.println(B);
        char[] charArray = B.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                charArray[i] = ' ';
            }
        }
        System.out.println(charArray);
        String str1 = String.valueOf(charArray).trim().replaceAll("\\s+", "");
        char[] charArray2 = str1.toCharArray();
        for (int i = 0; i < charArray2.length; i++) {
            if (charArray2[i] == 'a' || charArray2[i] == 'e' || charArray2[i] == 'i' || charArray2[i] == 'o' || charArray2[i] == 'u') {
                charArray2[i] = '#';
            }
        }
        System.out.println(charArray2);
        return String.valueOf(charArray2);
    }
}
