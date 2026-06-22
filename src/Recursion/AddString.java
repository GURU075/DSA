package Recursion;

public class AddString {
    public static void main(String[] args) {
        System.out.println(addStrings("123", "75"));
    }

        public static String addStrings(String num1, String num2) {

            int carry =0;
            String ans ="";
            int i=num1.length()-1;
            int j=num2.length()-1;
            return addReverse(num1,num2,carry,ans,i,j);
        }

        public static String addReverse(String num1,String num2,int carry,String ans,int i,int j){
            if(i<0&&j<0){
                if(carry>0)
                    return carry+ans;
                return ans;
            }
            int a=0;
            int b=0;
            if(i>=0)
                a = Character.getNumericValue(num1.charAt(i));

            if(j>=0)
                b= Character.getNumericValue(num2.charAt(j));

            int sum =a+b+carry;
            carry =0;
            if(sum>9){
                carry=1;
                sum=sum-10;
            }
            return addReverse(num1,num2,carry,sum+ans,i-1,j-1);
        }
    }

