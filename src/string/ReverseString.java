package string;

public class ReverseString {
    public static void main(String[] args) {
        String str = new String("//GURU#$");
        char[] ch = str.toCharArray();

        int i=0;
        int j=ch.length-1;

        while(i<j){

            while(i<j && !Character.isLetter(ch[i])){
                i++;
            }
            while(i<j && !Character.isLetter(ch[j])){
                j--;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        System.out.println(new String(ch));
    }
}
