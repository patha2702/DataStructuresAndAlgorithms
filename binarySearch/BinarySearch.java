package binarySearch;
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {-12, -6, 0, 3, 8, 12, 15, 20, 21, 23, 24, 25};
        System.out.println(ascendingBinarySearch(array, 23));
    }

    //Binary search returns the index of target, if exists.
    static int ascendingBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // Search until search space becomes 1, i.e. only 1 element remaining in search space.
        while (start <= end) {
            // find index of middle element using formula,
            int mid = start + (end - start) / 2;
            int element = arr[mid];
            // If middle element is greater than target element, then search in left search space of the middle element.
            if (element > target) {
                end = mid - 1;
                // Search in right search space of middle element, if middle element is less than target element.
            } else if (element < target) {
                start = mid + 1;
                // If middle element is equal to target element, then return the index of the element.
            } else {
                return mid;
            }
        }
        // If execution reaches here, means target element does not exist,
        // hence, return -1.
        return -1;
    }

    static int descendingBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // Search until search space becomes 1, i.e. only 1 element remaining in search space.
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int element = arr[mid];
            // If middle element is greater than target element, then search in left search space of the middle element.
            if (element < target) {
                end = mid - 1;
                // Search in right search space of middle element, if middle element is less than target element.
            } else if (element > target) {
                start = mid + 1;
                // If middle element is equal to target element, then return the index of the element.
            } else {
                return mid;
            }
        }
        // If execution reaches here, means target element does not exist,
        // hence, return -1.
        return -1;
    }
}
