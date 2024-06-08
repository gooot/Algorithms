class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] suf = new String[my_string.length()];
        
        for(int i=0;i<my_string.length();i++){
            // suf[i] = my_string.substring(i);
            if(my_string.substring(i).equals(is_suffix)){
                answer=1;
            }
            
            
        }
        
        
        
        
        return answer;
    }
}