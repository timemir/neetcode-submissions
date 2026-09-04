class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        var occurancesWordOne = new TreeMap<Character, Integer>();
        var occurancesWordTwo = new TreeMap<Character, Integer>();

        for (var c : s.toCharArray()) {
            occurancesWordOne.put(c, occurancesWordOne.getOrDefault(c, 0) + 1);
        }

        for (var c : t.toCharArray()) {
            occurancesWordTwo.put(c, occurancesWordTwo.getOrDefault(c, 0) + 1);
        }

        return occurancesWordTwo.equals(occurancesWordOne);
    }
}