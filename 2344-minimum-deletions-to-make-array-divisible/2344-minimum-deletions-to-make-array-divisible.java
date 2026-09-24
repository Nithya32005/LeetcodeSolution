import java.util.*;

class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {

        // Find GCD of all elements in numsDivide
        int g = numsDivide[0];

        for (int i = 1; i < numsDivide.length; i++) {
            g = gcd(g, numsDivide[i]);
        }

        // Sort nums
        Arrays.sort(nums);

        // Find the first number that divides GCD
        for (int i = 0; i < nums.length; i++) {
            if (g % nums[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    // GCD method
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
