import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer={};
        ArrayList<Integer> intList = new ArrayList<>();
        
        for(int i=2;i<=n;i++){
            
            while(n%i==0){
                if(!intList.contains(i)){
                    intList.add(i);
                }
                n/=i;
            }
            
            
        }
        answer=new int[intList.size()];
        for(int i=0;i<intList.size();i++){
            answer[i]=intList.get(i);
        }
        
        return answer;
    }
}