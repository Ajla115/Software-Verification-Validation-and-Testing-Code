package org.example;
/*Create an isPrime() method in the NumberChecker class that takes an input parameter n and returns whether
the number is prime or not. Afterwards, write a parameterized test for it for the values 2, 5, 17, 19, 211.
 */
public class NumberChecker {

    public boolean isPrime(int num){
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            return true;
        else
            return false;
    }

    public int square(int num){
        int result;
        return result = num * num;
    }

        public  int fibonacci(int n) {
            if (n <= 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                int a = 0;
                int b = 1;
                int result = 0;
                for (int i = 2; i <= n; i++) {
                    result = a + b;
                    a = b;
                    b = result;
                }
                return result;
            }
        }

}


