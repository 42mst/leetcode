package Java.src;
import java.util.HashMap;
import java.util.Scanner;

class RomanToInt {
    public static int romanToInt(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int bp=0;
        int sum=map.get(s.charAt(0));
        for (int i=0;i<s.length()-1;i++){
            bp=i+1;
            if(map.get(s.charAt(i))>=map.get(s.charAt(bp))){
                sum=sum+map.get(s.charAt(bp));
            }else{
                sum = sum-map.get(s.charAt(i));
                sum=sum+(map.get(s.charAt(bp))-map.get(s.charAt(i)));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Roman Number");

            String roman = sc.nextLine();

            long startTime = System.nanoTime();
            System.out.println(romanToInt(roman));
            long endTime = System.nanoTime();
            System.out.println((endTime - startTime));
        }

    }

}