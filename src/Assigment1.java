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


    //CASE2: Find average of elements in an array
    public static double findAverage(int[] arr, int index, int sum) {
        //Base case: if we reached the end of the array, return the average
        if (index == arr.length) {
            return (double) sum / arr.length;
        }
        //Add the current element to the sum
        sum += arr[index];
        //Move to the next element and call recursively
        return findAverage(arr, index + 1, sum);
    }


    //CASE3: Check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 1 or less are not prime
        }
        //No need to check for even numbers except 2
        if (num % 2 == 0 && num > 2) {
            return false;
        }
        //Check divisibility only up to the square root of num
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
