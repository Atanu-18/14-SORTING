// n-1 times comparison
public class bubbleSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,3,8,1,2};

        //bubble sort

        //time complexity == O(n^2)
        //outer loop --> n-1 elements
        for (int i = 0; i < arr.length - 1; i++) {
            //inner loop
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        printArray(arr);
    }
}