package linearSearch;

import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
       int[] arr = {3,6,8,5,2,1};
        System.out.println(search6(arr, 5,2,10));
    }


    // Search item in the array : return index if item is found,
    // return -1 if item not found.
    static int search(int[] array, int target){

        if (array.length == 0){
            return -1;
        }
        for (int index=0; index<array.length; index++){
            // Check for element at every index with the target.
            if (array[index] == target){
                return index;
            }
        }
        // if execution reaches here means, element does not exist.
        return -1;
    }


    // Search using enhanced for loop.
    static boolean search2(int[] array, int target){

        if (array.length == 0){
            return false;
        }
        for (int element : array){
            // Check for element at every index with the target.
            if (element == target){
                return true;
            }
        }
        // if execution reaches here means, element does not exist.
        return false;
    }

    // Linear search in 2-D arrays.
    // Search in 2-D array : return position ([row, column]) of target if found,
    // else return empty array.

    static int[] search3(int[][] array, int target){

        int[] ans = new int[2];
        // Searching element in every column of rows.

        for (int row=0; row< array.length; row++) {

            for (int column=0; column<array[row].length; column++) {

                if (array[row][column] == target){
                    ans[0] = row;
                    ans[1] = column;
                    return ans;
                }
            }
        }
        //If execution reaches here, it means target is not found,
        // return empty array.
        return new int[]{};
    }

    //Since string is also an array, we can apply linear search to find a char in string.

    static boolean search4(String str, char chr){
        if (str.length() == 0){
            return false;
        }
        for (int i=0; i<str.length(); i++){
            // Iterating over the string with for loop and method .charAt()
            if (str.charAt(i) == chr){
                return true;
            }
        }
        // if execution reaches here means target character does not exist,
        // hence, return false.
        return false;
    }

    //Searching in a string using enhanced for loop.

    static boolean search5(String str, char chr){
        if (str.length() == 0){
            return false;
        }
        // Iterating over the string and checking with the target.
        for (char element : str.toCharArray()){
            if (element == chr){
                return true;
            }
        }
        // If control reaches here, means target element does not exist.
        // hence, return false.
        return false;
    }

    // searching in the given range.
    // Same as normal linear search, only replace conditions of for loop with given range.

    static int search6(int[] array, int target, int start, int end){

        if (array.length == 0){
            return -1;
        }
        for (int index=start; index<=end; index++){
            // Check for element at every index with the target.
            if (array[index] == target){
                return index;
            }
        }
        // if execution reaches here means, element does not exist.
        return -1;
    }

}
