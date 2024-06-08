class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i=0;i<answer.length;i++){
            int c=0;
            for(int j=0;j<my_string.length();j++){
                
                if(my_string.charAt(j)==('A'+i) && i<26)
                    c++;
                if(my_string.charAt(j)==('a'+i-26) && i>25 )
                    c++;
                
                
                
            }
            answer[i]=c;
            
        }
        
        
        
        
        
        return answer;
    }
}