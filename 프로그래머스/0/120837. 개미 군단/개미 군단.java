class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a=0;
        int b=0;
        int c=0;
        
        a=hp/5;
        b=(hp-a*5)/3;
        c=(hp-(a*5+b*3));
        
        
        answer=a+b+c;
        
        
        return answer;
    }
}