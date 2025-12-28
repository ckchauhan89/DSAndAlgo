import java.util.Arrays;

public class ReverseArray
{
    public static void main(String[] args) {
        //Input: arr[] = [1, 4, 3, 2, 6, 5]
        //Output:  [5, 6, 2, 3, 4, 1]
        Integer[] arr = {1, 4, 3, 2, 6, 5};
        int len = arr.length-1;
        for(int i = 0; i <= len; i++)
        {
            int temp = arr[i];
            arr[i] = arr[len];
            arr[len] = temp;
            len--;

        }

        for(int val : arr)
        {
            System.out.print(val);
        }
    }
}
