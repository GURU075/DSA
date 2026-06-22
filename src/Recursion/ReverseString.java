package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        String str= "GURU";
        int last= str.length()-1;
        System.out.println(reverseString(str,0,last));
    }

    private static String reverseString(String str,int first,int last) {
        if(last<first){
            return str;
        }

        StringBuilder sb =new StringBuilder(str);
        char ch=str.charAt(first);
        sb.setCharAt(first,str.charAt(last));
        sb.setCharAt(last,ch);



        return reverseString(sb.toString(),first+1,last-1);
    }
}
