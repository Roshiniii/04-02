    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here\
    int pairs = 0;
    Map<Integer,Integer> map = new HashMap<>();
    for(Integer num : ar){
        map.put(num,map.getOrDefault(num,0)+1);
    }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int a = e.getValue();
            pairs = pairs + a/2 ; 
        }
    return pairs;
    }
