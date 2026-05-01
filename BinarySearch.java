import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,7,8,9};
        int target = 103;
        int result = binaryRecursive(arr, target, 0, arr.length - 1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left<=right) {
            int mid=left+(right-left)/2; // To avoid overflow

            if(arr[mid]== target) {
                return mid; // Return the index of the target element
            }
            else if(arr[mid]<target) {
                left = mid + 1; //Search in the right half
            }
            else {
                right = mid - 1; // Search in the left half
            }
        }
       return -1;
    }

    public static int binaryRecursive(int arr[],int target, int left, int right) {
        if(left>right) {
            return -1; // Base case: target not found
        }
        int mid = left + (right - left) / 2; // To avoid overflow

        if(arr[mid] == target) {
            return mid; // Return the index of the target element
        }
        else if(arr[mid] < target) {
            return binaryRecursive(arr, target, mid + 1, right); // Search in the right half
        }
        else {
            return binaryRecursive(arr, target, left, mid - 1); // Search in the left half
        }
    }
}

