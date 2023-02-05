import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Set<Character> set = new LinkedHashSet<>();
        for(int i = 0;i<input.length();i++){
            set.add(input.charAt(i));
        }
        for(Character c : set){
            System.out.print(c);
        }
        
    }
}
