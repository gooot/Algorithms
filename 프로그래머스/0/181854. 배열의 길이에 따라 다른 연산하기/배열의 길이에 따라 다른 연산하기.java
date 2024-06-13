class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        int chk=0;
        if(arr.length%2==1){ 
            chk=1;
        }
        
        for(int i=0;i<arr.length;i++){
            if((i+chk)%2==1){
                answer[i]=arr[i]+n;
                
            } else {
                answer[i]=arr[i];
            }
            
        }
        
        return answer;
    }
}