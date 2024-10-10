public class RotationCount {

    // Function to find the number of rotations in the array
    public static int findRotationCount(int[] A, int low, int high) {
        // Base case: If the array is not rotated
        if (A[low] <= A[high]) {
            return low;
        }

        // Find the middle element
        int mid = low + (high - low) / 2;

        // Check if mid is the pivot (smallest element)
        if (mid < high && A[mid] > A[mid + 1]) {
            return mid + 1;
        }
        if (mid > low && A[mid] < A[mid - 1]) {
            return mid;
        }

        // Decide whether to search in the left or right half
        if (A[mid] <= A[high]) {
            return findRotationCount(A, low, mid - 1);
        } else {
            return findRotationCount(A, mid + 1, high);
        }
    }

    // Driver function to find the number of rotations
    public static int rotationCount(int[] A) {
        return findRotationCount(A, 0, A.length - 1);
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] A = {15, 18, 2, 3, 6, 12};
        int k = rotationCount(A);
        System.out.println("The array has been rotated " + k + " times.");
    }
}
