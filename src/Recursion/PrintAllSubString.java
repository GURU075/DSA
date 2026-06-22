package Recursion;

public class PrintAllSubString {
    public static void main(String[] args) {
        String str= "abcd";
        findAll(str,0,1);
    }

    private static void findAll(String str,int i,int j) {

        if(j<=str.length()&&i<=str.length()){
            System.out.println(str.substring(i,j));
            if(j==str.length()){
                i++;
                j=i;
            }
        }else{
            return;
        }
         findAll(str,i,++j);

    }
}
