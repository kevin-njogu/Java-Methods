/*
*Method overloading is having more than one method with the same method name
* However, the methods must be differentiated by their parameters list
* The difference can be number of parameters, data type of parameters
 */

public class MethodOverloading {
    //overloaded max method
    int max(int a, int b) {
        return Math.max(a, b);
    }

    int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }else if (b > c) {
            return b;
        }
        return c;
    }

    float max(float a, float b) {
        return Math.max(a, b);
    }

    //Overloaded area method
    float area(float length, float breadth) {
        return length * breadth;
    }

    float area (float radius) {
        return (float) (Math.PI*radius*radius);
    }

    //Overloaded reverse method
    void reverse(int number) {
        String num = Integer.toString(number);
        StringBuilder reversed = new StringBuilder();
        for (int i = num.length() - 1; i >= 0; i--) {
            reversed.append(num.charAt(i));
        }
        System.out.println(reversed.toString());
    }

    void reverse(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[arr.length - 1 - i] = arr[i];
        }
        for (int i: newArr) {
            System.out.println(i);
        }
    }

}
