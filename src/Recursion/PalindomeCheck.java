package Recursion;

public class PalindomeCheck {
    public static void main(String[] args) {
        String str="acbdca";

        boolean flag =checkPalindome(str,0,str.length()-1);
        if(flag==true){
            System.out.println("Palindrome");
        }else {
            System.out.println("not Palindrome");
        }
    }

    private static boolean checkPalindome(String str, int i, int j) {
        if(i>j){
            return true;
        }
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        return checkPalindome(str,i+1,j-1);

    }


}
