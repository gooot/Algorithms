class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        
        for(int i=0;i<dic.length;i++){
            int chk = spell.length;
            for(int j=0;j<spell.length;j++){
                if(dic[i].contains(spell[j])){
                    chk-=1;
                }
            }
            if(chk==0){
                answer=1;
            }
        }
        
        if(answer!=1){
            answer=2;
        }
        
        return answer;
    }
}