import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        int count = 0;
        Queue<String> queue = new LinkedList<>();
        Set<String> set = new HashSet<>();
        queue.add(beginWord);
        while(!queue.isEmpty()) {
           count++;
           int size = queue.size();
            for (int i = 0; i < size; i++) {
                String start = queue.poll();
                for (String s : wordList) {
                    if (set.contains(s)) {
                        continue;
                    }
                    if (!isConv(start, s)){
                        continue;
                    }
                    if (s.equals(endWord)) {
                        return ++count;
                    }
                    queue.add(s);
                    set.add(s);
                }
            }
        }
        return 0;
    }

    public boolean isConv(String start, String find) {
        if (start.length() != find.length()) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) != find.charAt(i)) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
