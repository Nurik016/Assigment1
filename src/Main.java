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
        }
        scanner.close();
    }
}
