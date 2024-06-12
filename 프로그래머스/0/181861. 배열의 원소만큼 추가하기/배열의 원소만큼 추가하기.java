import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        List<Integer> intList = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                intList.add(arr[i]);
            }
        }
        
        answer= new int[intList.size()];
        
        for(int i=0;i<intList.size();i++){
            answer[i]=(int)intList.get(i);
        }
        
        return answer;
    }
}