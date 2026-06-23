package sorting;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = new int[]{13,21,3,42,10,2,5};

        //insertion sort
        for (int n:arr){
            System.out.print(n+" ");
        }

        InsertionSort.sortArray(arr);
        System.out.println();
        for (int n:arr){
            System.out.print(n+" ");
        }
    }
}
