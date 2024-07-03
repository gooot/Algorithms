class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] strArr = {"aya", "ye", "woo", "ma" };
        
        for(int i=0;i<babbling.length;i++){
            String word=babbling[i];
            for(int j=0;j<strArr.length;j++){
                word=word.replace(strArr[j]," ");
             
            }
            word=word.replaceAll("[\\s*]","");
            
            if(word.equals("")){ 
                answer++;
            }
            
        }
        
        
        
        
        
        return answer;
    }
}