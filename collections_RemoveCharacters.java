import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s2.length();i++){
            char c2 = s2.charAt(i);
            map.put(c2,map.getOrDefault(c2,0)+1);
        }
        
        for(int i = 0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            if(!map.containsKey(c1))
                System.out.print(c1);
            else{
                map.put(c1,map.get(c1)-1);
                if(map.get(c1)==0)
                    map.remove(c1);
            }
        }
    }
}
