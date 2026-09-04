class Solution {
    public boolean hasDuplicate(int[] nums) {
        // init HashSet
        var occurances = new HashSet<Integer>();

        // iterate over nums
        for (var num : nums) {
            // if nums[i] is inside HashSet, return true
            if (occurances.contains(num)) {
                return true;    
            }

            // else add and continue
            occurances.add(num);
        }

        return false;
    }
}