
public class QickNews {

    private static int partition(int[] arr, int start, int end){
        int index = start -1;
        int pivot = arr[end];
        for(int j = start; j < end; j++){
            if( arr[j] <= pivot ){
                index++;

               int temp = arr[index];
               arr[index] = arr[j];
               arr[j] = temp;
            }
        }
        index++;
        int temp = arr[end];
        arr[end] = arr[index];
        arr[index] = temp;

        return index;
    }

    private static void quickNew(int[] arr, int start, int end){
        if(start < end){
            int pivot = partition(arr, start, end);
            quickNew(arr, start, pivot-1);
            quickNew(arr, pivot + 1, end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,6,3};
        quickNew(arr, 0, arr.length -1);
        for(int val : arr){
            System.out.print(val);
            System.out.print(",");
        }
    }
}
