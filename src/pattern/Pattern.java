package pattern;

import exception.guruException;

public class Pattern {
    public static void main(String[] args) {
        try{
            for (int i = 0; i < 4; i++) {
                for (int k = 0; k < 4 - i; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 + 1; j++) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = 3; i > 0; i--) {
                for (int k = 0; k < 4 - i; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 + 1; j++) {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
//            throw new guruException("custom Exception");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
