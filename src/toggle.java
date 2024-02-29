public class toggle {
    public static void main(String[] args) {
        String A="HelLo";
        System.out.println(solve(A));


        }

    private static String solve(String a) {
        char[] chars = a.toCharArray();

        for(int i=0;i<a.length();i++){
            if(chars[i]>='A'&& chars[i]<='Z'){
                chars[i]=(char)((int)chars[i] +32);
            }
            else{
                chars[i]=(char)((int)chars[i]-32);
            }
        }
        return String.valueOf(chars);
    }
}
