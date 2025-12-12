package JavaColectionProblems;
//HashMap for O(n)
import java.util.HashMap;
import java.util.Map;

//! nums [i] + nums[j] == target  and !O(n2) too slow?
public class TwoSumExample {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = target - nums[i];
            if (map.containsKey(current)) {
                return new int[]{
                        i, map.get(current)
                };
            }
            map.put(nums[i],i);
        }
        return new int[]{};

    }
}


//
//        // Loop through the array
//        for (int i = 0; i < nums.length; i++) {
//            int current = nums[i];
//            int complement = target - current;
//
//            // If we’ve seen the complement before
//            if (map.containsKey(complement)) {
//                // Return the indices
//                return new int[] { map.get(complement), i };
//            }
//
//            // Store current number and its index
//            map.put(current, i);
//        }
//
//        // According to the problem statement, this won't be reached
//        throw new IllegalArgumentException("No solution exists");
//    }
//}





//        //Map to store (number -> inndex)
//        Map<Integer,Integer> map = new HashMap<>();
//
//        //loop through the array
//        for (int =0; i<nums.length;i++){
//            int num = nums[i];
//            int complement = target - num;
//            // Check if we've seen the complement before
//            if  (map.containsKey(complement)){
//                // If yes, return the pair of indices
//                return new int[] {map.get(complement),i };
//
//                // Store the number and its index in the map
//                map.put(num,i);
//
//                // No solution found (though problem guarantees one)
//                throw new IllegalArgumentException("No Sum Solution");
//
//            }
//        }
//    }
//}
