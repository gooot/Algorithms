class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int t=0;
        
        answer = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        t = Integer.parseInt(Integer.toString(b)+Integer.toString(a));
        
        if(t>answer)
            answer=t;
        
        
        
        
        return answer;
    }
}