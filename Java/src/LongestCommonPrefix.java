package Java.src;
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 1){
            return strs[0];
        }

        //constraints
        if((strs.length < 1) || (strs.length >= 200)){
            return "";
        }
        
        /*
         * get first word
         * get first character of this word
         * if this character equals every first character of each word in array
         * --> proceed
        */
        
        String result = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(result) != 0){
                result = result.substring(0, result.length() - 1);
                if(result.isEmpty()){
                    return "";
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};

        LongestCommonPrefix lcp = new LongestCommonPrefix();

        System.out.println(lcp.longestCommonPrefix(str));
    }
}