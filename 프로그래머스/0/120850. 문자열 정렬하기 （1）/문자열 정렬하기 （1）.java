import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        my_string=my_string.replaceAll("[a-z]","");
        
        String[] arr = my_string.split("");
        answer= new int[arr.length];
        
        for(int i=0;i< arr.length;i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);
        
        
        return answer;
    }
}