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

        System.out.println(mp.getGreatestCommonDivisor(63, 45));

        int[] myArr = {22, 64, 12, 33, 71, 6, 9};
        System.out.println(mp.highestNumber(myArr));

       MethodOverloading mo = new MethodOverloading();
       System.out.println(mo.max(10, 15));
       System.out.println(mo.max(10.2f, 15.3f));
       System.out.println(mo.max(100, 10, 36));

       System.out.println(mo.area(4.5f));
       System.out.println(mo.area(6.5f, 4f));

       mo.reverse(350);

       int[] thisArr = {2, 3, 4, 5, 6, 7};
       mo.reverse(thisArr);

       VariableArguments va = new VariableArguments();
       va.show(10, 30, 66, 77, 98, 1000);
       va.getNames(3, "Kevin", "John", "Smith", "Mario");
       System.out.println(va.max(3,4,77,100,32,1200,13,5,7));
       System.out.println(va.max());
    }
}