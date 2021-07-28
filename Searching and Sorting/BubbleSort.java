import java.util.Arrays;

public class BubbleSort {
    boolean swap;
    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            swap = false;
            for (int j = 0; j < arr.length - i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }    
            }
            if(swap == false)
                break;
        }
        return arr;
    }    
    public static void main(String[] args){
        int[] arr = {1,4,2,9,5,6,10,40,30};
        BubbleSort bs = new BubbleSort();
        bs.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
