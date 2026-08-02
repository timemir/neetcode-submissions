class Solution {
    public int maxArea(int[] heights) {
        // Two Pointer Solution
        // Pattern: Converging Pointers

        var left = 0;
        var right = heights.length - 1;

        var max = 0;

        while (left < right){
            var barL = heights[left];
            var barR = heights[right];
            var distance = right - left;

            max = Math.max(max, distance * Math.min(barL, barR));

            // It only makes sense to move the lower bar, 
            // in order to greed that the next bar might be higher.
            if (barL > barR){
                right--;
                continue;
            }

            left++;
        }

        return max;
    }
}
