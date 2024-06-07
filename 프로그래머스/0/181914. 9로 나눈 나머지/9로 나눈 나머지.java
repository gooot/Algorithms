class Solution {
    public int solution(String number) {
        int answer = 0;
        
        String[] number_list = number.split("");
        
        for(int i=0;i<number_list.length;i++){
            answer+=Integer.parseInt(number_list[i]);
        }
        answer=answer%9;
        return answer;
    }
}