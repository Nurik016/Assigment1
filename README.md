# First Commit
The method takes an array arr and the current index index as input parameters.
It checks if index is at the end of the array (arr.length - 1). If so, it returns the element at that index, as it's the last element and thus the minimum.
If the index is not at the end, it recursively calls itself with the next index (index + 1).
At each recursive call, it compares the current element at arr[index] with the minimum found so far in the recursive calls (min). It returns the smaller of the two.
Eventually, the recursion reaches the end of the array, and the minimum element is bubbled back up through the recursive calls.
# Second Commit
The method takes an array arr, the current index index, and the current sum sum as input parameters.
It checks if index is equal to the length of the array. If so, it returns the ratio of the sum to the length of the array, which represents the average.
If the index is not at the end, it adds the current element at arr[index] to the sum.
It recursively calls itself with the next index (index + 1) and the updated sum.
At each recursive call, the sum keeps accumulating until the base case is reached.
Once the base case is reached (end of the array), the method returns the average by dividing the sum by the length of the array.
# Third Commit
The method first checks if the number num is less than or equal to 1. If so, it returns false, as numbers less than or equal to 1 are not prime.
It then checks if num is divisible by 2 and greater than 2. If true, it returns false, as even numbers greater than 2 cannot be prime.
It iterates through odd numbers starting from 3 up to the square root of num.
For each odd number i, it checks if num is divisible by i. If it finds any divisor, it returns false, indicating that the number is not prime.
If no divisors are found, it returns true, indicating that the number is prime.
# Fourth Commit
The method checks if the input n is equal to 0. If so, it returns 1, as the factorial of 0 is 1.
Otherwise, it calculates the factorial recursively by multiplying n with the factorial of n - 1.
The recursion continues until n reaches 0.
Each recursive call reduces n by 1, ensuring that the recursion reaches the base case.
# Fifth Commit
The method first checks if n is 0 or negative. If so, it returns 0, as per the definition of the Fibonacci sequence.
It checks if n is 1. If so, it returns 1, as the first Fibonacci number is 1.
Otherwise, it recursively calculates the nth Fibonacci number by summing the (n-1)th and (n-2)th Fibonacci numbers.
The recursion continues until it reaches the base cases (n=0, n=1).
# Sixth Commit
The method first checks if n is 0. If so, it returns 1, as any number raised to the power of 0 is 1.
It checks if n is negative. If so, it handles the negative exponent by recursively calculating the positive exponent of the absolute value of n and then taking the reciprocal of the result.
Otherwise, for positive exponents, it recursively calculates the exponentiation by multiplying a with the result of calculatePower(a, n - 1).
The recursion continues until it reaches the base case.
# Seventh Commit
The method uses recursion to traverse the array from the last element to the first element.
At each recursive call, it prints the element at the current index, effectively printing the array in reverse order.
The recursion continues until it reaches the base case, where it has traversed all elements of the array.
# Eighth Commit
The method first checks if the length of the input string s is 0. If so, it returns true, as an empty string is considered to consist only of digits.
If the string is not empty, it checks the first character of the string using Character.isDigit() method to determine if it's a digit.
If the first character is a digit, it recursively calls isAllDigits() with the substring starting from index 1.
The recursion continues until the entire string is processed or a non-digit character is encountered.
If any non-digit character is encountered during recursion, the method returns false, indicating that not all characters are digits.
# Ninth Commit
The method first checks if either n or k is negative. If so, it prints a message indicating that only positive numbers should be used and returns -1 to indicate an error.
It checks if k is 0 or if k is equal to n. If either condition is true, it returns 1, as these are the base cases for binomial coefficients.
Otherwise, it recursively calculates the binomial coefficient using the formula C(n, k) = C(n-1, k-1) + C(n-1, k).
The recursion continues until it reaches the base cases.
# Ten Commit
The method uses the Euclidean algorithm to calculate the GCD.
It checks if b is 0. If so, it returns a, as the GCD of any number and 0 is the number itself.
Otherwise, it recursively calculates the GCD of b and the remainder of a divided by b.
The recursion continues until b becomes 0, at which point the method returns the value of a, which is the GCD.