public class Assigment1 {

    //CASE1: Find minimum element in an array
    public static int findMin(int[] arr, int index) {
        //Base case: if theres only 1 element in the array
        if (index == arr.length - 1) {
            return arr[index];
        }
        //Recursive call to find the minimum element
        int min = findMin(arr, index + 1);
        //Return the minimum of the current element and the minimum found so far
        return Math.min(arr[index], min);
    }
}
