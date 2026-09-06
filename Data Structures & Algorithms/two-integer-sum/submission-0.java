class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i <= nums.length; i++) {
            var complement = target - nums[i];

            if (!seen.containsKey(complement)) {
                seen.put(nums[i], i);
            } else {
                return new int[] {seen.get(complement), i};
            }
        }

        return new int[] {0, 0};
    }
}
