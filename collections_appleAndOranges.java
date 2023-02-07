public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
        int a_count=0,o_count=0;
        for(int apple : apples){
            if(a+apple>=s && a+apple<=t){
                a_count++;
        }
        }
        for(int orange : oranges){
            if(b+orange >= s && b+orange <= t){
                o_count++;
        }
        }
       System.out.println(a_count);
       System.out.println(o_count);
    }
