import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer,Integer> groupCount = new HashMap<>();
        int length=0;
        
        for(String str : strArr){
            length = str.length();
            groupCount.put(length, groupCount.getOrDefault(length,0)+1);
        }
        
        int max=0;
        for(int groupSize : groupCount.values()){
            max = Math.max(max, groupSize);
        }
        
        
        
        return answer=max;
    }
}