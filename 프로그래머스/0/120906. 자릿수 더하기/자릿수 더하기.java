class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp=0;
        do{
            temp = n/10;
            answer += n%10;
            n=temp;
            
            
            
        } while (n!=0);
        
        
        
        return answer;
    }
}