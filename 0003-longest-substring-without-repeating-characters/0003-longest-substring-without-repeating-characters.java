class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character, Integer> map = new HashMap<>();

       int left = 0;
       int ans = 0;

       for (int right = 0; right < s.length(); right++) {
        char ch = s.charAt(right);
        map.put(ch, map.getOrDefault(ch, 0) + 1);

        while (map.get(ch) > 1) {
            char leftChar = s.charAt(left);

            map.put(leftChar, map.get(leftChar)-1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
            left++;
        }
        ans = Math.max(ans, right - left + 1);
       }
       return ans;
    }
}