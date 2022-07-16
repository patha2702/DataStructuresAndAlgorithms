package binarySearch;
public class OrderAgnosticBinarySearch{

        public static void main(String[] args) {

            int[] arr = {9,8,7,6,0,-6,-9};
            System.out.println(agnosticSearch(arr,7));
        }

        static int agnosticSearch(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;
            boolean isAsc = (arr[start] <= arr[end]);

            while (start <= end) {

                int mid = start + (end - start) / 2;
                int element = arr[mid];

                if (element == target) {
                    return mid;
                }
                if (isAsc) {
                    if (element > target) {
                        end = mid - 1;
                    }else{
                            start = mid + 1;
                    }
                } else {
                    if (element < target) {
                        end = mid - 1;
                    }else{
                        start = mid + 1;
                    }
                }
            }
            return -1;

}
}

