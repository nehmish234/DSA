public class Parenthesis {
    //to reduce space complexiy we can use stringbuilder in place of string because every time new string is created using string
    //Stringbuilder str=new Stringbuilder();
    public static void main(String[] args) {
        int n = 3;
        String ans = "";
        int open = 0;
        int close = 0;
        validParenthesis(n, ans, open, close);
    }

    private static void validParenthesis(int n, String ans , int open, int close) {
        if (ans.length() == 2 * n) {
            System.out.println(ans);
            return;
        }
        if (open < n) {
            // so here we can also str=str+"("
            validParenthesis(n, ans + "(", open + 1, close);
        }
        if (close < open) {
            // so here we can also str=str+")"
            validParenthesis(n, ans + ")", open, close + 1);
        }
    }
}
