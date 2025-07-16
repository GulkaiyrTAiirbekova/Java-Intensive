package neetcode;
//at least twice
//[1,2,3,1]= compare to each number next-> O(n)= time compexicit O(n2)
//Second Option. Sort iterate trough arrays [1,1,2,3)-Time complexity= O(nlogn);Space: 0(1)

//Third Option = HashSet
//if we determine that 1 is Duplicate so we add to "HashSet"->Time Complexcity O(n), Space ComplexityO(n)


//1. Brute Force

"""
Time & Space Complexity
Time complexity: O(n2)
Space complexity:O(1)
"""
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