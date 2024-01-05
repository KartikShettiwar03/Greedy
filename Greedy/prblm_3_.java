import java.util.*;

public class prblm_3_{
    public static void main(String args[]){
        int arr1[] = {2,4,1};
        int arr2[] = {1,5,3};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        long sum = 0;
        for(int i=0 ; i<arr1.length ; i++){
            sum += Math.abs(arr1[i]-arr2[i]);
        }
        System.out.println(sum);
    }
}