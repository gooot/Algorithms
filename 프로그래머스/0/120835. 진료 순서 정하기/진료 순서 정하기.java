import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        List<Integer> intList=new ArrayList<>();
        
        for(int i=0;i<emergency.length;i++){
            intList.add(emergency[i]);
        }
        Collections.sort(intList);
        Collections.reverse(intList);
        
        for(int i=0;i<emergency.length;i++){
            for(int j=0;j<intList.size();j++){
                if(emergency[i]==intList.get(j)){
                    answer[i]=j+1;
                }
            }
        }
        
        return answer;
    }
}