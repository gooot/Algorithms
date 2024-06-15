class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr;
        my_string=my_string.replaceAll("[^\\d]"," ");
        
        strArr=my_string.split(" ");
        
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].isEmpty()){
                answer+=Integer.parseInt(strArr[i]);
            }
        }
            
        return answer;
    }
}