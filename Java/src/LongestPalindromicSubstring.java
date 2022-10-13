public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        if(s.length() > 1000 || s.length() < 1){
            return null;
        }

        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            //StringBuffer sb = new StringBuffer();
            //sb.append(s.charAt[i]);
            char c = s.charAt(i);
            int left = i;
            int right = i;

            while (left >= 0 && s.charAt(left) == c) {
                left--;
            }

            while (right < s.length() && s.charAt(right) == c) {
                right++;
            }

            while (left >= 0 && right < s.length()) {
                if (s.charAt(left) != s.charAt(right)) {
                    break;
                }
                left--;
                right++;
            }


        // left + 1 and right - 1 are actually the start and end index of the Palindromic string
        // we don't set "right" because String.substring function required end index exclusively
            left = left + 1;
            if (end - start < right - left) {
                start = left;
                end = right;
            }
        }

        return s.substring(start, end);
    }

    /*
     * This is a diffrent approach but takes too much time because of the time-complexity of the loops
     * But it is way much easier to understand and to follow
     */

    /* 
        String result = "";
        String tmp = "";

        // loop over String and split it up into every possible substring
        // then checks if its a palindrome and if the palindrome is larger than the one before
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                tmp = s.substring(i, j);
                if(isPalindrome(tmp) && tmp.length() > result.length()){
                    result = tmp;
                }
            }
        }

        System.out.println(result);
        return result;
        
    }

    //
    //Checks if a String is a palindorme
     
    public boolean isPalindrome(String original){
        String reverse = ""; 
        int n = original.length();
        
        // Just reverses the String by starting at the end of the String
        // and concat the characters
        for (int i = n-1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        
        // if the reverse-String equals the originial we know its a palindrome
        if(original.equals(reverse)){
            //System.out.println("True");
            return true;
        }

        return false;
    }
    */
    

    public static void main(String[] args) {
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();
        String s = "babad";
        //String v = "aba";
        //l.isPalindrome(v);
        l.longestPalindrome(s);
        
    }
}
