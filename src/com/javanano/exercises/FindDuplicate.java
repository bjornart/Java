import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

    public static int findDuplicate(String input) {
        for (char c1 : input.toCharArray()) {
            System.out.println("c1: "+c1);
            for (int i = (input.indexOf(c1)+1); i<input.length(); i++){
                System.out.println("(input.indexOf(c1)+1): "+(input.indexOf(c1)+1) + " i = " + i);
                if (c1 == input.charAt(i)){
                    System.out.println("input.charAt(i): "+input.charAt(i));
                    return i;
                }
            }
        }
        return -1;
    }

    public static int findDuplicateUsingSet(String input){
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < input.length(); i++){
            if(seen.contains(input.charAt(i))) return i;
            else seen.add(input.charAt(i));
        }
        return -1;
    }

    public static void main (String args[]){
        String s = "abcdefabc";
        long t1Start = System.currentTimeMillis();
        int stringIndex = findDuplicate(s);
        long t1End = System.currentTimeMillis();

        long t2Start= System.currentTimeMillis();
        int stringIndexUsingSet = findDuplicateUsingSet(s);
        long t2End = System.currentTimeMillis();

        System.out.println("findDuplicate using for loop: " +stringIndex + ", computing time (ms): " + (t1End - t1Start));
        System.out.println("findDuplicate using HashSet: " +stringIndexUsingSet + ", computing time (ms): " + (t2End - t2Start));
    }

}
