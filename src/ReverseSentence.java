public class ReverseSentence {
    public static void main(String[] args) {
        String str = "The sky is blue";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        String[] strArray = str.split(" ");
            int start=0;
            int end=strArray.length-1;
            while(start<end){
                String temp= strArray[start];
                strArray[start]=strArray[end];
                strArray[end]=temp;
                start++;
                end--;
            }

return String.join(" ",strArray);

    }
}