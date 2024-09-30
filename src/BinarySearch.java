import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {

    // Function 1: Standard Binary Search
    public int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        return -1; // Target not found
    }

    // Function 2: Recursive Binary Search
    public int recursiveBinarySearch(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1; // Base case: not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] < target) {
            return recursiveBinarySearch(arr, mid + 1, high, target); // Search right half
        } else {
            return recursiveBinarySearch(arr, low, mid - 1, target); // Search left half
        }
    }

    // Function 3: Binary Search for First Occurrence
    public int binarySearchFirstOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid; // Store index and search left
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    // Function 4: Binary Search for Last Occurrence
    public int binarySearchLastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid; // Store index and search right
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    // Function 5: Find the Smallest Element Greater Than or Equal to the Target
    public int findCeiling(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                result = mid; // Candidate for ceiling
                high = mid - 1; // Search left
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    // Function 6: Find the Largest Element Less Than or Equal to the Target
    public int findFloor(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                result = mid; // Candidate for floor
                low = mid + 1; // Search right
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    // You can add more methods or logic as needed.


    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        int[] arr = {1, 2, 4, 6, 8, 10, 12};

        // Example: Standard Binary Search
        int result = bs.binarySearch(arr, 6);
        System.out.println("Index of 6: " + result);

        // Example: Recursive Binary Search
        int recursiveResult = bs.recursiveBinarySearch(arr, 0, arr.length - 1, 6);
        System.out.println("Recursive index of 6: " + recursiveResult);

        // Example: Find First Occurrence
        int firstOccurrence = bs.binarySearchFirstOccurrence(arr, 4);
        System.out.println("First occurrence of 4: " + firstOccurrence);

        // Example: Find Last Occurrence
        int lastOccurrence = bs.binarySearchLastOccurrence(arr, 4);
        System.out.println("Last occurrence of 4: " + lastOccurrence);

        // Example: Find Ceiling
        int ceiling = bs.findCeiling(arr, 5);
        System.out.println("Ceiling of 5: " + (ceiling != -1 ? arr[ceiling] : "Not found"));

        // Example: Find Floor
        int floor = bs.findFloor(arr, 5);
        System.out.println("Floor of 5: " + (floor != -1 ? arr[floor] : "Not found"));
    }
}
