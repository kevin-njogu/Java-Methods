/*Methods are members of classes which provide functionality for the class
* Structure of a method contains return type,method name,parameter list and the method body
* The first line of a method is called signature of a method
* Static methods such as the main method can only call/invoke other static methods
* When primitive data is passed as parameters, their value is passes and a change in formal parameters will not affect the actual parameters
* On the contrary, reference data passes an address to actual object and a change in formal parameter will affect the actual parameter
 */

public class Main {

    public static void main(String[] args) {
        int x =10, y = 20; //these are actual parameters
        int[] arr = {2, 4, 6, 8, 10};

        MethodsPractice mp = new MethodsPractice();
        System.out.println(mp.max(x,y));
        mp.updateArray(arr, 1, 365);

        int num = 19;
        System.out.println("Is num a prime number ? " + mp.isPrime(num));

        System.out.println(mp.getGreatestCommonDivisor(45, 81));
    }
}