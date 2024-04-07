import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompting the user to enter a problem number between 1 and 10
        System.out.print("Enter a problem between 1 and 10: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                //Problem 1: Finding minimum of an array
                System.out.println("Problem1. You are given a number “n” and an array of “n” elements,\n" +
                        "write the function that returns minimum of them.\n");

                //Getting the size of the array
                System.out.print("Enter the size of the array: ");
                int size = scanner.nextInt();

                int[] arr = new int[size];

                //Getting the array elements from the user
                System.out.print("Enter the array elements: ");
                for (int i = 0; i < size; i++) {
                    arr[i] = scanner.nextInt();
                }

                //Finding and printing the minimum element
                int min = Assigment1.findMin(arr, 0);
                System.out.println("The minimum element is " + min);
                break;


            case 2:
                //Problem 2: Finding average of an array
                System.out.println("Problem2. You are given a number “n” and an array of “n” elements,\n" +
                        "write the function that returns average of them.\n");

                //Getting the size of the array
                System.out.print("Enter the size of the array: ");
                size = scanner.nextInt();

                arr = new int[size];

                //Getting the array elements from the user
                System.out.print("Enter the array elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = scanner.nextInt();
                }

                //Finding and printing the average of the array elements
                double average = Assigment1.findAverage(arr, 0, 0);
                System.out.println("The average of the array is " + average);
                break;


            case 3:
                //Problem 3: Checking if a number is prime
                System.out.println("Problem3. You are given a number “n”, write the function for checking\n" +
                        "whether“n” is prime.\n");

                //Getting the number from the user
                System.out.print("Enter a number: ");
                number = scanner.nextInt();

                //Checking if the number is prime and printing the result
                if (Assigment1.isPrime(number)) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is a composite number.");
                }
                break;


            case 4:
                //Problem 4: Finding factorial using recursion
                System.out.println("Problem4. You are given a number “n”, write the program using recursion for\n" +
                        "finding “n!”\n");

                //Getting the number from the user
                System.out.print("Enter a number: ");
                number = scanner.nextInt();

                //Finding and printing the factorial of the number
                if (number < 0) {
                    System.out.println("Factorial of " + number + " is: ∞");
                } else {
                    double result = Assigment1.factorial(number);
                    System.out.println("Factorial of " + number + " is: " + result);
                }
                break;


            case 5:
                //Problem 5: Finding Fibonacci sequence using recursion
                System.out.println("Problem5. You are given a number “n”, write the function for finding n-th\n" +
                        "elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2).\n" +
                        "F0= 0, F1 = 1.\n");

                //Getting the number from the user
                System.out.print("Enter a number: ");
                number = scanner.nextInt();

                //Finding and printing the nth Fibonacci number
                double result = Assigment1.fibonacci(number);
                System.out.println("The " + number + "th Fibonacci number is: " + result);
                break;


            case 6:
                //Problem 6: Calculating power of a number
                System.out.println("Problem6. You are given numbers “a” and “n”, write the function that " +
                        "returns a^n\n");

                //Getting the numbers from the user
                System.out.print("Enter the value of a: ");
                double a = scanner.nextInt();

                System.out.print("Enter the value of n: ");
                double n = scanner.nextInt();

                //Finding and printing a^n
                result = Assigment1.calculatePower(a, n);
                System.out.println(a + " raised to the power of " + n + " is: " + result);
                break;
        }
        scanner.close();
    }
}
