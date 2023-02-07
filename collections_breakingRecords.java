public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        int max = scores.get(0);
        int min = scores.get(0);
        int a=0,b=0;
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<scores.size();i++){
            if(scores.get(i)>max){
                max = scores.get(i);
                a++;
            }
            
            if( scores.get(i) < min){
                min = scores.get(i);
                 b++;
            }
        }
        l.add(a);
        l.add(b);
        return l;

    }
