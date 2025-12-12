package neetcode;
//at least twice
//[1,2,3,1]= compare to each number next-> O(n)= time compexicit O(n2)
//Second Option. Sort iterate trough arrays [1,1,2,3)-Time complexity= O(nlogn);Space: 0(1)

//Third Option = HashSet
//if we determine that 1 is Duplicate so we add to "HashSet"->Time Complexcity O(n), Space ComplexityO(n)


//1. Brute Force
//
//Time & Space Complexity
//Time complexity: O(n2)
//Space complexity:O(1)

public class hasDuplicate {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}


//2. Sorting

"""
Time & Space Complexity
Time complexity: O(nlogn)
Space complexity:O(1) or O(n) depending on the sorting algorithm.
"""
public class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}

//3. Hash Set

"""
Time & Space Complexity
Time complexity: O(n)
Space complexity:O(n)
"""
public class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
//3. Hash Set Length

"""
Time & Space Complexity
Time complexity: O(n)
Space complexity:O(n)
"""
public class Solution {
    public boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}