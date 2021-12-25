import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s =new HashSet<>();
        for(Integer each : nums){
            if(s.contains(each))
                return true;
            s.add(each);
        }
        return false;
    }
}