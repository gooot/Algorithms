class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] str ={};
        
        str = myString.split("x",-1);
        answer=new int[str.length];
        
        for(int i=0;i<str.length;i++){
            answer[i]=str[i].length();
        }
        
        return answer;
    }
}