package com.hash;

import java.util.HashMap;

public class test {
    public static int[] twoSum(int[] n, int target) {
        HashMap<Integer, Integer> nums = new HashMap<>();

        int v;
        for (int i = 0; i < n.length; i++) {
            v = target - n[i];

            if (nums.containsKey(v)) {
                return new int[]{nums.get(v), i};
            }
            nums.put(n[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = twoSum(new int[]{15,7,11,2}, 9);

        for (int n : nums) {
            System.out.println(n);
        }
    }
}
