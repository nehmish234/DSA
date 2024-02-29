public class Test {

        public static void main(String[] args) {
            String input = "Hello, World!";
            findAndPrintVowels(input);
        }

        public static void findAndPrintVowels(String input) {
            System.out.println("String: " + input);
            System.out.print("Vowels: ");

            for (char c : input.toLowerCase().toCharArray()) {
                if (isVowel(c)) {
                    System.out.print(c + " ");
                }
            }

            System.out.println(); // Move to the next line after printing vowels
        }

        private static boolean isVowel(char c) {
            return "aeiou".indexOf(c) != -1;
        }

}
