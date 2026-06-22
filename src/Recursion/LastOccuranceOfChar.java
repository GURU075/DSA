package Recursion;

public class LastOccuranceOfChar {
    public static void main(String[] args) {
        String str ="abcddedg";
        char ch='d';

         int ans=lastOccLTR(str,ch, 0);
        System.out.println(ans);

      int ansRTL = lastOccRTL(str,ch,str.length()-1);
        System.out.println(ansRTL);
    }

    private static int lastOccLTR(String str, char ch, int i) {

        if(i>=str.length()){
            return -1;
        }
        int ans= lastOccLTR(str,ch,i+1);
        if(ans==-1&&str.charAt(i)==ch){
            return i;
        }
        return ans;

    }

    public static int lastOccRTL(String str,char ch,int i){
           if(i<0) return -1;

           int ansRTL = lastOccRTL(str,ch,i-1);

           if(str.charAt(i)==ch){
               return i;
           }

           return ansRTL;
    }
//    private static void lastOccLTR(String str, char ch, int i, int ans) {
//
//        if(i>=str.length()){
//            System.out.println(ans);
//            return ;
//        }
//        if(str.charAt(i)==ch){
//            ans=i;
//        }
//        lastOccLTR(str,ch,i+1,ans);
//    }
}
