/*
*Variable arguments allow the passing of an unknown number of arguments
* Variable arguments support array objects also
* Variable arguments can also be used in public void static main(String ...args)
* We can pass an array as a variable argument methodName(new[] int{2,3,4,5,5})
* However we can not pass an array reference as a parameter for variable arguments
* You can call a method with empty variable args and hence the args array will be empty
 */

public class VariableArguments {
    //... converts variables passed to an array
    void show(int ...x) {
        for (int i: x) {
            System.out.println(i);
        }
    }

    void getNames(int startNum, String ...names) {
        for (String name: names) {
            System.out.println(startNum + " . " + name);
            startNum++;
        }
    }

    int max(int ...nums) {
        int max;
        if (nums.length > 1) {
            max = nums[0];
            for (int i: nums) {
                if (max < i) {
                    max = i;
                }
            }
        }else {
            max = Integer.MIN_VALUE;
        }
        return max;
    }
}
