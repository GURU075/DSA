package Recursion;

public class LastOccuranceOfChar1 {

    static int ans=-1;
    public static void main(String[] args) {
        String str ="abcddedg";
        char ch='d';

         lastOccLTR(str,ch, 0);
        System.out.println(ans);


    }

        public static void lastOccLTR(String str, char ch, int i) {

        if(i>=str.length()){
            return ;
        }
        if(str.charAt(i)==ch){
            ans=i;
        }
        lastOccLTR(str,ch,i+1);
    }
}


