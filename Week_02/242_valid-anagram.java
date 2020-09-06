// 直接排序
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
}

// Hash表
class Solution1 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length ;i++) {
            if (map.containsKey(s1[i])) {
                map.put(s1[i], map.get(s1[i]) + 1);
            }else{
                map.put(s1[i], 1);
            }
        }
        for (int i = 0; i < s2.length; i++) {
            if (!map.containsKey(s2[i])){
                return false;
            }
            int val= map.get(s2[i]);
            map.put(s2[i], val - 1);
            if (val == 1) {
                map.remove(s2[i]);
            }
        }
        return true;
    }
}

// Hash 优化1
class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false
        }
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char item : s1) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        for (char item : s2) {
            if (map.getOrDefault(item, 0) == 0) {
                return false;
            }
            map.put(item, map.getOrDefault(item, 0) -1);
        }
        return true;
    }
}


class Solution3 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (int i= 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int i : arr) {
            if (i != 0 ) {
                return false;
            }
        }
        return true;
    }
}
