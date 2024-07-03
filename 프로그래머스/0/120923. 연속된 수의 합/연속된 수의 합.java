class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = total/(num+1);
        
        while(true){
            int sum=0;
            for(int i=start;i<start+num;i++){
                sum+=i;
            }
            if(sum==total){ 
                break;
            }
            if(sum>total){
                start--;
            } else if(sum<total){
                start++;
            }
        }
        
        for(int i=0;i<num;i++){
            answer[i]=start+i;
        }
        
        return answer;
    }
}