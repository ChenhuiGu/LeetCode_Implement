package src;

import java.util.Arrays;

public class GetLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        // k == arr.length
        return quickSort(arr,0,arr.length-1,k);
    }
    private int[] quickSort(int[] arr,int l,int r,int k){
        int i = l,j = r;
        while (i<j){
            // arr[0]为最小值
            while (i<j && arr[j] >= arr[l]){
                j--;
            }
            while (i<j && arr[i] <= arr[l]){
                i++;
            }
            swap(arr,i,j);
        }
        swap(arr,l,i);
        if(k > i) quickSort(arr,i+1,r,k);
        if(k < i) quickSort(arr,l,i-1,k);
        return Arrays.copyOf(arr,k);
    }
    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
