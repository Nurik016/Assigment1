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

    //CASE4: Calculate factorial of a number
    public static int factorial(int n) {
        if (n == 0) {
            return 1; //Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); //Recursive call
        }
    }


    //CASE5: Find nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0 || n <= 0) {
            return 0; //Base case: 0th Fibonacci number is 0
        } else if (n == 1) {
            return 1; //Base case: 1st Fibonacci number is 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); //Recursive calls
        }
    }


    //CASE6: Calculate power of a number
    public static double calculatePower(double a, double n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            //Handle negative exponent
            return 1 / calculatePower(Math.abs(a), Math.abs(n));
        } else {
            //Positive exponent (existing logic)
            return a * calculatePower(a, n - 1);
        }
    }


    //CASE7: Reverse elements of an array
    public static void reverseArray(int n, int[] arr, int index) {
        if (index == n) {
            //Base case: Reached the end of the array
            return;
        }
        //Recursively print elements from the end to the beginning
        reverseArray(n, arr, index + 1);
        System.out.print(arr[index] + " ");
    }


    //CASE8: Check if a string consists only of digits
    public static boolean isAllDigits(String s) {
        if (s.length() == 0)
            return true;
        else {
            char firstChar = s.charAt(0);
            if (Character.isDigit(firstChar))
                return isAllDigits(s.substring(1));
            else
                return false;
        }
    }


    //CASE9: Calculate binomial coefficient
    public class BinomialCoefficient {
        static int binomialCoeff(int n, int k) {
            if (n < 0 || k < 0) {
                System.out.println("You need to use only positive numbers.");
                return -1; //Return -1 to indicate an error
            } else if (k == 0 || k == n) {
                return 1;
            } else {
                int result = binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
                System.out.println("The binomial coefficient of (" + n + ", " + k + ") is: " + result);
                return result;
            }
        }
    }
}
