package Recursion;

public class RemoveOccuranceOfSubString {
    static String str= "ababcaabaabcbcababcc";
    public static void main(String[] args) {
        String part ="abc";
        System.out.println(removeOccurrences(part));
        
    }

    public static String removeOccurrences( String part) {

        int found = str.indexOf(part);
        
        if(found!=-1){
            str=str.substring(0,found)+str.substring(found+part.length());
        }else{
            return str;
        }
        return removeOccurrences(part);
    }
}
