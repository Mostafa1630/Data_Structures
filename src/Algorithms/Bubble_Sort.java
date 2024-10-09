package Algorithms;

public class Bubble_Sort {

    public int[] BubbleSortAsc(int[] arr) {
        int n = arr.length;
        // Outer loop to control the number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to perform comparisons within the unsorted portion
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1] if they are in the wrong order
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }
            }
        }
        return arr;
    }


    public int[] BubbleSortDesc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
           for (int j = 0; j < n-i-1; j++){
               if (arr[j] < arr[j+1]){
                   int tem = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = tem;

               }

           }
        }
        return arr;
    }

    public void Display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // For cleaner output
    }

    public static void main(String[] args) {
        int[] testBubbleSort = new int[]{3, 5, 79, 9, 8, 1};
        Bubble_Sort bubbleSort = new Bubble_Sort();

        // Sorting the array and displaying the sorted result
//        bubbleSort.Display(bubbleSort.BubbleSortAsc(testBubbleSort));
        bubbleSort.Display(bubbleSort.BubbleSortDesc(testBubbleSort));
    }

}