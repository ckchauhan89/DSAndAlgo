public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int start = 0,  mid = 0;
        int end = arr.length-1;
        int searchIteam = 10;
        for(int i = 0; i <= mid+1; i++){
            System.out.println();
            mid = (start+end)/2;
            if(searchIteam == arr[mid]){
                System.out.println("found");
                break;
            }else if(searchIteam > arr[mid]){
                start = mid + 1;

            }else {
                end = mid -1;
            }
        }
    }
}
