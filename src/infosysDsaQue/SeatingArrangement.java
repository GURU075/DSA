package infosysDsaQue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeatingArrangement {
    public static int solve(int N, int K, String occ) {

        ArrayList<Integer> pos = new ArrayList<>();

        pos.add(0);
        for(int i=0;i<occ.length();i++){
            if(occ.charAt(i)=='1'){
                pos.add(i+1);
            }
        }
        pos.add(N+1);

        int high =N+1;
        int low =1;
         int ans = high;

         while(low<high){
             int mid = low + (high-low)/2;
             if(canMake(pos,K,mid)){
                 ans = mid;
                 high = mid-1;
             }else{
                 low = mid+1;
             }
         }
         return ans;
    }
    private static boolean canMake(List<Integer> pos,int k,int maxGap ){
        int needed = 0;

        for(int i=1;i<pos.size();i++){
            int gap = pos.get(i)-pos.get(i-1);
            needed += (gap-1)/maxGap;
            if(needed>k){
                return false;
            }
        }
        return needed<=k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        String occ = sc.next();

        int result = solve(N, K, occ);
        System.out.println(result);
    }
}


