class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (var word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            anagramGroups.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(anagramGroups.values());
    }
}
