class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Assumption. Each character has a codepoint value.
        // If we create the sum out of the characters inside a string we get a distinct value
        // that is the same between anagrams.

        // we can store that sum as a key inside a hashmap and as value a list of items that have
        // that sum. then we can just easily return the result as the solution.

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (var word : strs) {
            var sorted = word.toCharArray();
            Arrays.sort(sorted);
            var sortedString = Arrays.toString(sorted);

            if (!anagramGroups.containsKey(sortedString)) {
                // need to init it here so the list is modifable later.
                var list = new ArrayList<String>();
                list.add(word);
                anagramGroups.put(sortedString, list);
            } else {
                var list = anagramGroups.get(sortedString);
                list.add(word);
            }
        }

        return anagramGroups.values().stream().toList();
    }
}
