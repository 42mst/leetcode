import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
    
        Deque<Character> deque = new LinkedList<>();
        Set<Character> chars = new HashSet<>(128);
        int result = 0;

        for (char c : s.toCharArray()) {
            Character character = Character.valueOf(c);
            if(character.equals(deque.peekFirst())){
                deque.removeFirst();
                chars.remove(character); 
            } else if(chars.contains(character)){
                Character visited = deque.pollFirst();
                while(!character.equals(visited)){
                    chars.remove(visited);
                    visited = deque.pollFirst();
                }
            }

            deque.add(character);
            chars.add(character);
            int size = deque.size();
            if (size > result) {
                result = size;
            }

        }

        return result;

    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(l.lengthOfLongestSubstring(s1));
        System.out.println(l.lengthOfLongestSubstring(s2));
        System.out.println(l.lengthOfLongestSubstring(s3));
    }
    
}