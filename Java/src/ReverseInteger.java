package Java.src;

public class ReverseInteger {
    public int reverse(int x) {
        /*
         * Can be done in a lots of ways.
         * I used the lazy solution for clarity.
         * Just get the String value
         * start from the last character and just reverse the whole string
         * if its a negitive number, start the string with minus
         * and to convert the string to an integer just cut of the last character
         * which is a minus
         */

        String res = "";
        if(x < 0){
            x = x * (-1);
            res = "-";
        }

        String s = String.valueOf(x);
        for (int i = s.length()-1; i >= 0; i--) {
            res = res + s.charAt(i);
        }

        if(res.charAt(res.length()-1) == '-'){
            res = res.substring(0, res.length()-1);
        }

        long n = Long.parseLong(res);
        if (n > Integer.MAX_VALUE || n <= Integer.MIN_VALUE){
            return 0;
        }
        System.out.println(res);
        return (int)n;
    }

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();

        r.reverse(123);
        

    }
}
