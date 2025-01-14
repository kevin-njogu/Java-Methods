public class MethodsPractice {
    //a and b are formal parameters
    int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    //passing objects as parameters eg. array object
    void updateArray(int[] arr, int index, int value) {
        arr[index] = value;
        for (int i:arr) {
            System.out.println(i + " ");
        }
    }

    //finding a prime number
    boolean isPrime(int n) {
        for (int i =2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //finding GCD
    int getGreatestCommonDivisor(int a, int b) {

        boolean notEquals = true;

        do {
            if (a == b) {
                notEquals = false;
                return a;
            }else if (a > b) {
                a = a - b;
            } else if (a < b) {
                b = b - a;
            }
            }while (notEquals);
        return a;
    }
}
