import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                    arr[j+1] = arr[j];
                    j--;
            }
            arr[j+1]=key;
        }

        return arr;

    }    
    public static void main(String[] args){
        int[] arr = {1,4,2,9,5,6,10,40,30};
        InsertionSort bs = new InsertionSort();
        bs.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
